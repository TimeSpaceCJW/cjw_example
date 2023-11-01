<script setup lang="ts">
import {useFetchApi} from "~/composables/useFetchApi";

const { data } = await useFetchApi('/admin')
</script>

<template>
    <NuxtExampleLayout repo="nuxt/examples" example="advanced/use-custom-fetch-composable">
        <h1 class="text-xl opacity-50">
            ADMIN 관리자 정보
        </h1>

        <pre class="text-left text-xs">{{ data }}</pre>
    </NuxtExampleLayout>
</template>