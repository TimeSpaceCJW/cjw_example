<template>
    <div>
        <ADMIN></ADMIN>
        <router-view></router-view>
    </div>
</template>

<script>

import ADMIN from './pages/admin.vue'

export default {

    component: {

        ADMIN

    }

}

</script>