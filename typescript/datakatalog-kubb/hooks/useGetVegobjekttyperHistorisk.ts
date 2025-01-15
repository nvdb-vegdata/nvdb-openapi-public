import { getVegobjekttyperHistoriskQueryResponseSchema } from '../schemas/getVegobjekttyperHistoriskSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjekttyperHistoriskQueryResponse,
  GetVegobjekttyperHistoriskPathParams,
  GetVegobjekttyperHistoriskQueryParams,
  GetVegobjekttyperHistorisk404,
  GetVegobjekttyperHistorisk500,
  GetVegobjekttyperHistorisk503,
} from '../models/GetVegobjekttyperHistorisk'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjekttyperHistoriskClient = typeof client<
  GetVegobjekttyperHistoriskQueryResponse,
  | GetVegobjekttyperHistorisk404
  | GetVegobjekttyperHistorisk500
  | GetVegobjekttyperHistorisk503,
  never
>
type GetVegobjekttyperHistorisk = {
  data: GetVegobjekttyperHistoriskQueryResponse
  error:
    | GetVegobjekttyperHistorisk404
    | GetVegobjekttyperHistorisk500
    | GetVegobjekttyperHistorisk503
  request: never
  pathParams: GetVegobjekttyperHistoriskPathParams
  queryParams: GetVegobjekttyperHistoriskQueryParams
  headerParams: never
  response: GetVegobjekttyperHistoriskQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjekttyperHistoriskClient>[0]>
    return: Awaited<ReturnType<GetVegobjekttyperHistoriskClient>>
  }
}
export const getVegobjekttyperHistoriskQueryKey = (
  versjon: GetVegobjekttyperHistoriskPathParams['versjon'],
  params?: GetVegobjekttyperHistorisk['queryParams'],
) =>
  [
    {
      url: '/api/v1/vegobjekttyper/historisk/:versjon',
      params: { versjon: versjon },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjekttyperHistoriskQueryKey = ReturnType<
  typeof getVegobjekttyperHistoriskQueryKey
>
export function getVegobjekttyperHistoriskQueryOptions(
  versjon: GetVegobjekttyperHistoriskPathParams['versjon'],
  params?: GetVegobjekttyperHistorisk['queryParams'],
  options: GetVegobjekttyperHistorisk['client']['parameters'] = {},
) {
  const queryKey = getVegobjekttyperHistoriskQueryKey(versjon, params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjekttyperHistorisk['data'],
        GetVegobjekttyperHistorisk['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper/historisk/${versjon}`,
        params,
        ...options,
      })
      return getVegobjekttyperHistoriskQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
 * @link /api/v1/vegobjekttyper/historisk/:versjon
 */
export function useGetVegobjekttyperHistorisk<
  TData = GetVegobjekttyperHistorisk['response'],
  TQueryData = GetVegobjekttyperHistorisk['response'],
  TQueryKey extends QueryKey = GetVegobjekttyperHistoriskQueryKey,
>(
  versjon: GetVegobjekttyperHistoriskPathParams['versjon'],
  params?: GetVegobjekttyperHistorisk['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjekttyperHistorisk['response'],
        GetVegobjekttyperHistorisk['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjekttyperHistorisk['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjekttyperHistorisk['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjekttyperHistoriskQueryKey(versjon, params)
  const query = useQuery({
    ...(getVegobjekttyperHistoriskQueryOptions(
      versjon,
      params,
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjekttyperHistorisk['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjekttyperHistoriskSuspenseQueryKey = (
  versjon: GetVegobjekttyperHistoriskPathParams['versjon'],
  params?: GetVegobjekttyperHistorisk['queryParams'],
) =>
  [
    {
      url: '/api/v1/vegobjekttyper/historisk/:versjon',
      params: { versjon: versjon },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjekttyperHistoriskSuspenseQueryKey = ReturnType<
  typeof getVegobjekttyperHistoriskSuspenseQueryKey
>
export function getVegobjekttyperHistoriskSuspenseQueryOptions(
  versjon: GetVegobjekttyperHistoriskPathParams['versjon'],
  params?: GetVegobjekttyperHistorisk['queryParams'],
  options: GetVegobjekttyperHistorisk['client']['parameters'] = {},
) {
  const queryKey = getVegobjekttyperHistoriskSuspenseQueryKey(versjon, params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjekttyperHistorisk['data'],
        GetVegobjekttyperHistorisk['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper/historisk/${versjon}`,
        params,
        ...options,
      })
      return getVegobjekttyperHistoriskQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
 * @link /api/v1/vegobjekttyper/historisk/:versjon
 */
export function useGetVegobjekttyperHistoriskSuspense<
  TData = GetVegobjekttyperHistorisk['response'],
  TQueryKey extends QueryKey = GetVegobjekttyperHistoriskSuspenseQueryKey,
>(
  versjon: GetVegobjekttyperHistoriskPathParams['versjon'],
  params?: GetVegobjekttyperHistorisk['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjekttyperHistorisk['response'],
        GetVegobjekttyperHistorisk['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjekttyperHistorisk['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjekttyperHistorisk['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjekttyperHistoriskSuspenseQueryKey(versjon, params)
  const query = useSuspenseQuery({
    ...(getVegobjekttyperHistoriskSuspenseQueryOptions(
      versjon,
      params,
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjekttyperHistorisk['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
