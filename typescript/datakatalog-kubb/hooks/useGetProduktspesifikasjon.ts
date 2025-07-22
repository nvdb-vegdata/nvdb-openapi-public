import { getProduktspesifikasjonQueryResponseSchema } from '../schemas/getProduktspesifikasjonSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetProduktspesifikasjonQueryResponse,
  GetProduktspesifikasjonPathParams,
  GetProduktspesifikasjon404,
  GetProduktspesifikasjon500,
  GetProduktspesifikasjon503,
} from '../models/GetProduktspesifikasjon'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetProduktspesifikasjonClient = typeof client<
  GetProduktspesifikasjonQueryResponse,
  | GetProduktspesifikasjon404
  | GetProduktspesifikasjon500
  | GetProduktspesifikasjon503,
  never
>
type GetProduktspesifikasjon = {
  data: GetProduktspesifikasjonQueryResponse
  error:
    | GetProduktspesifikasjon404
    | GetProduktspesifikasjon500
    | GetProduktspesifikasjon503
  request: never
  pathParams: GetProduktspesifikasjonPathParams
  queryParams: never
  headerParams: never
  response: GetProduktspesifikasjonQueryResponse
  client: {
    parameters: Partial<Parameters<GetProduktspesifikasjonClient>[0]>
    return: Awaited<ReturnType<GetProduktspesifikasjonClient>>
  }
}
export const getProduktspesifikasjonQueryKey = (
  vegobjekttypeid: GetProduktspesifikasjonPathParams['vegobjekttypeid'],
) =>
  [
    {
      url: '/api/v1/vegobjekttyper/:vegobjekttypeid/produktspesifikasjon',
      params: { vegobjekttypeid: vegobjekttypeid },
    },
  ] as const
export type GetProduktspesifikasjonQueryKey = ReturnType<
  typeof getProduktspesifikasjonQueryKey
>
export function getProduktspesifikasjonQueryOptions(
  vegobjekttypeid: GetProduktspesifikasjonPathParams['vegobjekttypeid'],
  options: GetProduktspesifikasjon['client']['parameters'] = {},
) {
  const queryKey = getProduktspesifikasjonQueryKey(vegobjekttypeid)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetProduktspesifikasjon['data'],
        GetProduktspesifikasjon['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper/${vegobjekttypeid}/produktspesifikasjon`,
        ...options,
      })
      return getProduktspesifikasjonQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer produktspesifikasjonen til den angitte vegobjekttypen
 * @link /api/v1/vegobjekttyper/:vegobjekttypeid/produktspesifikasjon */
export function useGetProduktspesifikasjon<
  TData = GetProduktspesifikasjon['response'],
  TQueryData = GetProduktspesifikasjon['response'],
  TQueryKey extends QueryKey = GetProduktspesifikasjonQueryKey,
>(
  vegobjekttypeid: GetProduktspesifikasjonPathParams['vegobjekttypeid'],
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetProduktspesifikasjon['response'],
        GetProduktspesifikasjon['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetProduktspesifikasjon['client']['parameters']
  } = {},
): UseQueryResult<TData, GetProduktspesifikasjon['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ?? getProduktspesifikasjonQueryKey(vegobjekttypeid)
  const query = useQuery({
    ...(getProduktspesifikasjonQueryOptions(
      vegobjekttypeid,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetProduktspesifikasjon['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getProduktspesifikasjonSuspenseQueryKey = (
  vegobjekttypeid: GetProduktspesifikasjonPathParams['vegobjekttypeid'],
) =>
  [
    {
      url: '/api/v1/vegobjekttyper/:vegobjekttypeid/produktspesifikasjon',
      params: { vegobjekttypeid: vegobjekttypeid },
    },
  ] as const
export type GetProduktspesifikasjonSuspenseQueryKey = ReturnType<
  typeof getProduktspesifikasjonSuspenseQueryKey
>
export function getProduktspesifikasjonSuspenseQueryOptions(
  vegobjekttypeid: GetProduktspesifikasjonPathParams['vegobjekttypeid'],
  options: GetProduktspesifikasjon['client']['parameters'] = {},
) {
  const queryKey = getProduktspesifikasjonSuspenseQueryKey(vegobjekttypeid)
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<
        GetProduktspesifikasjon['data'],
        GetProduktspesifikasjon['error']
      >({
        method: 'get',
        url: `/api/v1/vegobjekttyper/${vegobjekttypeid}/produktspesifikasjon`,
        ...options,
      })
      return getProduktspesifikasjonQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer produktspesifikasjonen til den angitte vegobjekttypen
 * @link /api/v1/vegobjekttyper/:vegobjekttypeid/produktspesifikasjon */
export function useGetProduktspesifikasjonSuspense<
  TData = GetProduktspesifikasjon['response'],
  TQueryKey extends QueryKey = GetProduktspesifikasjonSuspenseQueryKey,
>(
  vegobjekttypeid: GetProduktspesifikasjonPathParams['vegobjekttypeid'],
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetProduktspesifikasjon['response'],
        GetProduktspesifikasjon['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetProduktspesifikasjon['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetProduktspesifikasjon['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey =
    queryOptions?.queryKey ??
    getProduktspesifikasjonSuspenseQueryKey(vegobjekttypeid)
  const query = useSuspenseQuery({
    ...(getProduktspesifikasjonSuspenseQueryOptions(
      vegobjekttypeid,
      clientOptions,
    ) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetProduktspesifikasjon['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
