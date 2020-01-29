<template>
  <div id="app">
    <nav class="navbar navbar-light bg-light">
      <div  >
        <a class="navbar-brand" href="/">
          <img src="@/assets/seohanico.jpg" width="30" height="30" alt />
        </a>
        <a class="navbar-brand" href="/general/itdamage/list" exact>전산고장신고</a>
        <a class="navbar-brand" href="/general/report/list" exact>공정신고</a>
        <a class="navbar-brand" href="/general/foodtable" exact>식단표</a>
        <!-- <a class="navbar-brand" v-if="currentUser" href @click.prevent="onClickLogout">Logout</a>
        <a class="navbar-brand" v-if="!currentUser" href="/login" exact>Login</a>
        <a class="navbar-brand" v-if="currentUser" href="/me">Me</a> -->
      </div>

      <div class="navbar-nav ml-auto" v-if="!currentUser">
        <li class="nav-item">
          <a href="/login" class="nav-link">
            <font-awesome-icon icon="sign-in-alt" />Login
          </a>
        </li>
      </div>
      <div class="navbar-nav ml-auto" v-if="currentUser">
        <li class="nav-item">
          <a href="/profile" class="nav-link">
            <font-awesome-icon icon="user" />
            {{currentUser.asabn}}
          </a>
        </li>
        <li class="nav-item">
          <a href class="nav-link" @click="logOut">
            <font-awesome-icon icon="sign-out-alt" />LogOut
          </a>
        </li>
      </div>
    </nav>
    <div class="container">
      <router-view />
    </div>
  </div>
</template>

<script>
export default {
  computed: {
    isAuthenticated() {
      return this.$store.getters.isAuthenticated;
    },
    currentUser() {
      return this.$store.state.auth.user;
    }
  },
  methods: {
    logOut() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    }
  }
};
</script>

<style>
/* @import url(https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css); */
@import url(https://unpkg.com/bootstrap@3.1.1/dist/css/bootstrap.min.css);
</style>
