<script setup lang="ts">
import { useFetchApi} from "~/composables/useFetchApi";

const { data } = await useFetchApi('/product')
</script>

<template>
    <NuxtExampleLayout repo="nuxt/examples" example="advanced/use-custom-fetch-composable">
        <h1 class="text-xl opacity-50">
            ADMIN 상품 관리
        </h1>

        <pre class="text-left text-xs">{{ data }}</pre>
    </NuxtExampleLayout>
</template>

<style scoped>

</style>