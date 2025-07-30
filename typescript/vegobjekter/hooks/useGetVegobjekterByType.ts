import { getVegobjekterByTypeQueryResponseSchema } from '../schemas/getVegobjekterByTypeSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjekterByTypeQueryResponse,
  GetVegobjekterByTypePathParams,
  GetVegobjekterByTypeQueryParams,
  GetVegobjekterByType400,
  GetVegobjekterByType401,
  GetVegobjekterByType403,
  GetVegobjekterByType404,
  GetVegobjekterByType500,
} from '../models/GetVegobjekterByType'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjekterByTypeClient = typeof client<
  GetVegobjekterByTypeQueryResponse,
  | GetVegobjekterByType400
  | GetVegobjekterByType401
  | GetVegobjekterByType403
  | GetVegobjekterByType404
  | GetVegobjekterByType500,
  never
>
type GetVegobjekterByType = {
  data: GetVegobjekterByTypeQueryResponse
  error:
    | GetVegobjekterByType400
    | GetVegobjekterByType401
    | GetVegobjekterByType403
    | GetVegobjekterByType404
    | GetVegobjekterByType500
  request: never
  pathParams: GetVegobjekterByTypePathParams
  queryParams: GetVegobjekterByTypeQueryParams
  headerParams: never
  response: GetVegobjekterByTypeQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjekterByTypeClient>[0]>
    return: Awaited<ReturnType<GetVegobjekterByTypeClient>>
  }
}
export const getVegobjekterByTypeQueryKey = (
  vegobjekttypeId: GetVegobjekterByTypePathParams['vegobjekttypeId'],
  params?: GetVegobjekterByType['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId',
      params: { vegobjekttypeId: vegobjekttypeId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjekterByTypeQueryKey = ReturnType<
  typeof getVegobjekterByTypeQueryKey
>
export function getVegobjekterByTypeQueryOptions(
  vegobjekttypeId: GetVegobjekterByTypePathParams['vegobjekttypeId'],
  params?: GetVegobjekterByType['queryParams'],
  options: GetVegobjekterByType['client']['parameters'] = {},
) {
  const queryKey = getVegobjekterByTypeQueryKey(vegobjekttypeId, params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjekterByType['data'],
        GetVegobjekterByType['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}`,
        params,
        ...options,
      })
      return getVegobjekterByTypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent vegobjekter av en type
 * @link /api/v4/vegobjekter/:vegobjekttypeId
 */
export function useGetVegobjekterByType<
  TData = GetVegobjekterByType['response'],
  TQueryData = GetVegobjekterByType['response'],
  TQueryKey extends QueryKey = GetVegobjekterByTypeQueryKey,
>(
  vegobjekttypeId: GetVegobjekterByTypePathParams['vegobjekttypeId'],
  params?: GetVegobjekterByType['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjekterByType['response'],
        GetVegobjekterByType['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjekterByType['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjekterByType['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjekterByTypeQueryKey(vegobjekttypeId, params)
  const query = useQuery({
    ...(getVegobjekterByTypeQueryOptions(
      vegobjekttypeId,
      params,
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjekterByType['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjekterByTypeSuspenseQueryKey = (
  vegobjekttypeId: GetVegobjekterByTypePathParams['vegobjekttypeId'],
  params?: GetVegobjekterByType['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId',
      params: { vegobjekttypeId: vegobjekttypeId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjekterByTypeSuspenseQueryKey = ReturnType<
  typeof getVegobjekterByTypeSuspenseQueryKey
>
export function getVegobjekterByTypeSuspenseQueryOptions(
  vegobjekttypeId: GetVegobjekterByTypePathParams['vegobjekttypeId'],
  params?: GetVegobjekterByType['queryParams'],
  options: GetVegobjekterByType['client']['parameters'] = {},
) {
  const queryKey = getVegobjekterByTypeSuspenseQueryKey(vegobjekttypeId, params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjekterByType['data'],
        GetVegobjekterByType['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}`,
        params,
        ...options,
      })
      return getVegobjekterByTypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent vegobjekter av en type
 * @link /api/v4/vegobjekter/:vegobjekttypeId
 */
export function useGetVegobjekterByTypeSuspense<
  TData = GetVegobjekterByType['response'],
  TQueryKey extends QueryKey = GetVegobjekterByTypeSuspenseQueryKey,
>(
  vegobjekttypeId: GetVegobjekterByTypePathParams['vegobjekttypeId'],
  params?: GetVegobjekterByType['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjekterByType['response'],
        GetVegobjekterByType['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjekterByType['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjekterByType['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjekterByTypeSuspenseQueryKey(vegobjekttypeId, params)
  const query = useSuspenseQuery({
    ...(getVegobjekterByTypeSuspenseQueryOptions(
      vegobjekttypeId,
      params,
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjekterByType['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
