<template>
  <div class="container" id="app"> 
    <nav class="navbar navbar-light bg-light">
      <a class="navbar-brand" href="/">
        <img src="@/assets/seohanico.jpg" width="30" height="30" alt="">
      </a>
      <a class="navbar-brand" href="/general/itdamage/list" exact>전산고장신고</a>
      <a class="navbar-brand" href="/general/report/list" exact>공정신고</a>
      <a class="navbar-brand" href="/general/foodtable" exact>서한 식단표</a>
      <a class="navbar-brand" href="/general/foodtablekamtec" exact>캄텍 식단표</a>
      <a class="navbar-brand" v-if="loggedIn" to="/logout">Logout</a>
      <a class="navbar-brand" v-else to="/login" exact>Login</a>      
    </nav>
    <router-view />
  </div>
</template>

<script>
import router from "./router";
import { Auth } from "./api";

export default {
  name: "App",
  data() {
    return {
      loggedIn: Auth.loggedIn()
    };
  },
  created() {
    Auth.onChange = loggedIn => {
      console.log("onchage", loggedIn);
      this.loggedIn = loggedIn;
    };
  },
  components: {}
};
</script>

<style>
@import url(https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css);
</style>
