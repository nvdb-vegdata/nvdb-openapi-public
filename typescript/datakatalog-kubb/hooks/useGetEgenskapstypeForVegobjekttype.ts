import { getEgenskapstypeForVegobjekttypeQueryResponseSchema } from '../schemas/getEgenskapstypeForVegobjekttypeSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetEgenskapstypeForVegobjekttypeQueryResponse,
  GetEgenskapstypeForVegobjekttypePathParams,
  GetEgenskapstypeForVegobjekttype404,
  GetEgenskapstypeForVegobjekttype500,
  GetEgenskapstypeForVegobjekttype503,
} from '../models/GetEgenskapstypeForVegobjekttype'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetEgenskapstypeForVegobjekttypeClient = typeof client<
  GetEgenskapstypeForVegobjekttypeQueryResponse,
  | GetEgenskapstypeForVegobjekttype404
  | GetEgenskapstypeForVegobjekttype500
  | GetEgenskapstypeForVegobjekttype503,
  never
>
type GetEgenskapstypeForVegobjekttype = {
  data: GetEgenskapstypeForVegobjekttypeQueryResponse
  error:
    | GetEgenskapstypeForVegobjekttype404
    | GetEgenskapstypeForVegobjekttype500
    | GetEgenskapstypeForVegobjekttype503
  request: never
  pathParams: GetEgenskapstypeForVegobjekttypePathParams
  queryParams: never
  headerParams: never
  response: GetEgenskapstypeForVegobjekttypeQueryResponse
  client: {
    parameters: Partial<Parameters<GetEgenskapstypeForVegobjekttypeClient>[0]>
    return: Awaited<ReturnType<GetEgenskapstypeForVegobjekttypeClient>>
  }
}
export const getEgenskapstypeForVegobjekttypeQueryKey = (
  vegobjekttypeid: GetEgenskapstypeForVegobjekttypePathParams['vegobjekttypeid'],
  egenskapstypeid: GetEgenskapstypeForVegobjekttypePathParams['egenskapstypeid'],
) =>
  [
    {
      url: '/api/v1/vegobjekttyper/:vegobjekttypeid/:egenskapstypeid',
      params: {
        vegobjekttypeid: vegobjekttypeid,
        egenskapstypeid: egenskapstypeid,
      },
    },
  ] as const
export type GetEgenskapstypeForVegobjekttypeQueryKey = ReturnType<
  typeof getEgenskapstypeForVegobjekttypeQueryKey
>
export function getEgenskapstypeForVegobjekttypeQueryOptions(
  vegobjekttypeid: GetEgenskapstypeForVegobjekttypePathParams['vegobjekttypeid'],
  egenskapstypeid: GetEgenskapstypeForVegobjekttypePathParams['egenskapstypeid'],
  options: GetEgenskapstypeForVegobjekttype['client']['parameters'] = {},
) {
  const queryKey = getEgenskapstypeForVegobjekttypeQueryKey(
    vegobjekttypeid,
    egenskapstypeid,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetEgenskapstypeForVegobjekttype['data'],
        GetEgenskapstypeForVegobjekttype['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper/${vegobjekttypeid}/${egenskapstypeid}`,
        ...options,
      })
      return getEgenskapstypeForVegobjekttypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer angitt egenskapstype for angitt vegobjekttype
 * @link /api/v1/vegobjekttyper/:vegobjekttypeid/:egenskapstypeid
 */
export function useGetEgenskapstypeForVegobjekttype<
  TData = GetEgenskapstypeForVegobjekttype['response'],
  TQueryData = GetEgenskapstypeForVegobjekttype['response'],
  TQueryKey extends QueryKey = GetEgenskapstypeForVegobjekttypeQueryKey,
>(
  vegobjekttypeid: GetEgenskapstypeForVegobjekttypePathParams['vegobjekttypeid'],
  egenskapstypeid: GetEgenskapstypeForVegobjekttypePathParams['egenskapstypeid'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetEgenskapstypeForVegobjekttype['response'],
        GetEgenskapstypeForVegobjekttype['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetEgenskapstypeForVegobjekttype['client']['parameters']
  } = {},
): UseQueryResult<TData, GetEgenskapstypeForVegobjekttype['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getEgenskapstypeForVegobjekttypeQueryKey(vegobjekttypeid, egenskapstypeid)
  const query = useQuery({
    ...(getEgenskapstypeForVegobjekttypeQueryOptions(
      vegobjekttypeid,
      egenskapstypeid,
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetEgenskapstypeForVegobjekttype['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getEgenskapstypeForVegobjekttypeSuspenseQueryKey = (
  vegobjekttypeid: GetEgenskapstypeForVegobjekttypePathParams['vegobjekttypeid'],
  egenskapstypeid: GetEgenskapstypeForVegobjekttypePathParams['egenskapstypeid'],
) =>
  [
    {
      url: '/api/v1/vegobjekttyper/:vegobjekttypeid/:egenskapstypeid',
      params: {
        vegobjekttypeid: vegobjekttypeid,
        egenskapstypeid: egenskapstypeid,
      },
    },
  ] as const
export type GetEgenskapstypeForVegobjekttypeSuspenseQueryKey = ReturnType<
  typeof getEgenskapstypeForVegobjekttypeSuspenseQueryKey
>
export function getEgenskapstypeForVegobjekttypeSuspenseQueryOptions(
  vegobjekttypeid: GetEgenskapstypeForVegobjekttypePathParams['vegobjekttypeid'],
  egenskapstypeid: GetEgenskapstypeForVegobjekttypePathParams['egenskapstypeid'],
  options: GetEgenskapstypeForVegobjekttype['client']['parameters'] = {},
) {
  const queryKey = getEgenskapstypeForVegobjekttypeSuspenseQueryKey(
    vegobjekttypeid,
    egenskapstypeid,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetEgenskapstypeForVegobjekttype['data'],
        GetEgenskapstypeForVegobjekttype['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper/${vegobjekttypeid}/${egenskapstypeid}`,
        ...options,
      })
      return getEgenskapstypeForVegobjekttypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer angitt egenskapstype for angitt vegobjekttype
 * @link /api/v1/vegobjekttyper/:vegobjekttypeid/:egenskapstypeid
 */
export function useGetEgenskapstypeForVegobjekttypeSuspense<
  TData = GetEgenskapstypeForVegobjekttype['response'],
  TQueryKey extends QueryKey = GetEgenskapstypeForVegobjekttypeSuspenseQueryKey,
>(
  vegobjekttypeid: GetEgenskapstypeForVegobjekttypePathParams['vegobjekttypeid'],
  egenskapstypeid: GetEgenskapstypeForVegobjekttypePathParams['egenskapstypeid'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetEgenskapstypeForVegobjekttype['response'],
        GetEgenskapstypeForVegobjekttype['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetEgenskapstypeForVegobjekttype['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetEgenskapstypeForVegobjekttype['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getEgenskapstypeForVegobjekttypeSuspenseQueryKey(
      vegobjekttypeid,
      egenskapstypeid,
    )
  const query = useSuspenseQuery({
    ...(getEgenskapstypeForVegobjekttypeSuspenseQueryOptions(
      vegobjekttypeid,
      egenskapstypeid,
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<
    TData,
    GetEgenskapstypeForVegobjekttype['error']
  > & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
