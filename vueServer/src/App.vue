<template>
  <!-- <div id="seohan" :class="[{'collapsed' : collapsed}]"> -->
  <div>
    <!-- <div class="container">
      <router-view />
    </div>
    <sidebar-menu
        :menu="menu"
        :collapsed="collapsed"
        :theme="selectedTheme"
        :show-one-child="true"
        @toggle-collapse="onToggleCollapse"
        @item-click="onItemClick"
    />-->
    <!-- id="wrapper"  -->

    <div v-bind:id="wrapper" v-bind:class="{toggleClass}">
      <div id="sidebar-wrapper">
        <nav class="sidebar">
          <ul class="sidebar__toggled">
            <li>
              <a href="javascript:void(0)" id="main-toggle" class="sidebar-toggle" v-on:click="toggle">Menu</a>
            </li>
          </ul>
        </nav>
        <nav class="sidebar">
          <ul>
            <li class="title">Item Group</li>
            <li>
              <a>
                <span class="icon glyphicon glyphicon-link"></span>Link1
              </a>
            </li>
            <li>
              <a>
                <span class="icon glyphicon glyphicon-link"></span>link2
              </a>
            </li>
            <li>
              <a class="dropdown-toggle" href="#">
                <span class="icon glyphicon glyphicon-link"></span>Sub menu
              </a>
              <ul class="dropdown-menu" data-role="dropdown">
                <li>
                  <a href="#">Subitem 1</a>
                </li>
                <li>
                  <a href="#">Subitem 2</a>
                </li>
                <li>
                  <a href="#">Subitem 3</a>
                </li>
                <li class="divider"></li>
                <li>
                  <a href>Subitem 4</a>
                </li>
                <li class="disabled">
                  <a href="#">Subitem 4</a>
                </li>
              </ul>
            </li>
          </ul>
        </nav>
      </div>
      <div id="page-content-wrapper">
        <button class="btn btn-default sidebar-toggle" v-on:click="toggle">Toggle Sidebar</button>
        <router-view />
      </div>
      <!--
        <a class="navbar-brand" href="/">
          <img src="@/assets/seohanico.jpg" width="30" height="30" alt />
        </a>
          <a class="navbar-brand" v-if="currentUser" href @click.prevent="onClickLogout">Logout</a>
        <a class="navbar-brand" v-if="!currentUser" href="/login" exact>Login</a>
        <a class="navbar-brand" v-if="currentUser" href="/me">Me</a>
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
      </div>-->
    </div>
  </div>
</template>

<script>
import { SidebarMenu } from "vue-sidebar-menu";

const separator = {
  template: `<hr style="border-color: rgba(0, 0, 0, 0.1); margin: 20px;">`
};

export default {
  name: "App",
  data() {
    return {
      //   menu: [
      //     {
      //       header: true,
      //       title: "Seohan Group",
      //       hiddenOnCollapse: true
      //     },
      //     {
      //       href: "/",
      //       title: "Dashboard",
      //       img: "@/assets/seohanico.jpg",
      //       icon: "fa fa-user"
      //     },
      //     {
      //       href: "/general/itdamage/list",
      //       title: "전산고장신고",
      //       icon: "fa fa-chart-area",
      //       child: [
      //         {
      //           href: "/general/itdamage/new",
      //           title: "등록"
      //         }
      //       ]
      //     },
      //     {
      //       href: "/general/report/list",
      //       title: "공정신고",
      //       icon: "fa fa-user",
      //       child: [
      //         {
      //           href: "/general/report/new",
      //           title: "등록"
      //         }
      //       ]
      //     },
      //     {
      //       component: separator
      //     },
      //     {
      //       href: "/",
      //       title: "식단표",
      //       icon: "fa fa-user"
      //     }
      //   ],
      //   collapsed: false,
      //   themes: [
      //     {
      //       name: "Default theme",
      //       input: ""
      //     },
      //     {
      //       name: "White theme",
      //       input: "white-theme"
      //     }
      //   ],
      //   selectedTheme: ""
    };
  },
  mounted() {
    // $(".sidebar-toggle").click(function(e) {
    //   e.preventDefault();
    //   $("#wrapper").toggleClass("toggled");
    // });
    // $("[data-role=dropdown]").dropdown();
  },
  computed: {
    isAuthenticated() {
      return this.$store.getters.isAuthenticated;
    },
    currentUser() {
      return this.$store.state.auth.user;
    }
  },
  methods: {
    toggle(){
      toggleClass:'toggled'
      // this.wrapper toggleClass('toggled')
    },
    logOut() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },
    onToggleCollapse(collapsed) {
      console.log(collapsed);
      this.collapsed = collapsed;
    },
    onItemClick(event, item) {
      console.log("onItemClick");
      // console.log(event)
      // console.log(item)
    }
  }
};
</script>

