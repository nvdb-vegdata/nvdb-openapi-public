import { getVegobjektVersjonerQueryResponseSchema } from '../schemas/getVegobjektVersjonerSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjektVersjonerQueryResponse,
  GetVegobjektVersjonerPathParams,
  GetVegobjektVersjonerQueryParams,
  GetVegobjektVersjoner400,
  GetVegobjektVersjoner401,
  GetVegobjektVersjoner403,
  GetVegobjektVersjoner404,
  GetVegobjektVersjoner500,
} from '../models/GetVegobjektVersjoner'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjektVersjonerClient = typeof client<
  GetVegobjektVersjonerQueryResponse,
  | GetVegobjektVersjoner400
  | GetVegobjektVersjoner401
  | GetVegobjektVersjoner403
  | GetVegobjektVersjoner404
  | GetVegobjektVersjoner500,
  never
>
type GetVegobjektVersjoner = {
  data: GetVegobjektVersjonerQueryResponse
  error:
    | GetVegobjektVersjoner400
    | GetVegobjektVersjoner401
    | GetVegobjektVersjoner403
    | GetVegobjektVersjoner404
    | GetVegobjektVersjoner500
  request: never
  pathParams: GetVegobjektVersjonerPathParams
  queryParams: GetVegobjektVersjonerQueryParams
  headerParams: never
  response: GetVegobjektVersjonerQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjektVersjonerClient>[0]>
    return: Awaited<ReturnType<GetVegobjektVersjonerClient>>
  }
}
export const getVegobjektVersjonerQueryKey = (
  vegobjekttypeId: GetVegobjektVersjonerPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektVersjonerPathParams['vegobjektId'],
  params?: GetVegobjektVersjoner['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/versjoner',
      params: { vegobjekttypeId: vegobjekttypeId, vegobjektId: vegobjektId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektVersjonerQueryKey = ReturnType<
  typeof getVegobjektVersjonerQueryKey
>
export function getVegobjektVersjonerQueryOptions(
  vegobjekttypeId: GetVegobjektVersjonerPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektVersjonerPathParams['vegobjektId'],
  params?: GetVegobjektVersjoner['queryParams'],
  options: GetVegobjektVersjoner['client']['parameters'] = {},
) {
  const queryKey = getVegobjektVersjonerQueryKey(
    vegobjekttypeId,
    vegobjektId,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektVersjoner['data'],
        GetVegobjektVersjoner['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}/versjoner`,
        params,
        ...options,
      })
      return getVegobjektVersjonerQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent alle versjoner av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/versjoner */
export function useGetVegobjektVersjoner<
  TData = GetVegobjektVersjoner['response'],
  TQueryData = GetVegobjektVersjoner['response'],
  TQueryKey extends QueryKey = GetVegobjektVersjonerQueryKey,
>(
  vegobjekttypeId: GetVegobjektVersjonerPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektVersjonerPathParams['vegobjektId'],
  params?: GetVegobjektVersjoner['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjektVersjoner['response'],
        GetVegobjektVersjoner['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjektVersjoner['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjektVersjoner['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektVersjonerQueryKey(vegobjekttypeId, vegobjektId, params)
  const query = useQuery({
    ...(getVegobjektVersjonerQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjektVersjoner['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjektVersjonerSuspenseQueryKey = (
  vegobjekttypeId: GetVegobjektVersjonerPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektVersjonerPathParams['vegobjektId'],
  params?: GetVegobjektVersjoner['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/versjoner',
      params: { vegobjekttypeId: vegobjekttypeId, vegobjektId: vegobjektId },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektVersjonerSuspenseQueryKey = ReturnType<
  typeof getVegobjektVersjonerSuspenseQueryKey
>
export function getVegobjektVersjonerSuspenseQueryOptions(
  vegobjekttypeId: GetVegobjektVersjonerPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektVersjonerPathParams['vegobjektId'],
  params?: GetVegobjektVersjoner['queryParams'],
  options: GetVegobjektVersjoner['client']['parameters'] = {},
) {
  const queryKey = getVegobjektVersjonerSuspenseQueryKey(
    vegobjekttypeId,
    vegobjektId,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektVersjoner['data'],
        GetVegobjektVersjoner['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}/versjoner`,
        params,
        ...options,
      })
      return getVegobjektVersjonerQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent alle versjoner av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/versjoner */
export function useGetVegobjektVersjonerSuspense<
  TData = GetVegobjektVersjoner['response'],
  TQueryKey extends QueryKey = GetVegobjektVersjonerSuspenseQueryKey,
>(
  vegobjekttypeId: GetVegobjektVersjonerPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektVersjonerPathParams['vegobjektId'],
  params?: GetVegobjektVersjoner['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjektVersjoner['response'],
        GetVegobjektVersjoner['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjektVersjoner['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjektVersjoner['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektVersjonerSuspenseQueryKey(vegobjekttypeId, vegobjektId, params)
  const query = useSuspenseQuery({
    ...(getVegobjektVersjonerSuspenseQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjektVersjoner['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
