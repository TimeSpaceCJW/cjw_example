export default defineNuxtConfig({
  ssr: false,
  pages: true,
  components: true,
  imports: {
    autoImport: true
  },
  app:{
    buildAssetsDir: "_nuxt",
    head: {
      title: "상품관리 ADMIN",
      htmlAttrs: { lang: "ko" },
      charset: "utf-8",
      link: [
        {
          rel: "icon",
          type: "image/png",
          href: "/favicon.png",
        },
      ],
    }
  },
  css: [
    //"@progress/kendo-theme-default/dist/all.css", kendoUi 사용시 주석해제
    "vuetify/lib/styles/main.sass"
  ],
  modules: [
    "@pinia/nuxt",
    "@pinia-plugin-persistedstate/nuxt",
    "@invictus.codes/nuxt-vuetify",
  ],
  nitro: {
    serveStatic: true,
  },
  vuetify: {
  },
  vite: {
  },
});

