import { getEgenskapstypeKategorierQueryResponseSchema } from '../schemas/getEgenskapstypeKategorierSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetEgenskapstypeKategorierQueryResponse,
  GetEgenskapstypeKategorier404,
  GetEgenskapstypeKategorier500,
  GetEgenskapstypeKategorier503,
} from '../models/GetEgenskapstypeKategorier'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetEgenskapstypeKategorierClient = typeof client<
  GetEgenskapstypeKategorierQueryResponse,
  | GetEgenskapstypeKategorier404
  | GetEgenskapstypeKategorier500
  | GetEgenskapstypeKategorier503,
  never
>
type GetEgenskapstypeKategorier = {
  data: GetEgenskapstypeKategorierQueryResponse
  error:
    | GetEgenskapstypeKategorier404
    | GetEgenskapstypeKategorier500
    | GetEgenskapstypeKategorier503
  request: never
  pathParams: never
  queryParams: never
  headerParams: never
  response: GetEgenskapstypeKategorierQueryResponse
  client: {
    parameters: Partial<Parameters<GetEgenskapstypeKategorierClient>[0]>
    return: Awaited<ReturnType<GetEgenskapstypeKategorierClient>>
  }
}
export const getEgenskapstypeKategorierQueryKey = () =>
  [{ url: '/api/v1/egenskapstypekategorier' }] as const
export type GetEgenskapstypeKategorierQueryKey = ReturnType<
  typeof getEgenskapstypeKategorierQueryKey
>
export function getEgenskapstypeKategorierQueryOptions(
  options: GetEgenskapstypeKategorier['client']['parameters'] = {},
) {
  const queryKey = getEgenskapstypeKategorierQueryKey()
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetEgenskapstypeKategorier['data'],
        GetEgenskapstypeKategorier['error']
      >({
        method: 'get',
        url: `/api/v1/egenskapstypekategorier`,
        ...options,
      })
      return getEgenskapstypeKategorierQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle kategorier for egenskapstypene
 * @link /api/v1/egenskapstypekategorier
 */
export function useGetEgenskapstypeKategorier<
  TData = GetEgenskapstypeKategorier['response'],
  TQueryData = GetEgenskapstypeKategorier['response'],
  TQueryKey extends QueryKey = GetEgenskapstypeKategorierQueryKey,
>(
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetEgenskapstypeKategorier['response'],
        GetEgenskapstypeKategorier['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetEgenskapstypeKategorier['client']['parameters']
  } = {},
): UseQueryResult<TData, GetEgenskapstypeKategorier['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ?? getEgenskapstypeKategorierQueryKey()
  const query = useQuery({
    ...(getEgenskapstypeKategorierQueryOptions(
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetEgenskapstypeKategorier['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getEgenskapstypeKategorierSuspenseQueryKey = () =>
  [{ url: '/api/v1/egenskapstypekategorier' }] as const
export type GetEgenskapstypeKategorierSuspenseQueryKey = ReturnType<
  typeof getEgenskapstypeKategorierSuspenseQueryKey
>
export function getEgenskapstypeKategorierSuspenseQueryOptions(
  options: GetEgenskapstypeKategorier['client']['parameters'] = {},
) {
  const queryKey = getEgenskapstypeKategorierSuspenseQueryKey()
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetEgenskapstypeKategorier['data'],
        GetEgenskapstypeKategorier['error']
      >({
        method: 'get',
        url: `/api/v1/egenskapstypekategorier`,
        ...options,
      })
      return getEgenskapstypeKategorierQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle kategorier for egenskapstypene
 * @link /api/v1/egenskapstypekategorier
 */
export function useGetEgenskapstypeKategorierSuspense<
  TData = GetEgenskapstypeKategorier['response'],
  TQueryKey extends QueryKey = GetEgenskapstypeKategorierSuspenseQueryKey,
>(
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetEgenskapstypeKategorier['response'],
        GetEgenskapstypeKategorier['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetEgenskapstypeKategorier['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetEgenskapstypeKategorier['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ?? getEgenskapstypeKategorierSuspenseQueryKey()
  const query = useSuspenseQuery({
    ...(getEgenskapstypeKategorierSuspenseQueryOptions(
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetEgenskapstypeKategorier['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
