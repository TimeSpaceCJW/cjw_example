import type { UseFetchOptions } from 'nuxt/app'
import { defu } from 'defu'

export function useFetchApi<T> (url: string | (() => string), options: UseFetchOptions<T> = {}) {
    const userAuth = useCookie('token')
    const config = useRuntimeConfig()

    const defaults: UseFetchOptions<T> = {
        baseURL: config.baseUrl ?? 'http://localhost:8080',
        key: url,

        // set user token if connected
        headers: userAuth.value
            ? { Authorization: `Bearer ${userAuth.value}` }
            : {},

        onResponse (_ctx) {
            // _ctx.response._data = new myBusinessResponse(_ctx.response._data)
        },

        onResponseError (_ctx) {
            // throw new myBusinessError()
        }
    }

    // for nice deep defaults, please use unjs/defu
    const params = defu(options, defaults)

    return useFetch(url, params)
}