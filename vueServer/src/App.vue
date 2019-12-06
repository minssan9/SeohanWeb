<template>
  <div class="container" id="app">
    <router-link to="/" exact>Home</router-link>
    <router-link to="/general/itdamage/list" exact>전산고장신고</router-link>
    <router-link to="/general/foodtable" exact>서한 식단표</router-link>
    <router-link to="/general/foodtablekamtec" exact>캄텍 식단표</router-link>
    <router-link v-if="loggedIn" to="/logout">Logout</router-link>
    <router-link v-else to="/login" exact>Login</router-link> 
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

.router-link-exact-active  {
  color: white;
  background-color: blue;
}
</style>
