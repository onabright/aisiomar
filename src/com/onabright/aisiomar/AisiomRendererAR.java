/*==============================================================================
Aisiom Augmented Reality Project
Bright Onapito | 2013

Class for Rendering 3D objects scanned from image targets.

==============================================================================*/



package com.onabright.aisiomar;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView;

import com.qualcomm.QCAR.QCAR;


/** The renderer class for Aisiom AR app */
public class AisiomRendererAR implements GLSurfaceView.Renderer
{
    public boolean mIsActive = false;

    /** Reference to main activity **/
    public AisiomLaunchAR mActivity;

    /** Native function for initializing the renderer. */
    public native void initRendering();

    /** Native function to update the renderer. */
    public native void updateRendering(int width, int height);


    /** Called when the surface is created or recreated. */
    public void onSurfaceCreated(GL10 gl, EGLConfig config)
    {
       DebugLogAR.LOGD("GLRenderer::onSurfaceCreated"); 

        // Call native function to initialize rendering:
        initRendering();

        // Call QCAR function to (re)initialize rendering after first use
        // or after OpenGL ES context was lost (e.g. after onPause/onResume):
        QCAR.onSurfaceCreated();
    }


    /** Called when the surface changed size. */
    public void onSurfaceChanged(GL10 gl, int width, int height)
    {
       DebugLogAR.LOGD("GLRenderer::onSurfaceChanged"); 

        // Call native function to update rendering when render surface
        // parameters have changed:
        updateRendering(width, height);

        // Call QCAR function to handle render surface size changes:
        QCAR.onSurfaceChanged(width, height);
    }


    /** The native render function. */
    public native void renderFrame();


    /** Called to draw the current frame. */
    public void onDrawFrame(GL10 gl)
    {
        if (!mIsActive)
            return;

        // Update render view (projection matrix and viewport) if needed:
        mActivity.updateRenderView();  

        // Call our native function to render content
        renderFrame();
    }
}
