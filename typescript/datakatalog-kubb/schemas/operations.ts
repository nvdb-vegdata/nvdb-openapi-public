import {
  getVersjonQueryResponseSchema,
  getVersjon404Schema,
  getVersjon500Schema,
  getVersjon503Schema,
} from './getVersjonSchema'
import {
  getVegobjekttyperQueryResponseSchema,
  getVegobjekttyper404Schema,
  getVegobjekttyper500Schema,
  getVegobjekttyper503Schema,
  getVegobjekttyperQueryParamsSchema,
} from './getVegobjekttyperSchema'
import {
  getVegobjekttypeQueryResponseSchema,
  getVegobjekttype404Schema,
  getVegobjekttype500Schema,
  getVegobjekttype503Schema,
  getVegobjekttypePathParamsSchema,
  getVegobjekttypeQueryParamsSchema,
} from './getVegobjekttypeSchema'
import {
  getEgenskapstypeForVegobjekttypeQueryResponseSchema,
  getEgenskapstypeForVegobjekttype404Schema,
  getEgenskapstypeForVegobjekttype500Schema,
  getEgenskapstypeForVegobjekttype503Schema,
  getEgenskapstypeForVegobjekttypePathParamsSchema,
} from './getEgenskapstypeForVegobjekttypeSchema'
import {
  getProduktspesifikasjonQueryResponseSchema,
  getProduktspesifikasjon404Schema,
  getProduktspesifikasjon500Schema,
  getProduktspesifikasjon503Schema,
  getProduktspesifikasjonPathParamsSchema,
} from './getProduktspesifikasjonSchema'
import {
  getVegobjekttyperHistoriskQueryResponseSchema,
  getVegobjekttyperHistorisk404Schema,
  getVegobjekttyperHistorisk500Schema,
  getVegobjekttyperHistorisk503Schema,
  getVegobjekttyperHistoriskPathParamsSchema,
  getVegobjekttyperHistoriskQueryParamsSchema,
} from './getVegobjekttyperHistoriskSchema'
import {
  getKategorierQueryResponseSchema,
  getKategorier404Schema,
  getKategorier500Schema,
  getKategorier503Schema,
} from './getKategorierSchema'
import {
  getEnheterQueryResponseSchema,
  getEnheter404Schema,
  getEnheter500Schema,
  getEnheter503Schema,
} from './getEnheterSchema'
import {
  getEgenskapstypeQueryResponseSchema,
  getEgenskapstype404Schema,
  getEgenskapstype500Schema,
  getEgenskapstype503Schema,
  getEgenskapstypePathParamsSchema,
} from './getEgenskapstypeSchema'
import {
  getEgenskapstypeKategorierQueryResponseSchema,
  getEgenskapstypeKategorier404Schema,
  getEgenskapstypeKategorier500Schema,
  getEgenskapstypeKategorier503Schema,
} from './getEgenskapstypeKategorierSchema'

