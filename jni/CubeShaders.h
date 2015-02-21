/*==============================================================================

Aisiom Augmented Reality Project
Bright Onapito | 2013
@file 
    CubeShaders.h

@brief

    Utility class by Qualcolmm Austria Research

==============================================================================*/

#ifndef _QCAR_CUBE_SHADERS_H_
#define _QCAR_CUBE_SHADERS_H_

#ifndef USE_OPENGL_ES_1_1

static const char* cubeMeshVertexShader = " \
  \
attribute vec4 vertexPosition; \
attribute vec4 vertexNormal; \
attribute vec2 vertexTexCoord; \
 \
varying vec2 texCoord; \
varying vec4 normal; \
 \
uniform mat4 modelViewProjectionMatrix; \
 \
void main() \
{ \
   gl_Position = modelViewProjectionMatrix * vertexPosition; \
   normal = vertexNormal; \
   texCoord = vertexTexCoord; \
} \
";


static const char* cubeFragmentShader = " \
 \
precision mediump float; \
 \
varying vec2 texCoord; \
varying vec4 normal; \
 \
uniform sampler2D texSampler2D; \
 \
void main() \
{ \
   gl_FragColor = texture2D(texSampler2D, texCoord); \
} \
";

#endif

#endif // _QCAR_CUBE_SHADERS_H_