<style>
@import url("https://unpkg.com/bootstrap@3.1.1/dist/css/bootstrap.min.css");
@import url("https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600");

@import url("https://use.fontawesome.com/releases/v5.0.13/js/solid.js");
@import url("https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js");

#wrapper {
  padding-left: 50px;
  transition: all 0.5s ease;
}
#wrapper.toggled {
  padding-left: 250px;
}

#sidebar-wrapper {
  z-index: 1000;
  position: fixed;
  left: -200px;
  width: 250px;
  height: 100%;
  overflow-y: auto;
  background: #000;
  padding-top: 15px;
  transition: all 0.5s ease;
}
#wrapper.toggled #sidebar-wrapper {
  left: -250px;
  margin-left: 250px;
}

#page-content-wrapper {
  width: 100%;
  padding: 15px;
}
#wrapper.toggled #page-content-wrapper {
  position: absolute;
  margin-right: -50px;
}

/* Sidebar Styles */

.sidebar {
  margin: 0;
  padding: 0;
}
.sidebar li.title {
  letter-spacing: 0.01em;
  font-size: 2rem;
  line-height: 4.2rem;
}
.sidebar ul {
  margin: 0;
  padding-left: 20px;
  list-style: none;
}
.sidebar ul li {
  display: block;
}
.sidebar ul li a {
  display: block;
  position: relative;
  text-decoration: none;
  color: #999999;
}
.sidebar ul li a [class*="icon"] {
  margin-right: 15px;
}
.sidebar ul li a#main-toggle:after,
.sidebar ul li a.dropdown-toggle:after {
  right: 20px;
  bottom: 5px;
}
.sidebar .sidebar__main {
  border-bottom: 1px solid #373737;
}
.sidebar .sidebar__toggled {
  font-size: 2rem;
  line-height: 3.4rem;
}
.sidebar ul li.title,
.sidebar .sidebar__main--brand a {
  color: #999999;
}

.dropdown-toggle {
  padding-right: 20px;
}
#main-toggle:after,
.dropdown-toggle:after {
  font-family: "Glyphicons Halflings";
  font-size: 0.7em;
  position: absolute;
  margin-left: 0.25em;
  bottom: 0;
  content: "\e114";
}

.sidebar__toggled {
  border-bottom: 1px solid #444;
}
#main-toggle:after {
  font-size: 1em;
  content: "\e055";
}

@media (min-width: 768px) {
  #wrapper {
    padding-left: 250px;
  }

  #wrapper.toggled {
    padding-left: 50px;
  }

  #sidebar-wrapper {
    left: 250px;
    margin-left: -250px;
  }

  #wrapper.toggled #sidebar-wrapper {
    left: -200px;
    margin-left: 0;
  }

  #page-content-wrapper {
    padding: 20px;
  }

  #wrapper.toggled #page-content-wrapper {
    position: relative;
    margin-right: 50px;
  }
}

/* --------------------------------- */
#body-row {
  margin-left: 0;
  margin-right: 0;
}
#sidebar-container {
  min-height: 100vh;
  background-color: #333;
  padding: 0;
}

/* Sidebar sizes when expanded and expanded */
.sidebar-expanded {
  width: 230px;
}
.sidebar-collapsed {
  width: 60px;
}

/* Menu item*/
#sidebar-container .list-group a {
  height: 50px;
  color: white;
}

/* Submenu item*/
#sidebar-container .list-group .sidebar-submenu a {
  height: 45px;
  padding-left: 30px;
}
.sidebar-submenu {
  font-size: 0.9rem;
}

/* Separators */
.sidebar-separator-title {
  background-color: #333;
  height: 35px;
}
.sidebar-separator {
  background-color: #333;
  height: 25px;
}
.logo-separator {
  background-color: #333;
  height: 60px;
}

/* Closed submenu icon */
#sidebar-container
  .list-group
  .list-group-item[aria-expanded="false"]
  .submenu-icon::after {
  content: " \f0d7";
  font-family: FontAwesome;
  display: inline;
  text-align: right;
  padding-left: 10px;
}
/* Opened submenu icon */
#sidebar-container
  .list-group
  .list-group-item[aria-expanded="true"]
  .submenu-icon::after {
  content: " \f0da";
  font-family: FontAwesome;
  display: inline;
  text-align: right;
  padding-left: 10px;
}
</style>
