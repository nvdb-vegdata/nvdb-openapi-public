import { getVegobjektByIdAndVersjonQueryResponseSchema } from '../schemas/getVegobjektByIdAndVersjonSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjektByIdAndVersjonQueryResponse,
  GetVegobjektByIdAndVersjonPathParams,
  GetVegobjektByIdAndVersjonQueryParams,
  GetVegobjektByIdAndVersjon400,
  GetVegobjektByIdAndVersjon401,
  GetVegobjektByIdAndVersjon403,
  GetVegobjektByIdAndVersjon404,
  GetVegobjektByIdAndVersjon500,
} from '../models/GetVegobjektByIdAndVersjon'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjektByIdAndVersjonClient = typeof client<
  GetVegobjektByIdAndVersjonQueryResponse,
  | GetVegobjektByIdAndVersjon400
  | GetVegobjektByIdAndVersjon401
  | GetVegobjektByIdAndVersjon403
  | GetVegobjektByIdAndVersjon404
  | GetVegobjektByIdAndVersjon500,
  never
>
type GetVegobjektByIdAndVersjon = {
  data: GetVegobjektByIdAndVersjonQueryResponse
  error:
    | GetVegobjektByIdAndVersjon400
    | GetVegobjektByIdAndVersjon401
    | GetVegobjektByIdAndVersjon403
    | GetVegobjektByIdAndVersjon404
    | GetVegobjektByIdAndVersjon500
  request: never
  pathParams: GetVegobjektByIdAndVersjonPathParams
  queryParams: GetVegobjektByIdAndVersjonQueryParams
  headerParams: never
  response: GetVegobjektByIdAndVersjonQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjektByIdAndVersjonClient>[0]>
    return: Awaited<ReturnType<GetVegobjektByIdAndVersjonClient>>
  }
}
export const getVegobjektByIdAndVersjonQueryKey = (
  vegobjekttypeId: GetVegobjektByIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByIdAndVersjon['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/:versjon',
      params: {
        vegobjekttypeId: vegobjekttypeId,
        vegobjektId: vegobjektId,
        versjon: versjon,
      },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektByIdAndVersjonQueryKey = ReturnType<
  typeof getVegobjektByIdAndVersjonQueryKey
>
export function getVegobjektByIdAndVersjonQueryOptions(
  vegobjekttypeId: GetVegobjektByIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByIdAndVersjon['queryParams'],
  options: GetVegobjektByIdAndVersjon['client']['parameters'] = {},
) {
  const queryKey = getVegobjektByIdAndVersjonQueryKey(
    vegobjekttypeId,
    vegobjektId,
    versjon,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektByIdAndVersjon['data'],
        GetVegobjektByIdAndVersjon['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}/${versjon}`,
        params,
        ...options,
      })
      return getVegobjektByIdAndVersjonQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent spesifikk versjon av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/:versjon */
export function useGetVegobjektByIdAndVersjon<
  TData = GetVegobjektByIdAndVersjon['response'],
  TQueryData = GetVegobjektByIdAndVersjon['response'],
  TQueryKey extends QueryKey = GetVegobjektByIdAndVersjonQueryKey,
>(
  vegobjekttypeId: GetVegobjektByIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByIdAndVersjon['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjektByIdAndVersjon['response'],
        GetVegobjektByIdAndVersjon['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjektByIdAndVersjon['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjektByIdAndVersjon['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektByIdAndVersjonQueryKey(
      vegobjekttypeId,
      vegobjektId,
      versjon,
      params,
    )
  const query = useQuery({
    ...(getVegobjektByIdAndVersjonQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      versjon,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjektByIdAndVersjon['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjektByIdAndVersjonSuspenseQueryKey = (
  vegobjekttypeId: GetVegobjektByIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByIdAndVersjon['queryParams'],
) =>
  [
    {
      url: '/api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/:versjon',
      params: {
        vegobjekttypeId: vegobjekttypeId,
        vegobjektId: vegobjektId,
        versjon: versjon,
      },
    },
    ...(params ? [params] : []),
  ] as const
export type GetVegobjektByIdAndVersjonSuspenseQueryKey = ReturnType<
  typeof getVegobjektByIdAndVersjonSuspenseQueryKey
>
export function getVegobjektByIdAndVersjonSuspenseQueryOptions(
  vegobjekttypeId: GetVegobjektByIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByIdAndVersjon['queryParams'],
  options: GetVegobjektByIdAndVersjon['client']['parameters'] = {},
) {
  const queryKey = getVegobjektByIdAndVersjonSuspenseQueryKey(
    vegobjekttypeId,
    vegobjektId,
    versjon,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektByIdAndVersjon['data'],
        GetVegobjektByIdAndVersjon['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}/${versjon}`,
        params,
        ...options,
      })
      return getVegobjektByIdAndVersjonQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent spesifikk versjon av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/:versjon */
export function useGetVegobjektByIdAndVersjonSuspense<
  TData = GetVegobjektByIdAndVersjon['response'],
  TQueryKey extends QueryKey = GetVegobjektByIdAndVersjonSuspenseQueryKey,
>(
  vegobjekttypeId: GetVegobjektByIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByIdAndVersjon['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjektByIdAndVersjon['response'],
        GetVegobjektByIdAndVersjon['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjektByIdAndVersjon['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjektByIdAndVersjon['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektByIdAndVersjonSuspenseQueryKey(
      vegobjekttypeId,
      vegobjektId,
      versjon,
      params,
    )
  const query = useSuspenseQuery({
    ...(getVegobjektByIdAndVersjonSuspenseQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      versjon,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVegobjektByIdAndVersjon['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
