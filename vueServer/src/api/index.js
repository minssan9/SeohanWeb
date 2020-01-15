
// export const Auth = {
//     login(email, pw) {
//         return new Promise((resolve, reject) => {
//           axios.post(`/api/auth/signin`, this._data).then(res => {
//             const token = res.headers.authorization;
//             localStorage.token = token
//             this.onChange(true)
//           }),
//           resolve({ token })
//         })
//     },
//     logout() {
//         return new Promise((resolve, reject) => {
//             delete localStorage.token
//             this.onChange(false)
//             resolve()
//         })
//     },
//     loggedIn() {
//         return !!localStorage.token
//     },
//     onChange() { }
// }
