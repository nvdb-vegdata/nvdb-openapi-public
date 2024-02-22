import { getVersjonQueryResponseSchema } from '../schemas/getVersjonSchema'
import client from '@kubb/swagger-client/client'
import { useQuery, queryOptions, useSuspenseQuery } from '@tanstack/react-query'
import type {
  GetVersjonQueryResponse,
  GetVersjon404,
  GetVersjon500,
  GetVersjon503,
} from '../models/GetVersjon'
import type {
  QueryObserverOptions,
  UseQueryResult,
  QueryKey,
  UseSuspenseQueryOptions,
  UseSuspenseQueryResult,
} from '@tanstack/react-query'

type GetVersjonClient = typeof client<
  GetVersjonQueryResponse,
  GetVersjon404 | GetVersjon500 | GetVersjon503,
  never
>
type GetVersjon = {
  data: GetVersjonQueryResponse
  error: GetVersjon404 | GetVersjon500 | GetVersjon503
  request: never
  pathParams: never
  queryParams: never
  headerParams: never
  response: GetVersjonQueryResponse
  client: {
    parameters: Partial<Parameters<GetVersjonClient>[0]>
    return: Awaited<ReturnType<GetVersjonClient>>
  }
}
export const getVersjonQueryKey = () => [{ url: '/api/v1/versjon' }] as const
export type GetVersjonQueryKey = ReturnType<typeof getVersjonQueryKey>
export function getVersjonQueryOptions(
  options: GetVersjon['client']['parameters'] = {},
) {
  const queryKey = getVersjonQueryKey()
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<GetVersjon['data'], GetVersjon['error']>({
        method: 'get',
        url: `/api/v1/versjon`,
        ...options,
      })
      return getVersjonQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer aktiv versjon på datakatalog
 * @link /api/v1/versjon */
export function useGetVersjon<
  TData = GetVersjon['response'],
  TQueryData = GetVersjon['response'],
  TQueryKey extends QueryKey = GetVersjonQueryKey,
>(
  options: {
    query?: Partial<
      QueryObserverOptions<
        GetVersjon['response'],
        GetVersjon['error'],
        TData,
        TQueryData,
        TQueryKey
      >
    >
    client?: GetVersjon['client']['parameters']
  } = {},
): UseQueryResult<TData, GetVersjon['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey = queryOptions?.queryKey ?? getVersjonQueryKey()
  const query = useQuery({
    ...(getVersjonQueryOptions(clientOptions) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseQueryResult<TData, GetVersjon['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
export const getVersjonSuspenseQueryKey = () =>
  [{ url: '/api/v1/versjon' }] as const
export type GetVersjonSuspenseQueryKey = ReturnType<
  typeof getVersjonSuspenseQueryKey
>
export function getVersjonSuspenseQueryOptions(
  options: GetVersjon['client']['parameters'] = {},
) {
  const queryKey = getVersjonSuspenseQueryKey()
  return queryOptions({
    queryKey,
    queryFn: async () => {
      const res = await client<GetVersjon['data'], GetVersjon['error']>({
        method: 'get',
        url: `/api/v1/versjon`,
        ...options,
      })
      return getVersjonQueryResponseSchema.parse(res.data)
    },
  })
}
/**
 * @summary Returnerer aktiv versjon på datakatalog
 * @link /api/v1/versjon */
export function useGetVersjonSuspense<
  TData = GetVersjon['response'],
  TQueryKey extends QueryKey = GetVersjonSuspenseQueryKey,
>(
  options: {
    query?: Partial<
      UseSuspenseQueryOptions<
        GetVersjon['response'],
        GetVersjon['error'],
        TData,
        TQueryKey
      >
    >
    client?: GetVersjon['client']['parameters']
  } = {},
): UseSuspenseQueryResult<TData, GetVersjon['error']> & {
  queryKey: TQueryKey
} {
  const { query: queryOptions, client: clientOptions = {} } = options ?? {}
  const queryKey = queryOptions?.queryKey ?? getVersjonSuspenseQueryKey()
  const query = useSuspenseQuery({
    ...(getVersjonSuspenseQueryOptions(clientOptions) as QueryObserverOptions),
    queryKey,
    ...(queryOptions as unknown as Omit<QueryObserverOptions, 'queryKey'>),
  }) as UseSuspenseQueryResult<TData, GetVersjon['error']> & {
    queryKey: TQueryKey
  }
  query.queryKey = queryKey as TQueryKey
  return query
}
