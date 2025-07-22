import { getVegobjekttyperQueryResponseSchema } from '../schemas/getVegobjekttyperSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjekttyperQueryResponse,
  GetVegobjekttyperQueryParams,
  GetVegobjekttyper404,
  GetVegobjekttyper500,
  GetVegobjekttyper503,
} from '../models/GetVegobjekttyper'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjekttyperClient = typeof client<
  GetVegobjekttyperQueryResponse,
  GetVegobjekttyper404 | GetVegobjekttyper500 | GetVegobjekttyper503,
  never
>
type GetVegobjekttyper = {
  data: GetVegobjekttyperQueryResponse
  error: GetVegobjekttyper404 | GetVegobjekttyper500 | GetVegobjekttyper503
  request: never
  pathParams: never
  queryParams: GetVegobjekttyperQueryParams
  headerParams: never
  response: GetVegobjekttyperQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjekttyperClient>[0]>
    return: Awaited<ReturnType<GetVegobjekttyperClient>>
  }
}
export const getVegobjekttyperQueryKey = (
  params?: GetVegobjekttyper['queryParams'],
) => [{ url: '/api/v1/vegobjekttyper' }, ...(params ? [params] : [])] as const
export type GetVegobjekttyperQueryKey = ReturnType<
  typeof getVegobjekttyperQueryKey
>
export function getVegobjekttyperQueryOptions(
  params?: GetVegobjekttyper['queryParams'],
  options: GetVegobjekttyper['client']['parameters'] = {},
) {
  const queryKey = getVegobjekttyperQueryKey(params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjekttyper['data'],
        GetVegobjekttyper['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper`,
        params,
        ...options,
      })
      return getVegobjekttyperQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle vegobjekttypene
 * @link /api/v1/vegobjekttyper */
export function useGetVegobjekttyper<
  TData = GetVegobjekttyper['response'],
  TQueryData = GetVegobjekttyper['response'],
  TQueryKey extends QueryKey = GetVegobjekttyperQueryKey,
>(
  params?: GetVegobjekttyper['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjekttyper['response'],
        GetVegobjekttyper['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjekttyper['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjekttyper['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey = queryOptions?.queryKey ?? getVegobjekttyperQueryKey(params)
  const query = useQuery({
    ...(getVegobjekttyperQueryOptions(
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjekttyper['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjekttyperSuspenseQueryKey = (
  params?: GetVegobjekttyper['queryParams'],
) => [{ url: '/api/v1/vegobjekttyper' }, ...(params ? [params] : [])] as const
export type GetVegobjekttyperSuspenseQueryKey = ReturnType<
  typeof getVegobjekttyperSuspenseQueryKey
>
export function getVegobjekttyperSuspenseQueryOptions(
  params?: GetVegobjekttyper['queryParams'],
  options: GetVegobjekttyper['client']['parameters'] = {},
) {
  const queryKey = getVegobjekttyperSuspenseQueryKey(params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjekttyper['data'],
        GetVegobjekttyper['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper`,
        params,
        ...options,
      })
      return getVegobjekttyperQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle vegobjekttypene
 * @link /api/v1/vegobjekttyper */
export function useGetVegobjekttyperSuspense<
  TData = GetVegobjekttyper['response'],
  TQueryKey extends QueryKey = GetVegobjekttyperSuspenseQueryKey,
>(
  params?: GetVegobjekttyper['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjekttyper['response'],
        GetVegobjekttyper['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjekttyper['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjekttyper['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ?? getVegobjekttyperSuspenseQueryKey(params)
  const query = useSuspenseQuery({
    ...(getVegobjekttyperSuspenseQueryOptions(
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjekttyper['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
