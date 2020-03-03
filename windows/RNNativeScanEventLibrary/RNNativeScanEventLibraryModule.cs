using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Native.Scan.Event.Library.RNNativeScanEventLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNNativeScanEventLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNNativeScanEventLibraryModule"/>.
        /// </summary>
        internal RNNativeScanEventLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNNativeScanEventLibrary";
            }
        }
    }
}
