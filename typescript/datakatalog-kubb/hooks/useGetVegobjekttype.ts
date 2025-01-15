import { getVegobjekttypeQueryResponseSchema } from '../schemas/getVegobjekttypeSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjekttypeQueryResponse,
  GetVegobjekttypePathParams,
  GetVegobjekttypeQueryParams,
  GetVegobjekttype404,
  GetVegobjekttype500,
  GetVegobjekttype503,
} from '../models/GetVegobjekttype'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjekttypeClient = typeof client<
  GetVegobjekttypeQueryResponse,
  GetVegobjekttype404 | GetVegobjekttype500 | GetVegobjekttype503,
  never
>
type GetVegobjekttype = {
  data: GetVegobjekttypeQueryResponse
  error: GetVegobjekttype404 | GetVegobjekttype500 | GetVegobjekttype503
  request: never
  pathParams: GetVegobjekttypePathParams
  queryParams: GetVegobjekttypeQueryParams
  headerParams: never
  response: GetVegobjekttypeQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjekttypeClient>[0]>
    return: Awaited<ReturnType<GetVegobjekttypeClient>>
  }
}
export const getVegobjekttypeQueryKey = (
  vegobjekttypeid: GetVegobjekttypePathParams['vegobjekttypeid'],
  params?: GetVegobjekttype['queryParams'],
) =>
  [
    {
      url: '/api/v1/vegobjekttyper/:vegobjekttypeid',
      params: { vegobjekttypeid: vegobjekttypeid },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjekttypeQueryKey = ReturnType<
  typeof getVegobjekttypeQueryKey
>
export function getVegobjekttypeQueryOptions(
  vegobjekttypeid: GetVegobjekttypePathParams['vegobjekttypeid'],
  params?: GetVegobjekttype['queryParams'],
  options: GetVegobjekttype['client']['parameters'] = {},
) {
  const queryKey = getVegobjekttypeQueryKey(vegobjekttypeid, params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjekttype['data'],
        GetVegobjekttype['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper/${vegobjekttypeid}`,
        params,
        ...options,
      })
      return getVegobjekttypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer angitt vegobjekttype
 * @link /api/v1/vegobjekttyper/:vegobjekttypeid
 */
export function useGetVegobjekttype<
  TData = GetVegobjekttype['response'],
  TQueryData = GetVegobjekttype['response'],
  TQueryKey extends QueryKey = GetVegobjekttypeQueryKey,
>(
  vegobjekttypeid: GetVegobjekttypePathParams['vegobjekttypeid'],
  params?: GetVegobjekttype['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjekttype['response'],
        GetVegobjekttype['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjekttype['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjekttype['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ?? getVegobjekttypeQueryKey(vegobjekttypeid, params)
  const query = useQuery({
    ...(getVegobjekttypeQueryOptions(
      vegobjekttypeid,
      params,
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjekttype['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjekttypeSuspenseQueryKey = (
  vegobjekttypeid: GetVegobjekttypePathParams['vegobjekttypeid'],
  params?: GetVegobjekttype['queryParams'],
) =>
  [
    {
      url: '/api/v1/vegobjekttyper/:vegobjekttypeid',
      params: { vegobjekttypeid: vegobjekttypeid },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjekttypeSuspenseQueryKey = ReturnType<
  typeof getVegobjekttypeSuspenseQueryKey
>
export function getVegobjekttypeSuspenseQueryOptions(
  vegobjekttypeid: GetVegobjekttypePathParams['vegobjekttypeid'],
  params?: GetVegobjekttype['queryParams'],
  options: GetVegobjekttype['client']['parameters'] = {},
) {
  const queryKey = getVegobjekttypeSuspenseQueryKey(vegobjekttypeid, params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjekttype['data'],
        GetVegobjekttype['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper/${vegobjekttypeid}`,
        params,
        ...options,
      })
      return getVegobjekttypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer angitt vegobjekttype
 * @link /api/v1/vegobjekttyper/:vegobjekttypeid
 */
export function useGetVegobjekttypeSuspense<
  TData = GetVegobjekttype['response'],
  TQueryKey extends QueryKey = GetVegobjekttypeSuspenseQueryKey,
>(
  vegobjekttypeid: GetVegobjekttypePathParams['vegobjekttypeid'],
  params?: GetVegobjekttype['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjekttype['response'],
        GetVegobjekttype['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjekttype['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjekttype['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjekttypeSuspenseQueryKey(vegobjekttypeid, params)
  const query = useSuspenseQuery({
    ...(getVegobjekttypeSuspenseQueryOptions(
      vegobjekttypeid,
      params,
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjekttype['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
