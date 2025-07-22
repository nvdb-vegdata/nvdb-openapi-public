import { getVegobjektByTypeAndIdQueryResponseSchema } from '../schemas/getVegobjektByTypeAndIdSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjektByTypeAndIdQueryResponse,
  GetVegobjektByTypeAndIdPathParams,
  GetVegobjektByTypeAndIdQueryParams,
  GetVegobjektByTypeAndId400,
  GetVegobjektByTypeAndId401,
  GetVegobjektByTypeAndId403,
  GetVegobjektByTypeAndId404,
  GetVegobjektByTypeAndId500,
} from '../models/GetVegobjektByTypeAndId'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjektByTypeAndIdClient = typeof client<
  GetVegobjektByTypeAndIdQueryResponse,
  | GetVegobjektByTypeAndId400
  | GetVegobjektByTypeAndId401
  | GetVegobjektByTypeAndId403
  | GetVegobjektByTypeAndId404
  | GetVegobjektByTypeAndId500,
  never
>
type GetVegobjektByTypeAndId = {
  data: GetVegobjektByTypeAndIdQueryResponse
  error:
    | GetVegobjektByTypeAndId400
    | GetVegobjektByTypeAndId401
    | GetVegobjektByTypeAndId403
    | GetVegobjektByTypeAndId404
    | GetVegobjektByTypeAndId500
  request: never
  pathParams: GetVegobjektByTypeAndIdPathParams
  queryParams: GetVegobjektByTypeAndIdQueryParams
  headerParams: never
  response: GetVegobjektByTypeAndIdQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjektByTypeAndIdClient>[0]>
    return: Awaited<ReturnType<GetVegobjektByTypeAndIdClient>>
  }
}
export const getVegobjektByTypeAndIdQueryKey = (
  vegobjekttypeId: GetVegobjektByTypeAndIdPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeAndIdPathParams['vegobjektId'],
  params?: GetVegobjektByTypeAndId['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId',
      params: { vegobjekttypeId: vegobjekttypeId, vegobjektId: vegobjektId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektByTypeAndIdQueryKey = ReturnType<
  typeof getVegobjektByTypeAndIdQueryKey
>
export function getVegobjektByTypeAndIdQueryOptions(
  vegobjekttypeId: GetVegobjektByTypeAndIdPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeAndIdPathParams['vegobjektId'],
  params?: GetVegobjektByTypeAndId['queryParams'],
  options: GetVegobjektByTypeAndId['client']['parameters'] = {},
) {
  const queryKey = getVegobjektByTypeAndIdQueryKey(
    vegobjekttypeId,
    vegobjektId,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektByTypeAndId['data'],
        GetVegobjektByTypeAndId['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}`,
        params,
        ...options,
      })
      return getVegobjektByTypeAndIdQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent gjeldende versjon av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId */
export function useGetVegobjektByTypeAndId<
  TData = GetVegobjektByTypeAndId['response'],
  TQueryData = GetVegobjektByTypeAndId['response'],
  TQueryKey extends QueryKey = GetVegobjektByTypeAndIdQueryKey,
>(
  vegobjekttypeId: GetVegobjektByTypeAndIdPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeAndIdPathParams['vegobjektId'],
  params?: GetVegobjektByTypeAndId['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjektByTypeAndId['response'],
        GetVegobjektByTypeAndId['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjektByTypeAndId['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjektByTypeAndId['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektByTypeAndIdQueryKey(vegobjekttypeId, vegobjektId, params)
  const query = useQuery({
    ...(getVegobjektByTypeAndIdQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjektByTypeAndId['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjektByTypeAndIdSuspenseQueryKey = (
  vegobjekttypeId: GetVegobjektByTypeAndIdPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeAndIdPathParams['vegobjektId'],
  params?: GetVegobjektByTypeAndId['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId',
      params: { vegobjekttypeId: vegobjekttypeId, vegobjektId: vegobjektId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektByTypeAndIdSuspenseQueryKey = ReturnType<
  typeof getVegobjektByTypeAndIdSuspenseQueryKey
>
export function getVegobjektByTypeAndIdSuspenseQueryOptions(
  vegobjekttypeId: GetVegobjektByTypeAndIdPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeAndIdPathParams['vegobjektId'],
  params?: GetVegobjektByTypeAndId['queryParams'],
  options: GetVegobjektByTypeAndId['client']['parameters'] = {},
) {
  const queryKey = getVegobjektByTypeAndIdSuspenseQueryKey(
    vegobjekttypeId,
    vegobjektId,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektByTypeAndId['data'],
        GetVegobjektByTypeAndId['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}`,
        params,
        ...options,
      })
      return getVegobjektByTypeAndIdQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent gjeldende versjon av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId */
export function useGetVegobjektByTypeAndIdSuspense<
  TData = GetVegobjektByTypeAndId['response'],
  TQueryKey extends QueryKey = GetVegobjektByTypeAndIdSuspenseQueryKey,
>(
  vegobjekttypeId: GetVegobjektByTypeAndIdPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeAndIdPathParams['vegobjektId'],
  params?: GetVegobjektByTypeAndId['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjektByTypeAndId['response'],
        GetVegobjektByTypeAndId['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjektByTypeAndId['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjektByTypeAndId['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektByTypeAndIdSuspenseQueryKey(
      vegobjekttypeId,
      vegobjektId,
      params,
    )
  const query = useSuspenseQuery({
    ...(getVegobjektByTypeAndIdSuspenseQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjektByTypeAndId['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
