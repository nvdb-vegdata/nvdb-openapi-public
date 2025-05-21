import { getVegobjektNotifikasjonerQueryResponseSchema } from '../schemas/getVegobjektNotifikasjonerSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjektNotifikasjonerQueryResponse,
  GetVegobjektNotifikasjonerPathParams,
  GetVegobjektNotifikasjonerQueryParams,
  GetVegobjektNotifikasjoner400,
  GetVegobjektNotifikasjoner401,
  GetVegobjektNotifikasjoner403,
  GetVegobjektNotifikasjoner404,
  GetVegobjektNotifikasjoner500,
} from '../models/GetVegobjektNotifikasjoner'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjektNotifikasjonerClient = typeof client<
  GetVegobjektNotifikasjonerQueryResponse,
  | GetVegobjektNotifikasjoner400
  | GetVegobjektNotifikasjoner401
  | GetVegobjektNotifikasjoner403
  | GetVegobjektNotifikasjoner404
  | GetVegobjektNotifikasjoner500,
  never
>
type GetVegobjektNotifikasjoner = {
  data: GetVegobjektNotifikasjonerQueryResponse
  error:
    | GetVegobjektNotifikasjoner400
    | GetVegobjektNotifikasjoner401
    | GetVegobjektNotifikasjoner403
    | GetVegobjektNotifikasjoner404
    | GetVegobjektNotifikasjoner500
  request: never
  pathParams: GetVegobjektNotifikasjonerPathParams
  queryParams: GetVegobjektNotifikasjonerQueryParams
  headerParams: never
  response: GetVegobjektNotifikasjonerQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjektNotifikasjonerClient>[0]>
    return: Awaited<ReturnType<GetVegobjektNotifikasjonerClient>>
  }
}
export const getVegobjektNotifikasjonerQueryKey = (
  vegobjekttypeId: GetVegobjektNotifikasjonerPathParams['vegobjekttypeId'],
  params?: GetVegobjektNotifikasjoner['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/endringer',
      params: { vegobjekttypeId: vegobjekttypeId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektNotifikasjonerQueryKey = ReturnType<
  typeof getVegobjektNotifikasjonerQueryKey
>
export function getVegobjektNotifikasjonerQueryOptions(
  vegobjekttypeId: GetVegobjektNotifikasjonerPathParams['vegobjekttypeId'],
  params?: GetVegobjektNotifikasjoner['queryParams'],
  options: GetVegobjektNotifikasjoner['client']['parameters'] = {},
) {
  const queryKey = getVegobjektNotifikasjonerQueryKey(vegobjekttypeId, params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektNotifikasjoner['data'],
        GetVegobjektNotifikasjoner['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/endringer`,
        params,
        ...options,
      })
      return getVegobjektNotifikasjonerQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent endringer på vegobjekter
 * @link /api/v4/vegobjekter/:vegobjekttypeId/endringer
 */
export function useGetVegobjektNotifikasjoner<
  TData = GetVegobjektNotifikasjoner['response'],
  TQueryData = GetVegobjektNotifikasjoner['response'],
  TQueryKey extends QueryKey = GetVegobjektNotifikasjonerQueryKey,
>(
  vegobjekttypeId: GetVegobjektNotifikasjonerPathParams['vegobjekttypeId'],
  params?: GetVegobjektNotifikasjoner['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjektNotifikasjoner['response'],
        GetVegobjektNotifikasjoner['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjektNotifikasjoner['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjektNotifikasjoner['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektNotifikasjonerQueryKey(vegobjekttypeId, params)
  const query = useQuery({
    ...(getVegobjektNotifikasjonerQueryOptions(
      vegobjekttypeId,
      params,
      clientOptions,
    ) as unknown as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjektNotifikasjoner['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjektNotifikasjonerSuspenseQueryKey = (
  vegobjekttypeId: GetVegobjektNotifikasjonerPathParams['vegobjekttypeId'],
  params?: GetVegobjektNotifikasjoner['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/endringer',
      params: { vegobjekttypeId: vegobjekttypeId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektNotifikasjonerSuspenseQueryKey = ReturnType<
  typeof getVegobjektNotifikasjonerSuspenseQueryKey
>
export function getVegobjektNotifikasjonerSuspenseQueryOptions(
  vegobjekttypeId: GetVegobjektNotifikasjonerPathParams['vegobjekttypeId'],
  params?: GetVegobjektNotifikasjoner['queryParams'],
  options: GetVegobjektNotifikasjoner['client']['parameters'] = {},
) {
  const queryKey = getVegobjektNotifikasjonerSuspenseQueryKey(
    vegobjekttypeId,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektNotifikasjoner['data'],
        GetVegobjektNotifikasjoner['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/endringer`,
        params,
        ...options,
      })
      return getVegobjektNotifikasjonerQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent endringer på vegobjekter
 * @link /api/v4/vegobjekter/:vegobjekttypeId/endringer
 */
export function useGetVegobjektNotifikasjonerSuspense<
  TData = GetVegobjektNotifikasjoner['response'],
  TQueryKey extends QueryKey = GetVegobjektNotifikasjonerSuspenseQueryKey,
>(
  vegobjekttypeId: GetVegobjektNotifikasjonerPathParams['vegobjekttypeId'],
  params?: GetVegobjektNotifikasjoner['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjektNotifikasjoner['response'],
        GetVegobjektNotifikasjoner['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjektNotifikasjoner['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjektNotifikasjoner['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektNotifikasjonerSuspenseQueryKey(vegobjekttypeId, params)
  const query = useSuspenseQuery({
    ...(getVegobjektNotifikasjonerSuspenseQueryOptions(
      vegobjekttypeId,
      params,
      clientOptions,
    ) as unknown as UseSuspenseQueryOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<UseSuspenseQueryOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjektNotifikasjoner['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
