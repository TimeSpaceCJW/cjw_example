<script setup lang="ts">
import {useFetchApi} from "~/composables/useFetchApi";

const { data : admin, pending, error } = await useFetchApi('/admin')
</script>

<template>
    <NuxtExampleLayout repo="nuxt/examples" example="advanced/use-custom-fetch-composable">
        <h1 class="text-xl opacity-50">
            ADMIN 관리자 정보
        </h1>

        <p v-if="pending">Fetching...</p>
        <pre v-else-if="error">관리자정보 조회 불가 : {{ error.data }}</pre>
        <table v-else class="admin">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">관리자명</th>
                <th scope="col">부서명</th>
            </tr>
            <tr v-for="item in admin">
                <td>{{ item.id }}</td>
                <td>{{ item.name }}</td>
                <td>{{ item.deptname }}</td>
            </tr>
        </table>
    </NuxtExampleLayout>
</template>