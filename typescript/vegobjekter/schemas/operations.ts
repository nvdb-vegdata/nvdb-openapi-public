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
  getVegobjektByTypeAndIdQueryResponseSchema,
  getVegobjektByTypeAndId400Schema,
  getVegobjektByTypeAndId401Schema,
  getVegobjektByTypeAndId403Schema,
  getVegobjektByTypeAndId404Schema,
  getVegobjektByTypeAndId500Schema,
  getVegobjektByTypeAndIdPathParamsSchema,
  getVegobjektByTypeAndIdQueryParamsSchema,
} from './getVegobjektByTypeAndIdSchema'
import {
  getVegobjektByTypeIdAndVersjonQueryResponseSchema,
  getVegobjektByTypeIdAndVersjon400Schema,
  getVegobjektByTypeIdAndVersjon401Schema,
  getVegobjektByTypeIdAndVersjon403Schema,
  getVegobjektByTypeIdAndVersjon404Schema,
  getVegobjektByTypeIdAndVersjon500Schema,
  getVegobjektByTypeIdAndVersjonPathParamsSchema,
  getVegobjektByTypeIdAndVersjonQueryParamsSchema,
} from './getVegobjektByTypeIdAndVersjonSchema'
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
import {
  getVegobjektNotifikasjonerQueryResponseSchema,
  getVegobjektNotifikasjoner400Schema,
  getVegobjektNotifikasjoner401Schema,
  getVegobjektNotifikasjoner403Schema,
  getVegobjektNotifikasjoner404Schema,
  getVegobjektNotifikasjoner500Schema,
  getVegobjektNotifikasjonerPathParamsSchema,
  getVegobjektNotifikasjonerQueryParamsSchema,
} from './getVegobjektNotifikasjonerSchema'

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
  getVegobjektByTypeAndId: {
    request: undefined,
    parameters: {
      path: getVegobjektByTypeAndIdPathParamsSchema,
      query: getVegobjektByTypeAndIdQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjektByTypeAndIdQueryResponseSchema,
      400: getVegobjektByTypeAndId400Schema,
      401: getVegobjektByTypeAndId401Schema,
      403: getVegobjektByTypeAndId403Schema,
      404: getVegobjektByTypeAndId404Schema,
      500: getVegobjektByTypeAndId500Schema,
      default: getVegobjektByTypeAndIdQueryResponseSchema,
    },
    errors: {
      400: getVegobjektByTypeAndId400Schema,
      401: getVegobjektByTypeAndId401Schema,
      403: getVegobjektByTypeAndId403Schema,
      404: getVegobjektByTypeAndId404Schema,
      500: getVegobjektByTypeAndId500Schema,
    },
  },
  getVegobjektByTypeIdAndVersjon: {
    request: undefined,
    parameters: {
      path: getVegobjektByTypeIdAndVersjonPathParamsSchema,
      query: getVegobjektByTypeIdAndVersjonQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjektByTypeIdAndVersjonQueryResponseSchema,
      400: getVegobjektByTypeIdAndVersjon400Schema,
      401: getVegobjektByTypeIdAndVersjon401Schema,
      403: getVegobjektByTypeIdAndVersjon403Schema,
      404: getVegobjektByTypeIdAndVersjon404Schema,
      500: getVegobjektByTypeIdAndVersjon500Schema,
      default: getVegobjektByTypeIdAndVersjonQueryResponseSchema,
    },
    errors: {
      400: getVegobjektByTypeIdAndVersjon400Schema,
      401: getVegobjektByTypeIdAndVersjon401Schema,
      403: getVegobjektByTypeIdAndVersjon403Schema,
      404: getVegobjektByTypeIdAndVersjon404Schema,
      500: getVegobjektByTypeIdAndVersjon500Schema,
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
  getVegobjektNotifikasjoner: {
    request: undefined,
    parameters: {
      path: getVegobjektNotifikasjonerPathParamsSchema,
      query: getVegobjektNotifikasjonerQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjektNotifikasjonerQueryResponseSchema,
      400: getVegobjektNotifikasjoner400Schema,
      401: getVegobjektNotifikasjoner401Schema,
      403: getVegobjektNotifikasjoner403Schema,
      404: getVegobjektNotifikasjoner404Schema,
      500: getVegobjektNotifikasjoner500Schema,
      default: getVegobjektNotifikasjonerQueryResponseSchema,
    },
    errors: {
      400: getVegobjektNotifikasjoner400Schema,
      401: getVegobjektNotifikasjoner401Schema,
      403: getVegobjektNotifikasjoner403Schema,
      404: getVegobjektNotifikasjoner404Schema,
      500: getVegobjektNotifikasjoner500Schema,
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
    get: operations['getVegobjektByTypeAndId'],
  },
  '/api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/{versjon}': {
    get: operations['getVegobjektByTypeIdAndVersjon'],
  },
  '/api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/versjoner': {
    get: operations['getVegobjektVersjoner'],
  },
  '/api/v4/vegobjekter/{vegobjekttypeId}/endringer': {
    get: operations['getVegobjektNotifikasjoner'],
  },
} as const
