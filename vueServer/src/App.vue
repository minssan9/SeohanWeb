<template>
  <div class="container" id="app">
    <router-view/>
    <!-- <itDamage/> -->
  </div>
</template>

<script>
  import router from "./router";
export default {
  name: 'App',
  components:{
  }
}
</script>

<style>
@import url(https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css)

/* #app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
} */
</style>