export const operations = {
  getVersjon: {
    request: undefined,
    parameters: {
      path: undefined,
      query: undefined,
      header: undefined,
    },
    responses: {
      200: getVersjonQueryResponseSchema,
      404: getVersjon404Schema,
      500: getVersjon500Schema,
      503: getVersjon503Schema,
      default: getVersjonQueryResponseSchema,
    },
    errors: {
      404: getVersjon404Schema,
      500: getVersjon500Schema,
      503: getVersjon503Schema,
    },
  },
  getVegobjekttyper: {
    request: undefined,
    parameters: {
      path: undefined,
      query: getVegobjekttyperQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjekttyperQueryResponseSchema,
      404: getVegobjekttyper404Schema,
      500: getVegobjekttyper500Schema,
      503: getVegobjekttyper503Schema,
      default: getVegobjekttyperQueryResponseSchema,
    },
    errors: {
      404: getVegobjekttyper404Schema,
      500: getVegobjekttyper500Schema,
      503: getVegobjekttyper503Schema,
    },
  },
  getVegobjekttype: {
    request: undefined,
    parameters: {
      path: getVegobjekttypePathParamsSchema,
      query: getVegobjekttypeQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjekttypeQueryResponseSchema,
      404: getVegobjekttype404Schema,
      500: getVegobjekttype500Schema,
      503: getVegobjekttype503Schema,
      default: getVegobjekttypeQueryResponseSchema,
    },
    errors: {
      404: getVegobjekttype404Schema,
      500: getVegobjekttype500Schema,
      503: getVegobjekttype503Schema,
    },
  },
  getEgenskapstypeForVegobjekttype: {
    request: undefined,
    parameters: {
      path: getEgenskapstypeForVegobjekttypePathParamsSchema,
      query: undefined,
      header: undefined,
    },
    responses: {
      200: getEgenskapstypeForVegobjekttypeQueryResponseSchema,
      404: getEgenskapstypeForVegobjekttype404Schema,
      500: getEgenskapstypeForVegobjekttype500Schema,
      503: getEgenskapstypeForVegobjekttype503Schema,
      default: getEgenskapstypeForVegobjekttypeQueryResponseSchema,
    },
    errors: {
      404: getEgenskapstypeForVegobjekttype404Schema,
      500: getEgenskapstypeForVegobjekttype500Schema,
      503: getEgenskapstypeForVegobjekttype503Schema,
    },
  },
  getProduktspesifikasjon: {
    request: undefined,
    parameters: {
      path: getProduktspesifikasjonPathParamsSchema,
      query: undefined,
      header: undefined,
    },
    responses: {
      200: getProduktspesifikasjonQueryResponseSchema,
      404: getProduktspesifikasjon404Schema,
      500: getProduktspesifikasjon500Schema,
      503: getProduktspesifikasjon503Schema,
      default: getProduktspesifikasjonQueryResponseSchema,
    },
    errors: {
      404: getProduktspesifikasjon404Schema,
      500: getProduktspesifikasjon500Schema,
      503: getProduktspesifikasjon503Schema,
    },
  },
  getVegobjekttyperHistorisk: {
    request: undefined,
    parameters: {
      path: getVegobjekttyperHistoriskPathParamsSchema,
      query: getVegobjekttyperHistoriskQueryParamsSchema,
      header: undefined,
    },
    responses: {
      200: getVegobjekttyperHistoriskQueryResponseSchema,
      404: getVegobjekttyperHistorisk404Schema,
      500: getVegobjekttyperHistorisk500Schema,
      503: getVegobjekttyperHistorisk503Schema,
      default: getVegobjekttyperHistoriskQueryResponseSchema,
    },
    errors: {
      404: getVegobjekttyperHistorisk404Schema,
      500: getVegobjekttyperHistorisk500Schema,
      503: getVegobjekttyperHistorisk503Schema,
    },
  },
  getKategorier: {
    request: undefined,
    parameters: {
      path: undefined,
      query: undefined,
      header: undefined,
    },
    responses: {
      200: getKategorierQueryResponseSchema,
      404: getKategorier404Schema,
      500: getKategorier500Schema,
      503: getKategorier503Schema,
      default: getKategorierQueryResponseSchema,
    },
    errors: {
      404: getKategorier404Schema,
      500: getKategorier500Schema,
      503: getKategorier503Schema,
    },
  },
  getEnheter: {
    request: undefined,
    parameters: {
      path: undefined,
      query: undefined,
      header: undefined,
    },
    responses: {
      200: getEnheterQueryResponseSchema,
      404: getEnheter404Schema,
      500: getEnheter500Schema,
      503: getEnheter503Schema,
      default: getEnheterQueryResponseSchema,
    },
    errors: {
      404: getEnheter404Schema,
      500: getEnheter500Schema,
      503: getEnheter503Schema,
    },
  },
  getEgenskapstype: {
    request: undefined,
    parameters: {
      path: getEgenskapstypePathParamsSchema,
      query: undefined,
      header: undefined,
    },
    responses: {
      200: getEgenskapstypeQueryResponseSchema,
      404: getEgenskapstype404Schema,
      500: getEgenskapstype500Schema,
      503: getEgenskapstype503Schema,
      default: getEgenskapstypeQueryResponseSchema,
    },
    errors: {
      404: getEgenskapstype404Schema,
      500: getEgenskapstype500Schema,
      503: getEgenskapstype503Schema,
    },
  },
  getEgenskapstypeKategorier: {
    request: undefined,
    parameters: {
      path: undefined,
      query: undefined,
      header: undefined,
    },
    responses: {
      200: getEgenskapstypeKategorierQueryResponseSchema,
      404: getEgenskapstypeKategorier404Schema,
      500: getEgenskapstypeKategorier500Schema,
      503: getEgenskapstypeKategorier503Schema,
      default: getEgenskapstypeKategorierQueryResponseSchema,
    },
    errors: {
      404: getEgenskapstypeKategorier404Schema,
      500: getEgenskapstypeKategorier500Schema,
      503: getEgenskapstypeKategorier503Schema,
    },
  },
} as const
export const paths = {
  '/api/v1/versjon': {
    get: operations['getVersjon'],
  },
  '/api/v1/vegobjekttyper': {
    get: operations['getVegobjekttyper'],
  },
  '/api/v1/vegobjekttyper/{vegobjekttypeid}': {
    get: operations['getVegobjekttype'],
  },
  '/api/v1/vegobjekttyper/{vegobjekttypeid}/{egenskapstypeid}': {
    get: operations['getEgenskapstypeForVegobjekttype'],
  },
  '/api/v1/vegobjekttyper/{vegobjekttypeid}/produktspesifikasjon': {
    get: operations['getProduktspesifikasjon'],
  },
  '/api/v1/vegobjekttyper/historisk/{versjon}': {
    get: operations['getVegobjekttyperHistorisk'],
  },
  '/api/v1/kategorier': {
    get: operations['getKategorier'],
  },
  '/api/v1/enheter': {
    get: operations['getEnheter'],
  },
  '/api/v1/egenskapstyper/{egenskapstypeid}': {
    get: operations['getEgenskapstype'],
  },
  '/api/v1/egenskapstypekategorier': {
    get: operations['getEgenskapstypeKategorier'],
  },
} as const
