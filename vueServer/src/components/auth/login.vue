<template>
  <div>
    <h2>Login</h2>
    <form @submit.prevent="login">
      <input type="text" v-model="email" />
      <input type="password" v-model="password" />
      <button type="submit">Login</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "itDamage",
  methods: {
    login() {
      Auth.login(this.email, this.password).then(() => {
        // 인증에 성공하면 이전 페이지로 이동한다
        this.$router.replace(this.$route.query.redirect || "/");
      });
    }
  }
};
</script>
