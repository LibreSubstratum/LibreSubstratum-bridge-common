package com.jereksel.libresubstratum.bridgecommon;

import com.jereksel.libresubstratum.bridgecommon.OverlayInfo;

interface ILibreSubstratumService {

    OverlayInfo getOverlayInfo(in String overlayId);
    List<OverlayInfo> getOverlaysForPackage(in String packageId);

    void enableOverlay(in String overlayId);
    void disableOverlay(in String overlayId);

    void installPackage(in List<String> paths);
    void uninstallPackages(in List<String> packages);

    void restartSystemUI();

}
