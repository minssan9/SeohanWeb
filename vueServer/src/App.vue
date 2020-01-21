<template>
  <div class="container" id="app">
    <router-view />
  </div>
</template>

<script>
import router from "./router";
// import { Auth } from "./api";

const route = "";
export default {
  name: "App",
  data() {
    return {
      // loggedIn: Auth.loggedIn()
    };
  },
  render() {
    // return <link rel="icon" href='@/assets/icon/seohanico.png' />;
  },
  created() {
    // Auth.onChange = loggedIn => {
    //   console.log("onchage", loggedIn);

    //   this.loggedIn = loggedIn;
    // };
  },
  components: {}
};
</script>

<style>
/* @import url(https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css); */
@import url(https://unpkg.com/bootstrap@3.1.1/dist/css/bootstrap.min.css);
</style>
