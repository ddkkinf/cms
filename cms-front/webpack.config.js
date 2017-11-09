var path = require('path');

module.exports = {
    entry: './src/index.js',
    output: {
        path: path.join(__dirname, 'target', 'classes', 'META-INF', 'resources', 'webjars'),
        filename: 'app-bundle.js'
    },
    resolve: {
        extensions: ['.js', '.vue', 'json'],
        alias: {
            'vue$': 'vue/dist/vue.esm.js'
        }
    },
    module: {
        rules: [{
            test: /\.js$/,
            loader: 'babel-loader',
            exclude: /(node_modules)/,
            query: {
                presets: ['es2015']
            }
        }, {
            test: /\.vue$/,
            loader: "vue-loader"
        }]
    },
    devServer: {
        port: 8080,
        proxy: {
            "/api": {
                target: "http://localhost:26080"
            }
        }
    }
};