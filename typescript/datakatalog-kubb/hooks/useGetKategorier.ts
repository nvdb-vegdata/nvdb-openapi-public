import { getKategorierQueryResponseSchema } from '../schemas/getKategorierSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetKategorierQueryResponse,
  GetKategorier404,
  GetKategorier500,
  GetKategorier503,
} from '../models/GetKategorier'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetKategorierClient = typeof client<
  GetKategorierQueryResponse,
  GetKategorier404 | GetKategorier500 | GetKategorier503,
  never
>
type GetKategorier = {
  data: GetKategorierQueryResponse
  error: GetKategorier404 | GetKategorier500 | GetKategorier503
  request: never
  pathParams: never
  queryParams: never
  headerParams: never
  response: GetKategorierQueryResponse
  client: {
    parameters: Partial<Parameters<GetKategorierClient>[0]>
    return: Awaited<ReturnType<GetKategorierClient>>
  }
}
export const getKategorierQueryKey = () =>
  [{ url: '/api/v1/kategorier' }] as const
export type GetKategorierQueryKey = ReturnType<typeof getKategorierQueryKey>
export function getKategorierQueryOptions(
  options: GetKategorier['client']['parameters'] = {},
) {
  const queryKey = getKategorierQueryKey()
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<GetKategorier['data'], GetKategorier['error']>({
        method: 'get',
        url: `/api/v1/kategorier`,
        ...options,
      })
      return getKategorierQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle kategorier for vegobjekter
 * @link /api/v1/kategorier
 */
export function useGetKategorier<
  TData = GetKategorier['response'],
  TQueryData = GetKategorier['response'],
  TQueryKey extends QueryKey = GetKategorierQueryKey,
>(
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetKategorier['response'],
        GetKategorier['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetKategorier['client']['parameters']
  } = {},
): UseQueryResult<TData, GetKategorier['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey = queryOptions?.queryKey ?? getKategorierQueryKey()
  const query = useQuery({
    ...(getKategorierQueryOptions(
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetKategorier['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getKategorierSuspenseQueryKey = () =>
  [{ url: '/api/v1/kategorier' }] as const
export type GetKategorierSuspenseQueryKey = ReturnType<
  typeof getKategorierSuspenseQueryKey
>
export function getKategorierSuspenseQueryOptions(
  options: GetKategorier['client']['parameters'] = {},
) {
  const queryKey = getKategorierSuspenseQueryKey()
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<GetKategorier['data'], GetKategorier['error']>({
        method: 'get',
        url: `/api/v1/kategorier`,
        ...options,
      })
      return getKategorierQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle kategorier for vegobjekter
 * @link /api/v1/kategorier
 */
export function useGetKategorierSuspense<
  TData = GetKategorier['response'],
  TQueryKey extends QueryKey = GetKategorierSuspenseQueryKey,
>(
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetKategorier['response'],
        GetKategorier['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetKategorier['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetKategorier['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey = queryOptions?.queryKey ?? getKategorierSuspenseQueryKey()
  const query = useSuspenseQuery({
    ...(getKategorierSuspenseQueryOptions(
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetKategorier['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
