<template>
  <div class="container">
    <nav class="navbar navbar-light bg-light">
      <a class="navbar-brand" href="/">
        <img src="@/assets/seohanico.jpg" width="30" height="30" alt="">
      </a>
      <a class="navbar-brand" href="/general/itdamage/list" exact>전산고장신고</a>
      <a class="navbar-brand" href="/general/report/list" exact>공정신고</a>
      <a class="navbar-brand" href="/general/foodtable" exact>식단표</a>
      <!-- <a class="navbar-brand" href="/general/foodtablekamtec" exact>캄텍 식단표</a> -->
      <a class="navbar-brand" v-if="loggedIn" to="/logout">Logout</a>
      <a class="navbar-brand" v-else to="/login" exact>Login</a>
    </nav>
    <router-view></router-view>
  </div>
</template>
