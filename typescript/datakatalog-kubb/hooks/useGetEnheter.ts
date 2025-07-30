import { getEnheterQueryResponseSchema } from '../schemas/getEnheterSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetEnheterQueryResponse,
  GetEnheter404,
  GetEnheter500,
  GetEnheter503,
} from '../models/GetEnheter'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetEnheterClient = typeof client<
  GetEnheterQueryResponse,
  GetEnheter404 | GetEnheter500 | GetEnheter503,
  never
>
type GetEnheter = {
  data: GetEnheterQueryResponse
  error: GetEnheter404 | GetEnheter500 | GetEnheter503
  request: never
  pathParams: never
  queryParams: never
  headerParams: never
  response: GetEnheterQueryResponse
  client: {
    parameters: Partial<Parameters<GetEnheterClient>[0]>
    return: Awaited<ReturnType<GetEnheterClient>>
  }
}
export const getEnheterQueryKey = () => [{ url: '/api/v1/enheter' }] as const
export type GetEnheterQueryKey = ReturnType<typeof getEnheterQueryKey>
export function getEnheterQueryOptions(
  options: GetEnheter['client']['parameters'] = {},
) {
  const queryKey = getEnheterQueryKey()
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<GetEnheter['data'], GetEnheter['error']>({
        method: 'get',
        url: `/api/v1/enheter`,
        ...options,
      })
      return getEnheterQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle enheter
 * @link /api/v1/enheter
 */
export function useGetEnheter<
  TData = GetEnheter['response'],
  TQueryData = GetEnheter['response'],
  TQueryKey extends QueryKey = GetEnheterQueryKey,
>(
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetEnheter['response'],
        GetEnheter['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetEnheter['client']['parameters']
  } = {},
): UseQueryResult<TData, GetEnheter['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey = queryOptions?.queryKey ?? getEnheterQueryKey()
  const query = useQuery({
    ...(getEnheterQueryOptions(
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetEnheter['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getEnheterSuspenseQueryKey = () =>
  [{ url: '/api/v1/enheter' }] as const
export type GetEnheterSuspenseQueryKey = ReturnType<
  typeof getEnheterSuspenseQueryKey
>
export function getEnheterSuspenseQueryOptions(
  options: GetEnheter['client']['parameters'] = {},
) {
  const queryKey = getEnheterSuspenseQueryKey()
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<GetEnheter['data'], GetEnheter['error']>({
        method: 'get',
        url: `/api/v1/enheter`,
        ...options,
      })
      return getEnheterQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle enheter
 * @link /api/v1/enheter
 */
export function useGetEnheterSuspense<
  TData = GetEnheter['response'],
  TQueryKey extends QueryKey = GetEnheterSuspenseQueryKey,
>(
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetEnheter['response'],
        GetEnheter['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetEnheter['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetEnheter['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey = queryOptions?.queryKey ?? getEnheterSuspenseQueryKey()
  const query = useSuspenseQuery({
    ...(getEnheterSuspenseQueryOptions(
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetEnheter['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
