<script setup lang="ts">

import { useFetchApi} from "~/composables/useFetchApi";

interface ProductData {
    id: number;
    name: string;
    detail: string;
    price: string;
}

const productItem = reactive<ProductData>({
    productId: "",
    productName: "",
    productDetail: "",
    productPrice: "",
});

const onProductDetail = async (id: string | string[]) => {
    const { data, error } = await useFetchApi(
        `/productdetail/${productItem.id}`
    );

    const productDetail = ref<ProductData>();
    productDetail.value = data.value as ProductData;

    if(productDetail) {
        productItem.productId = productDetail.value.id;
        productItem.productName = productDetail.value.name;
        productItem.productDetail = productDetail.value.detail;
        productItem.productPrice = productDetail.value.price;
    }
};



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