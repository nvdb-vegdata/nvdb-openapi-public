import { getVegobjektByTypeIdAndVersjonQueryResponseSchema } from '../schemas/getVegobjektByTypeIdAndVersjonSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVegobjektByTypeIdAndVersjonQueryResponse,
  GetVegobjektByTypeIdAndVersjonPathParams,
  GetVegobjektByTypeIdAndVersjonQueryParams,
  GetVegobjektByTypeIdAndVersjon400,
  GetVegobjektByTypeIdAndVersjon401,
  GetVegobjektByTypeIdAndVersjon403,
  GetVegobjektByTypeIdAndVersjon404,
  GetVegobjektByTypeIdAndVersjon500,
} from '../models/GetVegobjektByTypeIdAndVersjon'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVegobjektByTypeIdAndVersjonClient = typeof client<
  GetVegobjektByTypeIdAndVersjonQueryResponse,
  | GetVegobjektByTypeIdAndVersjon400
  | GetVegobjektByTypeIdAndVersjon401
  | GetVegobjektByTypeIdAndVersjon403
  | GetVegobjektByTypeIdAndVersjon404
  | GetVegobjektByTypeIdAndVersjon500,
  never
>
type GetVegobjektByTypeIdAndVersjon = {
  data: GetVegobjektByTypeIdAndVersjonQueryResponse
  error:
    | GetVegobjektByTypeIdAndVersjon400
    | GetVegobjektByTypeIdAndVersjon401
    | GetVegobjektByTypeIdAndVersjon403
    | GetVegobjektByTypeIdAndVersjon404
    | GetVegobjektByTypeIdAndVersjon500
  request: never
  pathParams: GetVegobjektByTypeIdAndVersjonPathParams
  queryParams: GetVegobjektByTypeIdAndVersjonQueryParams
  headerParams: never
  response: GetVegobjektByTypeIdAndVersjonQueryResponse
  client: {
    parameters: Partial<Parameters<GetVegobjektByTypeIdAndVersjonClient>[0]>
    return: Awaited<ReturnType<GetVegobjektByTypeIdAndVersjonClient>>
  }
}
export const getVegobjektByTypeIdAndVersjonQueryKey = (
  vegobjekttypeId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByTypeIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByTypeIdAndVersjon['queryParams'],
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
export type GetVegobjektByTypeIdAndVersjonQueryKey = ReturnType<
  typeof getVegobjektByTypeIdAndVersjonQueryKey
>
export function getVegobjektByTypeIdAndVersjonQueryOptions(
  vegobjekttypeId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByTypeIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByTypeIdAndVersjon['queryParams'],
  options: GetVegobjektByTypeIdAndVersjon['client']['parameters'] = {},
) {
  const queryKey = getVegobjektByTypeIdAndVersjonQueryKey(
    vegobjekttypeId,
    vegobjektId,
    versjon,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektByTypeIdAndVersjon['data'],
        GetVegobjektByTypeIdAndVersjon['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}/${versjon}`,
        params,
        ...options,
      })
      return getVegobjektByTypeIdAndVersjonQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent spesifikk versjon av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/:versjon */
export function useGetVegobjektByTypeIdAndVersjon<
  TData = GetVegobjektByTypeIdAndVersjon['response'],
  TQueryData = GetVegobjektByTypeIdAndVersjon['response'],
  TQueryKey extends QueryKey = GetVegobjektByTypeIdAndVersjonQueryKey,
>(
  vegobjekttypeId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByTypeIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByTypeIdAndVersjon['queryParams'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVegobjektByTypeIdAndVersjon['response'],
        GetVegobjektByTypeIdAndVersjon['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVegobjektByTypeIdAndVersjon['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVegobjektByTypeIdAndVersjon['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektByTypeIdAndVersjonQueryKey(
      vegobjekttypeId,
      vegobjektId,
      versjon,
      params,
    )
  const query = useQuery({
    ...(getVegobjektByTypeIdAndVersjonQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      versjon,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVegobjektByTypeIdAndVersjon['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVegobjektByTypeIdAndVersjonSuspenseQueryKey = (
  vegobjekttypeId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByTypeIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByTypeIdAndVersjon['queryParams'],
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
export type GetVegobjektByTypeIdAndVersjonSuspenseQueryKey = ReturnType<
  typeof getVegobjektByTypeIdAndVersjonSuspenseQueryKey
>
export function getVegobjektByTypeIdAndVersjonSuspenseQueryOptions(
  vegobjekttypeId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByTypeIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByTypeIdAndVersjon['queryParams'],
  options: GetVegobjektByTypeIdAndVersjon['client']['parameters'] = {},
) {
  const queryKey = getVegobjektByTypeIdAndVersjonSuspenseQueryKey(
    vegobjekttypeId,
    vegobjektId,
    versjon,
    params,
  )
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetVegobjektByTypeIdAndVersjon['data'],
        GetVegobjektByTypeIdAndVersjon['error']
      >({
        method: 'get',
        url: `/api/v4/vegobjekter/${vegobjekttypeId}/${vegobjektId}/${versjon}`,
        params,
        ...options,
      })
      return getVegobjektByTypeIdAndVersjonQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Hent spesifikk versjon av et vegobjekt
 * @link /api/v4/vegobjekter/:vegobjekttypeId/:vegobjektId/:versjon */
export function useGetVegobjektByTypeIdAndVersjonSuspense<
  TData = GetVegobjektByTypeIdAndVersjon['response'],
  TQueryKey extends QueryKey = GetVegobjektByTypeIdAndVersjonSuspenseQueryKey,
>(
  vegobjekttypeId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjekttypeId'],
  vegobjektId: GetVegobjektByTypeIdAndVersjonPathParams['vegobjektId'],
  versjon: GetVegobjektByTypeIdAndVersjonPathParams['versjon'],
  params?: GetVegobjektByTypeIdAndVersjon['queryParams'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVegobjektByTypeIdAndVersjon['response'],
        GetVegobjektByTypeIdAndVersjon['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVegobjektByTypeIdAndVersjon['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVegobjektByTypeIdAndVersjon['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getVegobjektByTypeIdAndVersjonSuspenseQueryKey(
      vegobjekttypeId,
      vegobjektId,
      versjon,
      params,
    )
  const query = useSuspenseQuery({
    ...(getVegobjektByTypeIdAndVersjonSuspenseQueryOptions(
      vegobjekttypeId,
      vegobjektId,
      versjon,
      params,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<
    TData,
    GetVegobjektByTypeIdAndVersjon['error']
  > & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
