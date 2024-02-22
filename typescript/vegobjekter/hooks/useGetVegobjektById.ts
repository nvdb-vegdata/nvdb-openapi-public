import { getVegobjektByIdQueryResponseSchema } from '../schemas/getVegobjektByIdSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjektByIdQueryResponse,
  GetVegobjektByIdQueryParams,
  GetVegobjektById400,
  GetVegobjektById401,
  GetVegobjektById403,
  GetVegobjektById404,
  GetVegobjektById500,
} from '../models/GetVegobjektById'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjektByIdClient = typeof client<
  GetVegobjektByIdQueryResponse,
  | GetVegobjektById400
  | GetVegobjektById401
  | GetVegobjektById403
  | GetVegobjektById404
  | GetVegobjektById500,
  never
>
type GetVegobjektById = {
  data: GetVegobjektByIdQueryResponse
  error:
    | GetVegobjektById400
    | GetVegobjektById401
    | GetVegobjektById403
    | GetVegobjektById404
    | GetVegobjektById500
  request: never
  pathParams: never
  queryParams: GetVegobjektByIdQueryParams
  headerParams: never
  response: GetVegobjektByIdQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjektByIdClient>[0]>
    return: Awaited<ReturnType<GetVegobjektByIdClient>>
  }
}
export const getVegobjektByIdQueryKey = (
  params: GetVegobjektById['queryParams'],
) => [{ url: '/api/v4/vegobjekt' }, ...(params ? [params] : [])] as const
export type GetVegobjektByIdQueryKey = ReturnType<
  typeof getVegobjektByIdQueryKey
>
export function getVegobjektByIdQueryOptions(
  params: GetVegobjektById['queryParams'],
  options: GetVegobjektById['client']['parameters'] = {},
) {
  const queryKey = getVegobjektByIdQueryKey(params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektById['data'],
        GetVegobjektById['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekt`,
        params,
        ...options,
      })
      return getVegobjektByIdQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent enkelt vegobjekt
 * @link /api/v4/vegobjekt */
export function useGetVegobjektById<
  TData = GetVegobjektById['response'],
  TQueryData = GetVegobjektById['response'],
  TQueryKey extends QueryKey = GetVegobjektByIdQueryKey,
>(
  params: GetVegobjektById['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjektById['response'],
        GetVegobjektById['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjektById['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjektById['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey = queryOptions?.queryKey ?? getVegobjektByIdQueryKey(params)
  const query = useQuery({
    ...(getVegobjektByIdQueryOptions(
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjektById['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjektByIdSuspenseQueryKey = (
  params: GetVegobjektById['queryParams'],
) => [{ url: '/api/v4/vegobjekt' }, ...(params ? [params] : [])] as const
export type GetVegobjektByIdSuspenseQueryKey = ReturnType<
  typeof getVegobjektByIdSuspenseQueryKey
>
export function getVegobjektByIdSuspenseQueryOptions(
  params: GetVegobjektById['queryParams'],
  options: GetVegobjektById['client']['parameters'] = {},
) {
  const queryKey = getVegobjektByIdSuspenseQueryKey(params)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektById['data'],
        GetVegobjektById['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekt`,
        params,
        ...options,
      })
      return getVegobjektByIdQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent enkelt vegobjekt
 * @link /api/v4/vegobjekt */
export function useGetVegobjektByIdSuspense<
  TData = GetVegobjektById['response'],
  TQueryKey extends QueryKey = GetVegobjektByIdSuspenseQueryKey,
>(
  params: GetVegobjektById['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjektById['response'],
        GetVegobjektById['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjektById['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjektById['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ?? getVegobjektByIdSuspenseQueryKey(params)
  const query = useSuspenseQuery({
    ...(getVegobjektByIdSuspenseQueryOptions(
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjektById['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
