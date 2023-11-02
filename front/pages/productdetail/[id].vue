<script setup lang="ts">

import { useFetchApi} from "~/composables/useFetchApi";

const onProductDetail = async (id: string | string[]) => {
    const { data, error } = await useFetchApi(
        `/productdetail/${route.params.id as string}`
    );

    const productDetail = ref<ProductData>();
    productDetail.value = data.value as ProductData;

    if(productDetail) {
        productItem.id = productDetail.value.id;
        productItem.name = productDetail.value.name;
        productItem.detail = productDetail.value.detail;
        productItem.price = productDetail.value.price;
    }
};

interface ProductData {
    id: string;
    name: string;
    detail: string;
    price: string;
}
const route =useRoute();
const productItem = reactive<ProductData>({
    id: "",
    name: "",
    detail: "",
    price: "",
});

console.log(productItem.id);

</script>

<template>
    <h1 class="text-xl opacity-50">
        ADMIN 상품 상세
    </h1>

    <table>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">상품명</th>
            <th scope="col">상품 상세정보</th>
            <th scope="col">금액</th>
        </tr>
        <tr>
            <td>{{ productItem.id }}</td>
            <td>{{ productItem.name }}</td>
            <td>{{ productItem.detail }}</td>
            <td>{{ productItem.price }}</td>
        </tr>
    </table>
</template>

<style scoped>

</style>