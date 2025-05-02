import {
  getVegobjektByIdQueryResponseSchema,
  getVegobjektById400Schema,
  getVegobjektById401Schema,
  getVegobjektById403Schema,
  getVegobjektById404Schema,
  getVegobjektById500Schema,
  getVegobjektByIdQueryParamsSchema,
} from './getVegobjektByIdSchema'
import {
  getVegobjekterByTypeQueryResponseSchema,
  getVegobjekterByType400Schema,
  getVegobjekterByType401Schema,
  getVegobjekterByType403Schema,
  getVegobjekterByType404Schema,
  getVegobjekterByType500Schema,
  getVegobjekterByTypePathParamsSchema,
  getVegobjekterByTypeQueryParamsSchema,
} from './getVegobjekterByTypeSchema'
import {
  getVegobjektById1QueryResponseSchema,
  getVegobjektById1400Schema,
  getVegobjektById1401Schema,
  getVegobjektById1403Schema,
  getVegobjektById1404Schema,
  getVegobjektById1500Schema,
  getVegobjektById1PathParamsSchema,
  getVegobjektById1QueryParamsSchema,
} from './getVegobjektById1Schema'
import {
  getVegobjektByIdAndVersjonQueryResponseSchema,
  getVegobjektByIdAndVersjon400Schema,
  getVegobjektByIdAndVersjon401Schema,
  getVegobjektByIdAndVersjon403Schema,
  getVegobjektByIdAndVersjon404Schema,
  getVegobjektByIdAndVersjon500Schema,
  getVegobjektByIdAndVersjonPathParamsSchema,
  getVegobjektByIdAndVersjonQueryParamsSchema,
} from './getVegobjektByIdAndVersjonSchema'
import {
  getVegobjektVersjonerQueryResponseSchema,
  getVegobjektVersjoner400Schema,
  getVegobjektVersjoner401Schema,
  getVegobjektVersjoner403Schema,
  getVegobjektVersjoner404Schema,
  getVegobjektVersjoner500Schema,
  getVegobjektVersjonerPathParamsSchema,
  getVegobjektVersjonerQueryParamsSchema,
} from './getVegobjektVersjonerSchema'

export const operations = {
  getVegobjektById: {
    request: undefined,
    parameters: {
      path: undefined,
      query: getVegobjektByIdQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjektByIdQueryResponseSchema,
      400: getVegobjektById400Schema,
      401: getVegobjektById401Schema,
      403: getVegobjektById403Schema,
      404: getVegobjektById404Schema,
      500: getVegobjektById500Schema,
      default: getVegobjektByIdQueryResponseSchema,
    },
    errors: {
      400: getVegobjektById400Schema,
      401: getVegobjektById401Schema,
      403: getVegobjektById403Schema,
      404: getVegobjektById404Schema,
      500: getVegobjektById500Schema,
    },
  },
  getVegobjekterByType: {
    request: undefined,
    parameters: {
      path: getVegobjekterByTypePathParamsSchema,
      query: getVegobjekterByTypeQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjekterByTypeQueryResponseSchema,
      400: getVegobjekterByType400Schema,
      401: getVegobjekterByType401Schema,
      403: getVegobjekterByType403Schema,
      404: getVegobjekterByType404Schema,
      500: getVegobjekterByType500Schema,
      default: getVegobjekterByTypeQueryResponseSchema,
    },
    errors: {
      400: getVegobjekterByType400Schema,
      401: getVegobjekterByType401Schema,
      403: getVegobjekterByType403Schema,
      404: getVegobjekterByType404Schema,
      500: getVegobjekterByType500Schema,
    },
  },
  getVegobjektById_1: {
    request: undefined,
    parameters: {
      path: getVegobjektById1PathParamsSchema,
      query: getVegobjektById1QueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjektById1QueryResponseSchema,
      400: getVegobjektById1400Schema,
      401: getVegobjektById1401Schema,
      403: getVegobjektById1403Schema,
      404: getVegobjektById1404Schema,
      500: getVegobjektById1500Schema,
      default: getVegobjektById1QueryResponseSchema,
    },
    errors: {
      400: getVegobjektById1400Schema,
      401: getVegobjektById1401Schema,
      403: getVegobjektById1403Schema,
      404: getVegobjektById1404Schema,
      500: getVegobjektById1500Schema,
    },
  },
  getVegobjektByIdAndVersjon: {
    request: undefined,
    parameters: {
      path: getVegobjektByIdAndVersjonPathParamsSchema,
      query: getVegobjektByIdAndVersjonQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjektByIdAndVersjonQueryResponseSchema,
      400: getVegobjektByIdAndVersjon400Schema,
      401: getVegobjektByIdAndVersjon401Schema,
      403: getVegobjektByIdAndVersjon403Schema,
      404: getVegobjektByIdAndVersjon404Schema,
      500: getVegobjektByIdAndVersjon500Schema,
      default: getVegobjektByIdAndVersjonQueryResponseSchema,
    },
    errors: {
      400: getVegobjektByIdAndVersjon400Schema,
      401: getVegobjektByIdAndVersjon401Schema,
      403: getVegobjektByIdAndVersjon403Schema,
      404: getVegobjektByIdAndVersjon404Schema,
      500: getVegobjektByIdAndVersjon500Schema,
    },
  },
  getVegobjektVersjoner: {
    request: undefined,
    parameters: {
      path: getVegobjektVersjonerPathParamsSchema,
      query: getVegobjektVersjonerQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjektVersjonerQueryResponseSchema,
      400: getVegobjektVersjoner400Schema,
      401: getVegobjektVersjoner401Schema,
      403: getVegobjektVersjoner403Schema,
      404: getVegobjektVersjoner404Schema,
      500: getVegobjektVersjoner500Schema,
      default: getVegobjektVersjonerQueryResponseSchema,
    },
    errors: {
      400: getVegobjektVersjoner400Schema,
      401: getVegobjektVersjoner401Schema,
      403: getVegobjektVersjoner403Schema,
      404: getVegobjektVersjoner404Schema,
      500: getVegobjektVersjoner500Schema,
    },
  },
} as const
export const paths = {
  '/api/v4/vegobjekt': {
    get: operations['getVegobjektById'],
  },
  '/api/v4/vegobjekter/{vegobjekttypeId}': {
    get: operations['getVegobjekterByType'],
  },
  '/api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}': {
    get: operations['getVegobjektById_1'],
  },
  '/api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/{versjon}': {
    get: operations['getVegobjektByIdAndVersjon'],
  },
  '/api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/versjoner': {
    get: operations['getVegobjektVersjoner'],
  },
} as const
