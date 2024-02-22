import { getEgenskapstypeQueryResponseSchema } from '../schemas/getEgenskapstypeSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetEgenskapstypeQueryResponse,
  GetEgenskapstypePathParams,
  GetEgenskapstype404,
  GetEgenskapstype500,
  GetEgenskapstype503,
} from '../models/GetEgenskapstype'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetEgenskapstypeClient = typeof client<
  GetEgenskapstypeQueryResponse,
  GetEgenskapstype404 | GetEgenskapstype500 | GetEgenskapstype503,
  never
>
type GetEgenskapstype = {
  data: GetEgenskapstypeQueryResponse
  error: GetEgenskapstype404 | GetEgenskapstype500 | GetEgenskapstype503
  request: never
  pathParams: GetEgenskapstypePathParams
  queryParams: never
  headerParams: never
  response: GetEgenskapstypeQueryResponse
  client: {
    parameters: Partial<Parameters<GetEgenskapstypeClient>[0]>
    return: Awaited<ReturnType<GetEgenskapstypeClient>>
  }
}
export const getEgenskapstypeQueryKey = (
  egenskapstypeid: GetEgenskapstypePathParams['egenskapstypeid'],
) =>
  [
    {
      url: '/api/v1/egenskapstyper/:egenskapstypeid',
      params: { egenskapstypeid: egenskapstypeid },
    },
  ] as const
export type GetEgenskapstypeQueryKey = ReturnType<
  typeof getEgenskapstypeQueryKey
>
export function getEgenskapstypeQueryOptions(
  egenskapstypeid: GetEgenskapstypePathParams['egenskapstypeid'],
  options: GetEgenskapstype['client']['parameters'] = {},
) {
  const queryKey = getEgenskapstypeQueryKey(egenskapstypeid)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetEgenskapstype['data'],
        GetEgenskapstype['error']
      >({
        method: 'get',
        url: `/api/v1/egenskapstyper/${egenskapstypeid}`,
        ...options,
      })
      return getEgenskapstypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer angitt egenskapstype
 * @link /api/v1/egenskapstyper/:egenskapstypeid */
export function useGetEgenskapstype<
  TData = GetEgenskapstype['response'],
  TQueryData = GetEgenskapstype['response'],
  TQueryKey extends QueryKey = GetEgenskapstypeQueryKey,
>(
  egenskapstypeid: GetEgenskapstypePathParams['egenskapstypeid'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetEgenskapstype['response'],
        GetEgenskapstype['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetEgenskapstype['client']['parameters']
  } = {},
): UseQueryResult<TData, GetEgenskapstype['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ?? getEgenskapstypeQueryKey(egenskapstypeid)
  const query = useQuery({
    ...(getEgenskapstypeQueryOptions(
      egenskapstypeid,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetEgenskapstype['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getEgenskapstypeSuspenseQueryKey = (
  egenskapstypeid: GetEgenskapstypePathParams['egenskapstypeid'],
) =>
  [
    {
      url: '/api/v1/egenskapstyper/:egenskapstypeid',
      params: { egenskapstypeid: egenskapstypeid },
    },
  ] as const
export type GetEgenskapstypeSuspenseQueryKey = ReturnType<
  typeof getEgenskapstypeSuspenseQueryKey
>
export function getEgenskapstypeSuspenseQueryOptions(
  egenskapstypeid: GetEgenskapstypePathParams['egenskapstypeid'],
  options: GetEgenskapstype['client']['parameters'] = {},
) {
  const queryKey = getEgenskapstypeSuspenseQueryKey(egenskapstypeid)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetEgenskapstype['data'],
        GetEgenskapstype['error']
      >({
        method: 'get',
        url: `/api/v1/egenskapstyper/${egenskapstypeid}`,
        ...options,
      })
      return getEgenskapstypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer angitt egenskapstype
 * @link /api/v1/egenskapstyper/:egenskapstypeid */
export function useGetEgenskapstypeSuspense<
  TData = GetEgenskapstype['response'],
  TQueryKey extends QueryKey = GetEgenskapstypeSuspenseQueryKey,
>(
  egenskapstypeid: GetEgenskapstypePathParams['egenskapstypeid'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetEgenskapstype['response'],
        GetEgenskapstype['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetEgenskapstype['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetEgenskapstype['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ?? getEgenskapstypeSuspenseQueryKey(egenskapstypeid)
  const query = useSuspenseQuery({
    ...(getEgenskapstypeSuspenseQueryOptions(
      egenskapstypeid,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetEgenskapstype['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
