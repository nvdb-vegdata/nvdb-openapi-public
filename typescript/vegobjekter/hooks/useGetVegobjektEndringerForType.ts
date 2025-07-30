import { getVegobjektEndringerForTypeQueryResponseSchema } from '../schemas/getVegobjektEndringerForTypeSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjektEndringerForTypeQueryResponse,
  GetVegobjektEndringerForTypePathParams,
  GetVegobjektEndringerForTypeQueryParams,
  GetVegobjektEndringerForType400,
  GetVegobjektEndringerForType401,
  GetVegobjektEndringerForType403,
  GetVegobjektEndringerForType404,
  GetVegobjektEndringerForType500,
} from '../models/GetVegobjektEndringerForType'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjektEndringerForTypeClient = typeof client<
  GetVegobjektEndringerForTypeQueryResponse,
  | GetVegobjektEndringerForType400
  | GetVegobjektEndringerForType401
  | GetVegobjektEndringerForType403
  | GetVegobjektEndringerForType404
  | GetVegobjektEndringerForType500,
  never
>
type GetVegobjektEndringerForType = {
  data: GetVegobjektEndringerForTypeQueryResponse
  error:
    | GetVegobjektEndringerForType400
    | GetVegobjektEndringerForType401
    | GetVegobjektEndringerForType403
    | GetVegobjektEndringerForType404
    | GetVegobjektEndringerForType500
  request: never
  pathParams: GetVegobjektEndringerForTypePathParams
  queryParams: GetVegobjektEndringerForTypeQueryParams
  headerParams: never
  response: GetVegobjektEndringerForTypeQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjektEndringerForTypeClient>[0]>
    return: Awaited<ReturnType<GetVegobjektEndringerForTypeClient>>
  }
}
export const getVegobjektEndringerForTypeQueryKey = (
  vegobjekttypeId: GetVegobjektEndringerForTypePathParams['vegobjekttypeId'],
  params?: GetVegobjektEndringerForType['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/endringer',
      params: { vegobjekttypeId: vegobjekttypeId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektEndringerForTypeQueryKey = ReturnType<
  typeof getVegobjektEndringerForTypeQueryKey
>
export function getVegobjektEndringerForTypeQueryOptions(
  vegobjekttypeId: GetVegobjektEndringerForTypePathParams['vegobjekttypeId'],
  params?: GetVegobjektEndringerForType['queryParams'],
  options: GetVegobjektEndringerForType['client']['parameters'] = {},
) {
  const queryKey = getVegobjektEndringerForTypeQueryKey(vegobjekttypeId, params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektEndringerForType['data'],
        GetVegobjektEndringerForType['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/endringer`,
        params,
        ...options,
      })
      return getVegobjektEndringerForTypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent endringer for en vegobjekttype innen 30 dager
 * @link /api/v4/vegobjekter/:vegobjekttypeId/endringer
 */
export function useGetVegobjektEndringerForType<
  TData = GetVegobjektEndringerForType['response'],
  TQueryData = GetVegobjektEndringerForType['response'],
  TQueryKey extends QueryKey = GetVegobjektEndringerForTypeQueryKey,
>(
  vegobjekttypeId: GetVegobjektEndringerForTypePathParams['vegobjekttypeId'],
  params?: GetVegobjektEndringerForType['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjektEndringerForType['response'],
        GetVegobjektEndringerForType['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjektEndringerForType['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjektEndringerForType['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektEndringerForTypeQueryKey(vegobjekttypeId, params)
  const query = useQuery({
    ...(getVegobjektEndringerForTypeQueryOptions(
      vegobjekttypeId,
      params,
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjektEndringerForType['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjektEndringerForTypeSuspenseQueryKey = (
  vegobjekttypeId: GetVegobjektEndringerForTypePathParams['vegobjekttypeId'],
  params?: GetVegobjektEndringerForType['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/endringer',
      params: { vegobjekttypeId: vegobjekttypeId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektEndringerForTypeSuspenseQueryKey = ReturnType<
  typeof getVegobjektEndringerForTypeSuspenseQueryKey
>
export function getVegobjektEndringerForTypeSuspenseQueryOptions(
  vegobjekttypeId: GetVegobjektEndringerForTypePathParams['vegobjekttypeId'],
  params?: GetVegobjektEndringerForType['queryParams'],
  options: GetVegobjektEndringerForType['client']['parameters'] = {},
) {
  const queryKey = getVegobjektEndringerForTypeSuspenseQueryKey(
    vegobjekttypeId,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektEndringerForType['data'],
        GetVegobjektEndringerForType['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/endringer`,
        params,
        ...options,
      })
      return getVegobjektEndringerForTypeQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent endringer for en vegobjekttype innen 30 dager
 * @link /api/v4/vegobjekter/:vegobjekttypeId/endringer
 */
export function useGetVegobjektEndringerForTypeSuspense<
  TData = GetVegobjektEndringerForType['response'],
  TQueryKey extends QueryKey = GetVegobjektEndringerForTypeSuspenseQueryKey,
>(
  vegobjekttypeId: GetVegobjektEndringerForTypePathParams['vegobjekttypeId'],
  params?: GetVegobjektEndringerForType['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjektEndringerForType['response'],
        GetVegobjektEndringerForType['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjektEndringerForType['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjektEndringerForType['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektEndringerForTypeSuspenseQueryKey(vegobjekttypeId, params)
  const query = useSuspenseQuery({
    ...(getVegobjektEndringerForTypeSuspenseQueryOptions(
      vegobjekttypeId,
      params,
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjektEndringerForType['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
