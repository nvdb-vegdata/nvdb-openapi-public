import { getVegobjektById1QueryResponseSchema } from '../schemas/getVegobjektById1Schema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjektById1QueryResponse,
  GetVegobjektById1PathParams,
  GetVegobjektById1QueryParams,
  GetVegobjektById1400,
  GetVegobjektById1401,
  GetVegobjektById1403,
  GetVegobjektById1404,
  GetVegobjektById1500,
} from '../models/GetVegobjektById1'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjektById1Client = typeof client<
  GetVegobjektById1QueryResponse,
  | GetVegobjektById1400
  | GetVegobjektById1401
  | GetVegobjektById1403
  | GetVegobjektById1404
  | GetVegobjektById1500,
  never
>
type GetVegobjektById1 = {
  data: GetVegobjektById1QueryResponse
  error:
    | GetVegobjektById1400
    | GetVegobjektById1401
    | GetVegobjektById1403
    | GetVegobjektById1404
    | GetVegobjektById1500
  request: never
  pathParams: GetVegobjektById1PathParams
  queryParams: GetVegobjektById1QueryParams
  headerParams: never
  response: GetVegobjektById1QueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjektById1Client>[0]>
    return: Awaited<ReturnType<GetVegobjektById1Client>>
  }
}
export const getVegobjektById1QueryKey = (
  vegobjekttypeId: GetVegobjektById1PathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektById1PathParams['vegobjektId'],
  params?: GetVegobjektById1['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId',
      params: { vegobjekttypeId: vegobjekttypeId, vegobjektId: vegobjektId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektById1QueryKey = ReturnType<
  typeof getVegobjektById1QueryKey
>
export function getVegobjektById1QueryOptions(
  vegobjekttypeId: GetVegobjektById1PathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektById1PathParams['vegobjektId'],
  params?: GetVegobjektById1['queryParams'],
  options: GetVegobjektById1['client']['parameters'] = {},
) {
  const queryKey = getVegobjektById1QueryKey(
    vegobjekttypeId,
    vegobjektId,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektById1['data'],
        GetVegobjektById1['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}`,
        params,
        ...options,
      })
      return getVegobjektById1QueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent gjeldende versjon av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId */
export function useGetVegobjektById1<
  TData = GetVegobjektById1['response'],
  TQueryData = GetVegobjektById1['response'],
  TQueryKey extends QueryKey = GetVegobjektById1QueryKey,
>(
  vegobjekttypeId: GetVegobjektById1PathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektById1PathParams['vegobjektId'],
  params?: GetVegobjektById1['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjektById1['response'],
        GetVegobjektById1['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjektById1['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjektById1['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektById1QueryKey(vegobjekttypeId, vegobjektId, params)
  const query = useQuery({
    ...(getVegobjektById1QueryOptions(
      vegobjekttypeId,
      vegobjektId,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjektById1['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjektById1SuspenseQueryKey = (
  vegobjekttypeId: GetVegobjektById1PathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektById1PathParams['vegobjektId'],
  params?: GetVegobjektById1['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId',
      params: { vegobjekttypeId: vegobjekttypeId, vegobjektId: vegobjektId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektById1SuspenseQueryKey = ReturnType<
  typeof getVegobjektById1SuspenseQueryKey
>
export function getVegobjektById1SuspenseQueryOptions(
  vegobjekttypeId: GetVegobjektById1PathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektById1PathParams['vegobjektId'],
  params?: GetVegobjektById1['queryParams'],
  options: GetVegobjektById1['client']['parameters'] = {},
) {
  const queryKey = getVegobjektById1SuspenseQueryKey(
    vegobjekttypeId,
    vegobjektId,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektById1['data'],
        GetVegobjektById1['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}`,
        params,
        ...options,
      })
      return getVegobjektById1QueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent gjeldende versjon av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId */
export function useGetVegobjektById1Suspense<
  TData = GetVegobjektById1['response'],
  TQueryKey extends QueryKey = GetVegobjektById1SuspenseQueryKey,
>(
  vegobjekttypeId: GetVegobjektById1PathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektById1PathParams['vegobjektId'],
  params?: GetVegobjektById1['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjektById1['response'],
        GetVegobjektById1['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjektById1['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjektById1['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektById1SuspenseQueryKey(vegobjekttypeId, vegobjektId, params)
  const query = useSuspenseQuery({
    ...(getVegobjektById1SuspenseQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjektById1['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
