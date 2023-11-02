<script setup lang="ts">
import { useFetchApi} from "~/composables/useFetchApi";

const { data : product, pending, error } = await useFetchApi('/product')
</script>

<template>

</template>

<style scoped>

</style>