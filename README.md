
# react-native-native-scan-event-library

## Getting started

`$ npm install react-native-native-scan-event-library --save`

### Mostly automatic installation

`$ react-native link react-native-native-scan-event-library`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-native-scan-event-library` and add `RNNativeScanEventLibrary.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNNativeScanEventLibrary.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNNativeScanEventLibraryPackage;` to the imports at the top of the file
  - Add `new RNNativeScanEventLibraryPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-native-scan-event-library'
  	project(':react-native-native-scan-event-library').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-native-scan-event-library/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-native-scan-event-library')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNNativeScanEventLibrary.sln` in `node_modules/react-native-native-scan-event-library/windows/RNNativeScanEventLibrary.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Native.Scan.Event.Library.RNNativeScanEventLibrary;` to the usings at the top of the file
  - Add `new RNNativeScanEventLibraryPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNNativeScanEventLibrary from 'react-native-native-scan-event-library';

// TODO: What to do with the module?
RNNativeScanEventLibrary;
```
  