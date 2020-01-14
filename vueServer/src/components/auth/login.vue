// components/Login.vue
<template>
  <div>
    <!-- <form @submit="onSubmit(companyCode, asabn, pass)"> -->
      <div class="form-group">
        <div class="btn-group" >
            <button id="SEOHAN" type="button" class="btn btn-default" value="SEOHAN" v-on:click="setCompanyCode('SEOHAN')" >서한</button>
            <button id="KAMTEC" type="button" class="btn btn-default" value="KAMTEC" v-on:click="setCompanyCode('SEOHAN')"  >캄텍</button>
            <button id="KOFCO" type="button" class="btn btn-default" value="KOFCO"  v-on:click="setCompanyCode('SEOHAN')">프랜지</button>
        </div>
        <p></p>
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
        <input type="submit" class="btn btn-primary" value="Login" @click="onSubmit"  />

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
import vuex, { mapActions } from "vuex";

export default {
  name: "Login",
  data() {
    return {
      companyCode: "",
      asabn: "",
      pass: ""
    };
  },
  methods: {
    setCompanyCode(companyCode) {
      this.companyCode = companyCode;
    },
    onSubmit() {
      try {
        // LOGIN 액션 실행
        var companyCode = this.companyCode;
        var asabn= this.asabn;
        var pass=this.pass;

        this.$store
          .dispatch("LOGIN", { companyCode, asabn, pass })
          .then(() => this.redirect())
          .catch(({ message }) => (this.msg = message));
        // console.log(loginResult); // 로그인 성공하면 true, 아니면 false
      } finally {
        console.log(); // 로그인 성공하면 true, 아니면 false
      }
    },
    redirect() {
      const { search } = window.location;
      const tokens = search.replace(/^\?/, "").split("&");
      const { returnPath } = tokens.reduce((qs, tkn) => {
        const pair = tkn.split("=");
        qs[pair[0]] = decodeURIComponent(pair[1]);
        return qs;
      }, {});

      // 리다이렉트 처리
      this.$router.push(returnPath);
    }
  },
  mounted(){
    // this.companyCode = 'SEOHAN';
    document.querySelector("#SEOHAN").click();
    // this.$refs.SEOHAN.click();
  },
};
</script>
