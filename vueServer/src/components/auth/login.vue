// components/Login.vue
<template>
  <div>
    <!-- <form @submit="onSubmit"> -->
    <div class="form-group">
      <label for="ID">ID</label>
      <input type="text" v-model="asabn" name="asabn" class="form-control" />
      <!-- :class="{ 'is-invalid': submitted && !id }" -->
      <!-- <div v-show="submitted && !id" class="invalid-feedback">id is required</div> -->
    </div>
    <div class="form-group">
      <label for="password">Password</label>
      <input type="password" v-model="pass" name="pass" class="form-control" />
      <!-- :class="{ 'is-invalid': submitted && !pass }" -->
      <!-- <div v-show="submitted && !pass" class="invalid-feedback">pass is required</div> -->
    </div>
    <div class="form-group">
      <input type="submit" class="btn btn-primary" value="Login" @click="onSubmit" />
      <!-- <img
        v-show="status.loggingIn"
        src="data:image/gif;base64,R0lGODlhEAAQAPIAAP///wAAAMLCwkJCQgAAAGJiYoKCgpKSkiH/C05FVFNDQVBFMi4wAwEAAAAh/hpDcmVhdGVkIHdpdGggYWpheGxvYWQuaW5mbwAh+QQJCgAAACwAAAAAEAAQAAADMwi63P4wyklrE2MIOggZnAdOmGYJRbExwroUmcG2LmDEwnHQLVsYOd2mBzkYDAdKa+dIAAAh+QQJCgAAACwAAAAAEAAQAAADNAi63P5OjCEgG4QMu7DmikRxQlFUYDEZIGBMRVsaqHwctXXf7WEYB4Ag1xjihkMZsiUkKhIAIfkECQoAAAAsAAAAABAAEAAAAzYIujIjK8pByJDMlFYvBoVjHA70GU7xSUJhmKtwHPAKzLO9HMaoKwJZ7Rf8AYPDDzKpZBqfvwQAIfkECQoAAAAsAAAAABAAEAAAAzMIumIlK8oyhpHsnFZfhYumCYUhDAQxRIdhHBGqRoKw0R8DYlJd8z0fMDgsGo/IpHI5TAAAIfkECQoAAAAsAAAAABAAEAAAAzIIunInK0rnZBTwGPNMgQwmdsNgXGJUlIWEuR5oWUIpz8pAEAMe6TwfwyYsGo/IpFKSAAAh+QQJCgAAACwAAAAAEAAQAAADMwi6IMKQORfjdOe82p4wGccc4CEuQradylesojEMBgsUc2G7sDX3lQGBMLAJibufbSlKAAAh+QQJCgAAACwAAAAAEAAQAAADMgi63P7wCRHZnFVdmgHu2nFwlWCI3WGc3TSWhUFGxTAUkGCbtgENBMJAEJsxgMLWzpEAACH5BAkKAAAALAAAAAAQABAAAAMyCLrc/jDKSatlQtScKdceCAjDII7HcQ4EMTCpyrCuUBjCYRgHVtqlAiB1YhiCnlsRkAAAOwAAAAAAAAAAAA=="
      />
      <router-link to="/register" class="btn btn-link">Register</router-link>-->
    </div>
    <!-- </form> -->
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Login",
  data() {
    return {
      asabn: "",
      pass: ""
    };
  },
  methods: {
    onSubmit() {
      // Auth.login(this.asabn, this.pass).then(() => {
      //   // 인증에 성공하면 이전 페이지로 이동한다
      //   this.$router.replace(this.$route.query.redirect || "/");
      // });
      // axios.post('/api/' + route +'/save', data);
      axios.post(`/api/auth/signin`, this.data).then(res => {
        console.log(res);
        this.$router.replace(this.$route.query.redirect || "/");
      });
    }
  }
};
</script>
