
export const Auth = {
    login(email, pw) {
        return new Promise((resolve, reject) => {
            if (email !== 'test@test.com' || pw !== 'password123') return reject()
            const token = Math.random().toString(36).substring(2)
            localStorage.token = token
            this.onChange(true)
            resolve({ token })
        })
    },
    logout() {
        return new Promise((resolve, reject) => {
            delete localStorage.token
            this.onChange(false)
            resolve()
        })
    },
    loggedIn() {
        return !!localStorage.token
    },
    onChange() { }
}