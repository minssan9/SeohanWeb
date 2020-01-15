// components/Login.vue
<template>
  <div>
      <div class="form-group">
        <div class="btn-group" >
            <button id="SEOHAN" type="button" class="btn btn-default" value="SEOHAN" v-on:click="setCompanyCode('SEOHAN')" >서한</button>
            <button id="KAMTEC" type="button" class="btn btn-default" value="KAMTEC" v-on:click="setCompanyCode('SEOHAN')"  >캄텍</button>
            <button id="KOFCO" type="button" class="btn btn-default" value="KOFCO"  v-on:click="setCompanyCode('SEOHAN')">프랜지</button>
        </div>
        <p></p>
        <label for="ID">ID</label>
        <input type="text" v-model="asabn" name="asabn" class="form-control" />
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" v-model="pass" name="pass" class="form-control" />
      </div>
      <div class="form-group">
        <input type="submit" class="btn btn-primary" value="Login" @click="onSubmit"  />

      </div>
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
      var companyCode = this.companyCode;
      var asabn= this.asabn;
      var pass=this.pass;

      this.$store
        .dispatch("LOGIN", { companyCode, asabn, pass })
        .then(() => this.redirect())
        .catch(({ message }) => (this.msg = message));
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
