/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, { Component } from 'react'
import { Dimensions, StyleSheet, Text, View, TouchableOpacity, NativeModules } from 'react-native'
import RCTTextView from './TextView'

const TestModule = NativeModules.Test

export default class App extends Component {
  render () {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>Welcome to React Native!</Text>
        <TouchableOpacity onPress={() => TestModule.startActivity()}>
          <Text>打开原生的Activity</Text>
        </TouchableOpacity>
        <RCTTextView text={'我是原生的textView'} textSize={22}
                     style={{ width: Dimensions.get('window').width *0.85, height: 50,backgroundColor:'red' }} />
      </View>
    )
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#0ff',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
})
