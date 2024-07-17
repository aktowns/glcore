package au.ikx.glcore

import java.lang.foreign.MemorySegment
import kotlin.Byte
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.Unit

public object GL {
  public inline fun glAccum(op: Int, `value`: Float): Unit =
      PFNGLACCUMPROC.invoke(GLCore.glad_debug_glAccum(), op, value)

  public inline fun glActiveShaderProgram(pipeline: Int, program: Int): Unit =
      PFNGLACTIVESHADERPROGRAMPROC.invoke(GLCore.glad_debug_glActiveShaderProgram(), pipeline,
      program)

  public inline fun glActiveTexture(texture: Int): Unit =
      PFNGLACTIVETEXTUREPROC.invoke(GLCore.glad_debug_glActiveTexture(), texture)

  public inline fun glActiveTextureARB(texture: Int): Unit =
      PFNGLACTIVETEXTUREARBPROC.invoke(GLCore.glad_debug_glActiveTextureARB(), texture)

  public inline fun glActiveVaryingNV(program: Int, name: MemorySegment): Unit =
      PFNGLACTIVEVARYINGNVPROC.invoke(GLCore.glad_debug_glActiveVaryingNV(), program, name)

  public inline fun glAlphaFunc(func: Int, ref: Float): Unit =
      PFNGLALPHAFUNCPROC.invoke(GLCore.glad_debug_glAlphaFunc(), func, ref)

  public inline fun glAreProgramsResidentNV(
    n: Int,
    programs: MemorySegment,
    residences: MemorySegment,
  ): Byte = PFNGLAREPROGRAMSRESIDENTNVPROC.invoke(GLCore.glad_debug_glAreProgramsResidentNV(), n,
      programs, residences)

  public inline fun glAreTexturesResident(
    n: Int,
    textures: MemorySegment,
    residences: MemorySegment,
  ): Byte = PFNGLARETEXTURESRESIDENTPROC.invoke(GLCore.glad_debug_glAreTexturesResident(), n,
      textures, residences)

  public inline fun glAreTexturesResidentEXT(
    n: Int,
    textures: MemorySegment,
    residences: MemorySegment,
  ): Byte = PFNGLARETEXTURESRESIDENTEXTPROC.invoke(GLCore.glad_debug_glAreTexturesResidentEXT(), n,
      textures, residences)

  public inline fun glArrayElement(i: Int): Unit =
      PFNGLARRAYELEMENTPROC.invoke(GLCore.glad_debug_glArrayElement(), i)

  public inline fun glArrayElementEXT(i: Int): Unit =
      PFNGLARRAYELEMENTEXTPROC.invoke(GLCore.glad_debug_glArrayElementEXT(), i)

  public inline fun glAttachObjectARB(containerObj: Int, obj: Int): Unit =
      PFNGLATTACHOBJECTARBPROC.invoke(GLCore.glad_debug_glAttachObjectARB(), containerObj, obj)

  public inline fun glAttachShader(program: Int, shader: Int): Unit =
      PFNGLATTACHSHADERPROC.invoke(GLCore.glad_debug_glAttachShader(), program, shader)

  public inline fun glBegin(mode: Int): Unit = PFNGLBEGINPROC.invoke(GLCore.glad_debug_glBegin(),
      mode)

  public inline fun glBeginConditionalRender(id: Int, mode: Int): Unit =
      PFNGLBEGINCONDITIONALRENDERPROC.invoke(GLCore.glad_debug_glBeginConditionalRender(), id, mode)

  public inline fun glBeginConditionalRenderNV(id: Int, mode: Int): Unit =
      PFNGLBEGINCONDITIONALRENDERNVPROC.invoke(GLCore.glad_debug_glBeginConditionalRenderNV(), id,
      mode)

  public inline fun glBeginConditionalRenderNVX(id: Int): Unit =
      PFNGLBEGINCONDITIONALRENDERNVXPROC.invoke(GLCore.glad_debug_glBeginConditionalRenderNVX(), id)

  public inline fun glBeginQuery(target: Int, id: Int): Unit =
      PFNGLBEGINQUERYPROC.invoke(GLCore.glad_debug_glBeginQuery(), target, id)

  public inline fun glBeginQueryARB(target: Int, id: Int): Unit =
      PFNGLBEGINQUERYARBPROC.invoke(GLCore.glad_debug_glBeginQueryARB(), target, id)

  public inline fun glBeginQueryIndexed(
    target: Int,
    index: Int,
    id: Int,
  ): Unit = PFNGLBEGINQUERYINDEXEDPROC.invoke(GLCore.glad_debug_glBeginQueryIndexed(), target,
      index, id)

  public inline fun glBeginTransformFeedback(primitiveMode: Int): Unit =
      PFNGLBEGINTRANSFORMFEEDBACKPROC.invoke(GLCore.glad_debug_glBeginTransformFeedback(),
      primitiveMode)

  public inline fun glBeginTransformFeedbackEXT(primitiveMode: Int): Unit =
      PFNGLBEGINTRANSFORMFEEDBACKEXTPROC.invoke(GLCore.glad_debug_glBeginTransformFeedbackEXT(),
      primitiveMode)

  public inline fun glBeginTransformFeedbackNV(primitiveMode: Int): Unit =
      PFNGLBEGINTRANSFORMFEEDBACKNVPROC.invoke(GLCore.glad_debug_glBeginTransformFeedbackNV(),
      primitiveMode)

  public inline fun glBindAttribLocation(
    program: Int,
    index: Int,
    name: MemorySegment,
  ): Unit = PFNGLBINDATTRIBLOCATIONPROC.invoke(GLCore.glad_debug_glBindAttribLocation(), program,
      index, name)

  public inline fun glBindAttribLocationARB(
    programObj: Int,
    index: Int,
    name: MemorySegment,
  ): Unit = PFNGLBINDATTRIBLOCATIONARBPROC.invoke(GLCore.glad_debug_glBindAttribLocationARB(),
      programObj, index, name)

  public inline fun glBindBuffer(target: Int, buffer: Int): Unit =
      PFNGLBINDBUFFERPROC.invoke(GLCore.glad_debug_glBindBuffer(), target, buffer)

  public inline fun glBindBufferARB(target: Int, buffer: Int): Unit =
      PFNGLBINDBUFFERARBPROC.invoke(GLCore.glad_debug_glBindBufferARB(), target, buffer)

  public inline fun glBindBufferBase(
    target: Int,
    index: Int,
    buffer: Int,
  ): Unit = PFNGLBINDBUFFERBASEPROC.invoke(GLCore.glad_debug_glBindBufferBase(), target, index,
      buffer)

  public inline fun glBindBufferBaseEXT(
    target: Int,
    index: Int,
    buffer: Int,
  ): Unit = PFNGLBINDBUFFERBASEEXTPROC.invoke(GLCore.glad_debug_glBindBufferBaseEXT(), target,
      index, buffer)

  public inline fun glBindBufferBaseNV(
    target: Int,
    index: Int,
    buffer: Int,
  ): Unit = PFNGLBINDBUFFERBASENVPROC.invoke(GLCore.glad_debug_glBindBufferBaseNV(), target, index,
      buffer)

  public inline fun glBindBufferOffsetEXT(
    target: Int,
    index: Int,
    buffer: Int,
    offset: Long,
  ): Unit = PFNGLBINDBUFFEROFFSETEXTPROC.invoke(GLCore.glad_debug_glBindBufferOffsetEXT(), target,
      index, buffer, offset)

  public inline fun glBindBufferOffsetNV(
    target: Int,
    index: Int,
    buffer: Int,
    offset: Long,
  ): Unit = PFNGLBINDBUFFEROFFSETNVPROC.invoke(GLCore.glad_debug_glBindBufferOffsetNV(), target,
      index, buffer, offset)

  public inline fun glBindBufferRange(
    target: Int,
    index: Int,
    buffer: Int,
    offset: Long,
    size: Long,
  ): Unit = PFNGLBINDBUFFERRANGEPROC.invoke(GLCore.glad_debug_glBindBufferRange(), target, index,
      buffer, offset, size)

  public inline fun glBindBufferRangeEXT(
    target: Int,
    index: Int,
    buffer: Int,
    offset: Long,
    size: Long,
  ): Unit = PFNGLBINDBUFFERRANGEEXTPROC.invoke(GLCore.glad_debug_glBindBufferRangeEXT(), target,
      index, buffer, offset, size)

  public inline fun glBindBufferRangeNV(
    target: Int,
    index: Int,
    buffer: Int,
    offset: Long,
    size: Long,
  ): Unit = PFNGLBINDBUFFERRANGENVPROC.invoke(GLCore.glad_debug_glBindBufferRangeNV(), target,
      index, buffer, offset, size)

  public inline fun glBindBuffersBase(
    target: Int,
    first: Int,
    count: Int,
    buffers: MemorySegment,
  ): Unit = PFNGLBINDBUFFERSBASEPROC.invoke(GLCore.glad_debug_glBindBuffersBase(), target, first,
      count, buffers)

  public inline fun glBindBuffersRange(
    target: Int,
    first: Int,
    count: Int,
    buffers: MemorySegment,
    offsets: MemorySegment,
    sizes: MemorySegment,
  ): Unit = PFNGLBINDBUFFERSRANGEPROC.invoke(GLCore.glad_debug_glBindBuffersRange(), target, first,
      count, buffers, offsets, sizes)

  public inline fun glBindFragDataLocation(
    program: Int,
    color: Int,
    name: MemorySegment,
  ): Unit = PFNGLBINDFRAGDATALOCATIONPROC.invoke(GLCore.glad_debug_glBindFragDataLocation(),
      program, color, name)

  public inline fun glBindFragDataLocationEXT(
    program: Int,
    color: Int,
    name: MemorySegment,
  ): Unit = PFNGLBINDFRAGDATALOCATIONEXTPROC.invoke(GLCore.glad_debug_glBindFragDataLocationEXT(),
      program, color, name)

  public inline fun glBindFragDataLocationIndexed(
    program: Int,
    colorNumber: Int,
    index: Int,
    name: MemorySegment,
  ): Unit =
      PFNGLBINDFRAGDATALOCATIONINDEXEDPROC.invoke(GLCore.glad_debug_glBindFragDataLocationIndexed(),
      program, colorNumber, index, name)

  public inline fun glBindFramebuffer(target: Int, framebuffer: Int): Unit =
      PFNGLBINDFRAMEBUFFERPROC.invoke(GLCore.glad_debug_glBindFramebuffer(), target, framebuffer)

  public inline fun glBindFramebufferEXT(target: Int, framebuffer: Int): Unit =
      PFNGLBINDFRAMEBUFFEREXTPROC.invoke(GLCore.glad_debug_glBindFramebufferEXT(), target,
      framebuffer)

  public inline fun glBindImageTexture(
    unit: Int,
    texture: Int,
    level: Int,
    layered: Byte,
    layer: Int,
    access: Int,
    format: Int,
  ): Unit = PFNGLBINDIMAGETEXTUREPROC.invoke(GLCore.glad_debug_glBindImageTexture(), unit, texture,
      level, layered, layer, access, format)

  public inline fun glBindImageTextureEXT(
    index: Int,
    texture: Int,
    level: Int,
    layered: Byte,
    layer: Int,
    access: Int,
    format: Int,
  ): Unit = PFNGLBINDIMAGETEXTUREEXTPROC.invoke(GLCore.glad_debug_glBindImageTextureEXT(), index,
      texture, level, layered, layer, access, format)

  public inline fun glBindImageTextures(
    first: Int,
    count: Int,
    textures: MemorySegment,
  ): Unit = PFNGLBINDIMAGETEXTURESPROC.invoke(GLCore.glad_debug_glBindImageTextures(), first, count,
      textures)

  public inline fun glBindMultiTextureEXT(
    texunit: Int,
    target: Int,
    texture: Int,
  ): Unit = PFNGLBINDMULTITEXTUREEXTPROC.invoke(GLCore.glad_debug_glBindMultiTextureEXT(), texunit,
      target, texture)

  public inline fun glBindProgramARB(target: Int, program: Int): Unit =
      PFNGLBINDPROGRAMARBPROC.invoke(GLCore.glad_debug_glBindProgramARB(), target, program)

  public inline fun glBindProgramNV(target: Int, id: Int): Unit =
      PFNGLBINDPROGRAMNVPROC.invoke(GLCore.glad_debug_glBindProgramNV(), target, id)

  public inline fun glBindProgramPipeline(pipeline: Int): Unit =
      PFNGLBINDPROGRAMPIPELINEPROC.invoke(GLCore.glad_debug_glBindProgramPipeline(), pipeline)

  public inline fun glBindRenderbuffer(target: Int, renderbuffer: Int): Unit =
      PFNGLBINDRENDERBUFFERPROC.invoke(GLCore.glad_debug_glBindRenderbuffer(), target, renderbuffer)

  public inline fun glBindRenderbufferEXT(target: Int, renderbuffer: Int): Unit =
      PFNGLBINDRENDERBUFFEREXTPROC.invoke(GLCore.glad_debug_glBindRenderbufferEXT(), target,
      renderbuffer)

  public inline fun glBindSampler(unit: Int, sampler: Int): Unit =
      PFNGLBINDSAMPLERPROC.invoke(GLCore.glad_debug_glBindSampler(), unit, sampler)

  public inline fun glBindSamplers(
    first: Int,
    count: Int,
    samplers: MemorySegment,
  ): Unit = PFNGLBINDSAMPLERSPROC.invoke(GLCore.glad_debug_glBindSamplers(), first, count, samplers)

  public inline fun glBindTexture(target: Int, texture: Int): Unit =
      PFNGLBINDTEXTUREPROC.invoke(GLCore.glad_debug_glBindTexture(), target, texture)

  public inline fun glBindTextureEXT(target: Int, texture: Int): Unit =
      PFNGLBINDTEXTUREEXTPROC.invoke(GLCore.glad_debug_glBindTextureEXT(), target, texture)

  public inline fun glBindTextureUnit(unit: Int, texture: Int): Unit =
      PFNGLBINDTEXTUREUNITPROC.invoke(GLCore.glad_debug_glBindTextureUnit(), unit, texture)

  public inline fun glBindTextures(
    first: Int,
    count: Int,
    textures: MemorySegment,
  ): Unit = PFNGLBINDTEXTURESPROC.invoke(GLCore.glad_debug_glBindTextures(), first, count, textures)

  public inline fun glBindTransformFeedback(target: Int, id: Int): Unit =
      PFNGLBINDTRANSFORMFEEDBACKPROC.invoke(GLCore.glad_debug_glBindTransformFeedback(), target, id)

  public inline fun glBindTransformFeedbackNV(target: Int, id: Int): Unit =
      PFNGLBINDTRANSFORMFEEDBACKNVPROC.invoke(GLCore.glad_debug_glBindTransformFeedbackNV(), target,
      id)

  public inline fun glBindVertexArray(array: Int): Unit =
      PFNGLBINDVERTEXARRAYPROC.invoke(GLCore.glad_debug_glBindVertexArray(), array)

  public inline fun glBindVertexArrayAPPLE(array: Int): Unit =
      PFNGLBINDVERTEXARRAYAPPLEPROC.invoke(GLCore.glad_debug_glBindVertexArrayAPPLE(), array)

  public inline fun glBindVertexBuffer(
    bindingindex: Int,
    buffer: Int,
    offset: Long,
    stride: Int,
  ): Unit = PFNGLBINDVERTEXBUFFERPROC.invoke(GLCore.glad_debug_glBindVertexBuffer(), bindingindex,
      buffer, offset, stride)

  public inline fun glBindVertexBuffers(
    first: Int,
    count: Int,
    buffers: MemorySegment,
    offsets: MemorySegment,
    strides: MemorySegment,
  ): Unit = PFNGLBINDVERTEXBUFFERSPROC.invoke(GLCore.glad_debug_glBindVertexBuffers(), first, count,
      buffers, offsets, strides)

  public inline fun glBitmap(
    width: Int,
    height: Int,
    xorig: Float,
    yorig: Float,
    xmove: Float,
    ymove: Float,
    bitmap: MemorySegment,
  ): Unit = PFNGLBITMAPPROC.invoke(GLCore.glad_debug_glBitmap(), width, height, xorig, yorig, xmove,
      ymove, bitmap)

  public inline fun glBlendColor(
    red: Float,
    green: Float,
    blue: Float,
    alpha: Float,
  ): Unit = PFNGLBLENDCOLORPROC.invoke(GLCore.glad_debug_glBlendColor(), red, green, blue, alpha)

  public inline fun glBlendColorEXT(
    red: Float,
    green: Float,
    blue: Float,
    alpha: Float,
  ): Unit = PFNGLBLENDCOLOREXTPROC.invoke(GLCore.glad_debug_glBlendColorEXT(), red, green, blue,
      alpha)

  public inline fun glBlendEquation(mode: Int): Unit =
      PFNGLBLENDEQUATIONPROC.invoke(GLCore.glad_debug_glBlendEquation(), mode)

  public inline fun glBlendEquationEXT(mode: Int): Unit =
      PFNGLBLENDEQUATIONEXTPROC.invoke(GLCore.glad_debug_glBlendEquationEXT(), mode)

  public inline fun glBlendEquationIndexedAMD(buf: Int, mode: Int): Unit =
      PFNGLBLENDEQUATIONINDEXEDAMDPROC.invoke(GLCore.glad_debug_glBlendEquationIndexedAMD(), buf,
      mode)

  public inline fun glBlendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit =
      PFNGLBLENDEQUATIONSEPARATEPROC.invoke(GLCore.glad_debug_glBlendEquationSeparate(), modeRGB,
      modeAlpha)

  public inline fun glBlendEquationSeparateEXT(modeRGB: Int, modeAlpha: Int): Unit =
      PFNGLBLENDEQUATIONSEPARATEEXTPROC.invoke(GLCore.glad_debug_glBlendEquationSeparateEXT(),
      modeRGB, modeAlpha)

  public inline fun glBlendEquationSeparateIndexedAMD(
    buf: Int,
    modeRGB: Int,
    modeAlpha: Int,
  ): Unit =
      PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROC.invoke(GLCore.glad_debug_glBlendEquationSeparateIndexedAMD(),
      buf, modeRGB, modeAlpha)

  public inline fun glBlendEquationSeparatei(
    buf: Int,
    modeRGB: Int,
    modeAlpha: Int,
  ): Unit = PFNGLBLENDEQUATIONSEPARATEIPROC.invoke(GLCore.glad_debug_glBlendEquationSeparatei(),
      buf, modeRGB, modeAlpha)

  public inline fun glBlendEquationSeparateiARB(
    buf: Int,
    modeRGB: Int,
    modeAlpha: Int,
  ): Unit =
      PFNGLBLENDEQUATIONSEPARATEIARBPROC.invoke(GLCore.glad_debug_glBlendEquationSeparateiARB(),
      buf, modeRGB, modeAlpha)

  public inline fun glBlendEquationi(buf: Int, mode: Int): Unit =
      PFNGLBLENDEQUATIONIPROC.invoke(GLCore.glad_debug_glBlendEquationi(), buf, mode)

  public inline fun glBlendEquationiARB(buf: Int, mode: Int): Unit =
      PFNGLBLENDEQUATIONIARBPROC.invoke(GLCore.glad_debug_glBlendEquationiARB(), buf, mode)

  public inline fun glBlendFunc(sfactor: Int, dfactor: Int): Unit =
      PFNGLBLENDFUNCPROC.invoke(GLCore.glad_debug_glBlendFunc(), sfactor, dfactor)

  public inline fun glBlendFuncIndexedAMD(
    buf: Int,
    src: Int,
    dst: Int,
  ): Unit = PFNGLBLENDFUNCINDEXEDAMDPROC.invoke(GLCore.glad_debug_glBlendFuncIndexedAMD(), buf, src,
      dst)

  public inline fun glBlendFuncSeparate(
    sfactorRGB: Int,
    dfactorRGB: Int,
    sfactorAlpha: Int,
    dfactorAlpha: Int,
  ): Unit = PFNGLBLENDFUNCSEPARATEPROC.invoke(GLCore.glad_debug_glBlendFuncSeparate(), sfactorRGB,
      dfactorRGB, sfactorAlpha, dfactorAlpha)

  public inline fun glBlendFuncSeparateEXT(
    sfactorRGB: Int,
    dfactorRGB: Int,
    sfactorAlpha: Int,
    dfactorAlpha: Int,
  ): Unit = PFNGLBLENDFUNCSEPARATEEXTPROC.invoke(GLCore.glad_debug_glBlendFuncSeparateEXT(),
      sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha)

  public inline fun glBlendFuncSeparateINGR(
    sfactorRGB: Int,
    dfactorRGB: Int,
    sfactorAlpha: Int,
    dfactorAlpha: Int,
  ): Unit = PFNGLBLENDFUNCSEPARATEINGRPROC.invoke(GLCore.glad_debug_glBlendFuncSeparateINGR(),
      sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha)

  public inline fun glBlendFuncSeparateIndexedAMD(
    buf: Int,
    srcRGB: Int,
    dstRGB: Int,
    srcAlpha: Int,
    dstAlpha: Int,
  ): Unit =
      PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROC.invoke(GLCore.glad_debug_glBlendFuncSeparateIndexedAMD(),
      buf, srcRGB, dstRGB, srcAlpha, dstAlpha)

  public inline fun glBlendFuncSeparatei(
    buf: Int,
    srcRGB: Int,
    dstRGB: Int,
    srcAlpha: Int,
    dstAlpha: Int,
  ): Unit = PFNGLBLENDFUNCSEPARATEIPROC.invoke(GLCore.glad_debug_glBlendFuncSeparatei(), buf,
      srcRGB, dstRGB, srcAlpha, dstAlpha)

  public inline fun glBlendFuncSeparateiARB(
    buf: Int,
    srcRGB: Int,
    dstRGB: Int,
    srcAlpha: Int,
    dstAlpha: Int,
  ): Unit = PFNGLBLENDFUNCSEPARATEIARBPROC.invoke(GLCore.glad_debug_glBlendFuncSeparateiARB(), buf,
      srcRGB, dstRGB, srcAlpha, dstAlpha)

  public inline fun glBlendFunci(
    buf: Int,
    src: Int,
    dst: Int,
  ): Unit = PFNGLBLENDFUNCIPROC.invoke(GLCore.glad_debug_glBlendFunci(), buf, src, dst)

  public inline fun glBlendFunciARB(
    buf: Int,
    src: Int,
    dst: Int,
  ): Unit = PFNGLBLENDFUNCIARBPROC.invoke(GLCore.glad_debug_glBlendFunciARB(), buf, src, dst)

  public inline fun glBlitFramebuffer(
    srcX0: Int,
    srcY0: Int,
    srcX1: Int,
    srcY1: Int,
    dstX0: Int,
    dstY0: Int,
    dstX1: Int,
    dstY1: Int,
    mask: Int,
    filter: Int,
  ): Unit = PFNGLBLITFRAMEBUFFERPROC.invoke(GLCore.glad_debug_glBlitFramebuffer(), srcX0, srcY0,
      srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter)

  public inline fun glBlitFramebufferEXT(
    srcX0: Int,
    srcY0: Int,
    srcX1: Int,
    srcY1: Int,
    dstX0: Int,
    dstY0: Int,
    dstX1: Int,
    dstY1: Int,
    mask: Int,
    filter: Int,
  ): Unit = PFNGLBLITFRAMEBUFFEREXTPROC.invoke(GLCore.glad_debug_glBlitFramebufferEXT(), srcX0,
      srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter)

  public inline fun glBlitNamedFramebuffer(
    readFramebuffer: Int,
    drawFramebuffer: Int,
    srcX0: Int,
    srcY0: Int,
    srcX1: Int,
    srcY1: Int,
    dstX0: Int,
    dstY0: Int,
    dstX1: Int,
    dstY1: Int,
    mask: Int,
    filter: Int,
  ): Unit = PFNGLBLITNAMEDFRAMEBUFFERPROC.invoke(GLCore.glad_debug_glBlitNamedFramebuffer(),
      readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1,
      mask, filter)

  public inline fun glBufferData(
    target: Int,
    size: Long,
    `data`: MemorySegment,
    usage: Int,
  ): Unit = PFNGLBUFFERDATAPROC.invoke(GLCore.glad_debug_glBufferData(), target, size, data, usage)

  public inline fun glBufferDataARB(
    target: Int,
    size: Long,
    `data`: MemorySegment,
    usage: Int,
  ): Unit = PFNGLBUFFERDATAARBPROC.invoke(GLCore.glad_debug_glBufferDataARB(), target, size, data,
      usage)

  public inline fun glBufferParameteriAPPLE(
    target: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLBUFFERPARAMETERIAPPLEPROC.invoke(GLCore.glad_debug_glBufferParameteriAPPLE(),
      target, pname, param)

  public inline fun glBufferStorage(
    target: Int,
    size: Long,
    `data`: MemorySegment,
    flags: Int,
  ): Unit = PFNGLBUFFERSTORAGEPROC.invoke(GLCore.glad_debug_glBufferStorage(), target, size, data,
      flags)

  public inline fun glBufferSubData(
    target: Int,
    offset: Long,
    size: Long,
    `data`: MemorySegment,
  ): Unit = PFNGLBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glBufferSubData(), target, offset, size,
      data)

  public inline fun glBufferSubDataARB(
    target: Int,
    offset: Long,
    size: Long,
    `data`: MemorySegment,
  ): Unit = PFNGLBUFFERSUBDATAARBPROC.invoke(GLCore.glad_debug_glBufferSubDataARB(), target, offset,
      size, data)

  public inline fun glCallList(list: Int): Unit =
      PFNGLCALLLISTPROC.invoke(GLCore.glad_debug_glCallList(), list)

  public inline fun glCallLists(
    n: Int,
    type: Int,
    lists: MemorySegment,
  ): Unit = PFNGLCALLLISTSPROC.invoke(GLCore.glad_debug_glCallLists(), n, type, lists)

  public inline fun glCheckFramebufferStatus(target: Int): Int =
      PFNGLCHECKFRAMEBUFFERSTATUSPROC.invoke(GLCore.glad_debug_glCheckFramebufferStatus(), target)

  public inline fun glCheckFramebufferStatusEXT(target: Int): Int =
      PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC.invoke(GLCore.glad_debug_glCheckFramebufferStatusEXT(),
      target)

  public inline fun glCheckNamedFramebufferStatus(framebuffer: Int, target: Int): Int =
      PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC.invoke(GLCore.glad_debug_glCheckNamedFramebufferStatus(),
      framebuffer, target)

  public inline fun glCheckNamedFramebufferStatusEXT(framebuffer: Int, target: Int): Int =
      PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC.invoke(GLCore.glad_debug_glCheckNamedFramebufferStatusEXT(),
      framebuffer, target)

  public inline fun glClampColor(target: Int, clamp: Int): Unit =
      PFNGLCLAMPCOLORPROC.invoke(GLCore.glad_debug_glClampColor(), target, clamp)

  public inline fun glClampColorARB(target: Int, clamp: Int): Unit =
      PFNGLCLAMPCOLORARBPROC.invoke(GLCore.glad_debug_glClampColorARB(), target, clamp)

  public inline fun glClear(mask: Int): Unit = PFNGLCLEARPROC.invoke(GLCore.glad_debug_glClear(),
      mask)

  public inline fun glClearAccum(
    red: Float,
    green: Float,
    blue: Float,
    alpha: Float,
  ): Unit = PFNGLCLEARACCUMPROC.invoke(GLCore.glad_debug_glClearAccum(), red, green, blue, alpha)

  public inline fun glClearBufferData(
    target: Int,
    internalformat: Int,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCLEARBUFFERDATAPROC.invoke(GLCore.glad_debug_glClearBufferData(), target,
      internalformat, format, type, data)

  public inline fun glClearBufferSubData(
    target: Int,
    internalformat: Int,
    offset: Long,
    size: Long,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCLEARBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glClearBufferSubData(), target,
      internalformat, offset, size, format, type, data)

  public inline fun glClearBufferfi(
    buffer: Int,
    drawbuffer: Int,
    depth: Float,
    stencil: Int,
  ): Unit = PFNGLCLEARBUFFERFIPROC.invoke(GLCore.glad_debug_glClearBufferfi(), buffer, drawbuffer,
      depth, stencil)

  public inline fun glClearBufferfv(
    buffer: Int,
    drawbuffer: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLCLEARBUFFERFVPROC.invoke(GLCore.glad_debug_glClearBufferfv(), buffer, drawbuffer,
      value)

  public inline fun glClearBufferiv(
    buffer: Int,
    drawbuffer: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLCLEARBUFFERIVPROC.invoke(GLCore.glad_debug_glClearBufferiv(), buffer, drawbuffer,
      value)

  public inline fun glClearBufferuiv(
    buffer: Int,
    drawbuffer: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLCLEARBUFFERUIVPROC.invoke(GLCore.glad_debug_glClearBufferuiv(), buffer, drawbuffer,
      value)

  public inline fun glClearColor(
    red: Float,
    green: Float,
    blue: Float,
    alpha: Float,
  ): Unit = PFNGLCLEARCOLORPROC.invoke(GLCore.glad_debug_glClearColor(), red, green, blue, alpha)

  public inline fun glClearColorIiEXT(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Int,
  ): Unit = PFNGLCLEARCOLORIIEXTPROC.invoke(GLCore.glad_debug_glClearColorIiEXT(), red, green, blue,
      alpha)

  public inline fun glClearColorIuiEXT(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Int,
  ): Unit = PFNGLCLEARCOLORIUIEXTPROC.invoke(GLCore.glad_debug_glClearColorIuiEXT(), red, green,
      blue, alpha)

  public inline fun glClearDepth(depth: Double): Unit =
      PFNGLCLEARDEPTHPROC.invoke(GLCore.glad_debug_glClearDepth(), depth)

  public inline fun glClearDepthf(d: Float): Unit =
      PFNGLCLEARDEPTHFPROC.invoke(GLCore.glad_debug_glClearDepthf(), d)

  public inline fun glClearDepthfOES(depth: Float): Unit =
      PFNGLCLEARDEPTHFOESPROC.invoke(GLCore.glad_debug_glClearDepthfOES(), depth)

  public inline fun glClearIndex(c: Float): Unit =
      PFNGLCLEARINDEXPROC.invoke(GLCore.glad_debug_glClearIndex(), c)

  public inline fun glClearNamedBufferData(
    buffer: Int,
    internalformat: Int,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCLEARNAMEDBUFFERDATAPROC.invoke(GLCore.glad_debug_glClearNamedBufferData(), buffer,
      internalformat, format, type, data)

  public inline fun glClearNamedBufferDataEXT(
    buffer: Int,
    internalformat: Int,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCLEARNAMEDBUFFERDATAEXTPROC.invoke(GLCore.glad_debug_glClearNamedBufferDataEXT(),
      buffer, internalformat, format, type, data)

  public inline fun glClearNamedBufferSubData(
    buffer: Int,
    internalformat: Int,
    offset: Long,
    size: Long,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCLEARNAMEDBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glClearNamedBufferSubData(),
      buffer, internalformat, offset, size, format, type, data)

  public inline fun glClearNamedBufferSubDataEXT(
    buffer: Int,
    internalformat: Int,
    offset: Long,
    size: Long,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit =
      PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC.invoke(GLCore.glad_debug_glClearNamedBufferSubDataEXT(),
      buffer, internalformat, offset, size, format, type, data)

  public inline fun glClearNamedFramebufferfi(
    framebuffer: Int,
    buffer: Int,
    drawbuffer: Int,
    depth: Float,
    stencil: Int,
  ): Unit = PFNGLCLEARNAMEDFRAMEBUFFERFIPROC.invoke(GLCore.glad_debug_glClearNamedFramebufferfi(),
      framebuffer, buffer, drawbuffer, depth, stencil)

  public inline fun glClearNamedFramebufferfv(
    framebuffer: Int,
    buffer: Int,
    drawbuffer: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLCLEARNAMEDFRAMEBUFFERFVPROC.invoke(GLCore.glad_debug_glClearNamedFramebufferfv(),
      framebuffer, buffer, drawbuffer, value)

  public inline fun glClearNamedFramebufferiv(
    framebuffer: Int,
    buffer: Int,
    drawbuffer: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLCLEARNAMEDFRAMEBUFFERIVPROC.invoke(GLCore.glad_debug_glClearNamedFramebufferiv(),
      framebuffer, buffer, drawbuffer, value)

  public inline fun glClearNamedFramebufferuiv(
    framebuffer: Int,
    buffer: Int,
    drawbuffer: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC.invoke(GLCore.glad_debug_glClearNamedFramebufferuiv(),
      framebuffer, buffer, drawbuffer, value)

  public inline fun glClearStencil(s: Int): Unit =
      PFNGLCLEARSTENCILPROC.invoke(GLCore.glad_debug_glClearStencil(), s)

  public inline fun glClearTexImage(
    texture: Int,
    level: Int,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCLEARTEXIMAGEPROC.invoke(GLCore.glad_debug_glClearTexImage(), texture, level,
      format, type, data)

  public inline fun glClearTexSubImage(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCLEARTEXSUBIMAGEPROC.invoke(GLCore.glad_debug_glClearTexSubImage(), texture, level,
      xoffset, yoffset, zoffset, width, height, depth, format, type, data)

  public inline fun glClientActiveTexture(texture: Int): Unit =
      PFNGLCLIENTACTIVETEXTUREPROC.invoke(GLCore.glad_debug_glClientActiveTexture(), texture)

  public inline fun glClientActiveTextureARB(texture: Int): Unit =
      PFNGLCLIENTACTIVETEXTUREARBPROC.invoke(GLCore.glad_debug_glClientActiveTextureARB(), texture)

  public inline fun glClientAttribDefaultEXT(mask: Int): Unit =
      PFNGLCLIENTATTRIBDEFAULTEXTPROC.invoke(GLCore.glad_debug_glClientAttribDefaultEXT(), mask)

  public inline fun glClientWaitSync(
    sync: MemorySegment,
    flags: Int,
    timeout: Long,
  ): Int = PFNGLCLIENTWAITSYNCPROC.invoke(GLCore.glad_debug_glClientWaitSync(), sync, flags,
      timeout)

  public inline fun glClipControl(origin: Int, depth: Int): Unit =
      PFNGLCLIPCONTROLPROC.invoke(GLCore.glad_debug_glClipControl(), origin, depth)

  public inline fun glClipPlane(plane: Int, equation: MemorySegment): Unit =
      PFNGLCLIPPLANEPROC.invoke(GLCore.glad_debug_glClipPlane(), plane, equation)

  public inline fun glClipPlanefOES(plane: Int, equation: MemorySegment): Unit =
      PFNGLCLIPPLANEFOESPROC.invoke(GLCore.glad_debug_glClipPlanefOES(), plane, equation)

  public inline fun glColor3b(
    red: Byte,
    green: Byte,
    blue: Byte,
  ): Unit = PFNGLCOLOR3BPROC.invoke(GLCore.glad_debug_glColor3b(), red, green, blue)

  public inline fun glColor3bv(v: MemorySegment): Unit =
      PFNGLCOLOR3BVPROC.invoke(GLCore.glad_debug_glColor3bv(), v)

  public inline fun glColor3d(
    red: Double,
    green: Double,
    blue: Double,
  ): Unit = PFNGLCOLOR3DPROC.invoke(GLCore.glad_debug_glColor3d(), red, green, blue)

  public inline fun glColor3dv(v: MemorySegment): Unit =
      PFNGLCOLOR3DVPROC.invoke(GLCore.glad_debug_glColor3dv(), v)

  public inline fun glColor3f(
    red: Float,
    green: Float,
    blue: Float,
  ): Unit = PFNGLCOLOR3FPROC.invoke(GLCore.glad_debug_glColor3f(), red, green, blue)

  public inline fun glColor3fv(v: MemorySegment): Unit =
      PFNGLCOLOR3FVPROC.invoke(GLCore.glad_debug_glColor3fv(), v)

  public inline fun glColor3i(
    red: Int,
    green: Int,
    blue: Int,
  ): Unit = PFNGLCOLOR3IPROC.invoke(GLCore.glad_debug_glColor3i(), red, green, blue)

  public inline fun glColor3iv(v: MemorySegment): Unit =
      PFNGLCOLOR3IVPROC.invoke(GLCore.glad_debug_glColor3iv(), v)

  public inline fun glColor3s(
    red: Short,
    green: Short,
    blue: Short,
  ): Unit = PFNGLCOLOR3SPROC.invoke(GLCore.glad_debug_glColor3s(), red, green, blue)

  public inline fun glColor3sv(v: MemorySegment): Unit =
      PFNGLCOLOR3SVPROC.invoke(GLCore.glad_debug_glColor3sv(), v)

  public inline fun glColor3ub(
    red: Byte,
    green: Byte,
    blue: Byte,
  ): Unit = PFNGLCOLOR3UBPROC.invoke(GLCore.glad_debug_glColor3ub(), red, green, blue)

  public inline fun glColor3ubv(v: MemorySegment): Unit =
      PFNGLCOLOR3UBVPROC.invoke(GLCore.glad_debug_glColor3ubv(), v)

  public inline fun glColor3ui(
    red: Int,
    green: Int,
    blue: Int,
  ): Unit = PFNGLCOLOR3UIPROC.invoke(GLCore.glad_debug_glColor3ui(), red, green, blue)

  public inline fun glColor3uiv(v: MemorySegment): Unit =
      PFNGLCOLOR3UIVPROC.invoke(GLCore.glad_debug_glColor3uiv(), v)

  public inline fun glColor3us(
    red: Short,
    green: Short,
    blue: Short,
  ): Unit = PFNGLCOLOR3USPROC.invoke(GLCore.glad_debug_glColor3us(), red, green, blue)

  public inline fun glColor3usv(v: MemorySegment): Unit =
      PFNGLCOLOR3USVPROC.invoke(GLCore.glad_debug_glColor3usv(), v)

  public inline fun glColor4b(
    red: Byte,
    green: Byte,
    blue: Byte,
    alpha: Byte,
  ): Unit = PFNGLCOLOR4BPROC.invoke(GLCore.glad_debug_glColor4b(), red, green, blue, alpha)

  public inline fun glColor4bv(v: MemorySegment): Unit =
      PFNGLCOLOR4BVPROC.invoke(GLCore.glad_debug_glColor4bv(), v)

  public inline fun glColor4d(
    red: Double,
    green: Double,
    blue: Double,
    alpha: Double,
  ): Unit = PFNGLCOLOR4DPROC.invoke(GLCore.glad_debug_glColor4d(), red, green, blue, alpha)

  public inline fun glColor4dv(v: MemorySegment): Unit =
      PFNGLCOLOR4DVPROC.invoke(GLCore.glad_debug_glColor4dv(), v)

  public inline fun glColor4f(
    red: Float,
    green: Float,
    blue: Float,
    alpha: Float,
  ): Unit = PFNGLCOLOR4FPROC.invoke(GLCore.glad_debug_glColor4f(), red, green, blue, alpha)

  public inline fun glColor4fv(v: MemorySegment): Unit =
      PFNGLCOLOR4FVPROC.invoke(GLCore.glad_debug_glColor4fv(), v)

  public inline fun glColor4i(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Int,
  ): Unit = PFNGLCOLOR4IPROC.invoke(GLCore.glad_debug_glColor4i(), red, green, blue, alpha)

  public inline fun glColor4iv(v: MemorySegment): Unit =
      PFNGLCOLOR4IVPROC.invoke(GLCore.glad_debug_glColor4iv(), v)

  public inline fun glColor4s(
    red: Short,
    green: Short,
    blue: Short,
    alpha: Short,
  ): Unit = PFNGLCOLOR4SPROC.invoke(GLCore.glad_debug_glColor4s(), red, green, blue, alpha)

  public inline fun glColor4sv(v: MemorySegment): Unit =
      PFNGLCOLOR4SVPROC.invoke(GLCore.glad_debug_glColor4sv(), v)

  public inline fun glColor4ub(
    red: Byte,
    green: Byte,
    blue: Byte,
    alpha: Byte,
  ): Unit = PFNGLCOLOR4UBPROC.invoke(GLCore.glad_debug_glColor4ub(), red, green, blue, alpha)

  public inline fun glColor4ubv(v: MemorySegment): Unit =
      PFNGLCOLOR4UBVPROC.invoke(GLCore.glad_debug_glColor4ubv(), v)

  public inline fun glColor4ui(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Int,
  ): Unit = PFNGLCOLOR4UIPROC.invoke(GLCore.glad_debug_glColor4ui(), red, green, blue, alpha)

  public inline fun glColor4uiv(v: MemorySegment): Unit =
      PFNGLCOLOR4UIVPROC.invoke(GLCore.glad_debug_glColor4uiv(), v)

  public inline fun glColor4us(
    red: Short,
    green: Short,
    blue: Short,
    alpha: Short,
  ): Unit = PFNGLCOLOR4USPROC.invoke(GLCore.glad_debug_glColor4us(), red, green, blue, alpha)

  public inline fun glColor4usv(v: MemorySegment): Unit =
      PFNGLCOLOR4USVPROC.invoke(GLCore.glad_debug_glColor4usv(), v)

  public inline fun glColorMask(
    red: Byte,
    green: Byte,
    blue: Byte,
    alpha: Byte,
  ): Unit = PFNGLCOLORMASKPROC.invoke(GLCore.glad_debug_glColorMask(), red, green, blue, alpha)

  public inline fun glColorMaskIndexedEXT(
    index: Int,
    r: Byte,
    g: Byte,
    b: Byte,
    a: Byte,
  ): Unit = PFNGLCOLORMASKINDEXEDEXTPROC.invoke(GLCore.glad_debug_glColorMaskIndexedEXT(), index, r,
      g, b, a)

  public inline fun glColorMaski(
    index: Int,
    r: Byte,
    g: Byte,
    b: Byte,
    a: Byte,
  ): Unit = PFNGLCOLORMASKIPROC.invoke(GLCore.glad_debug_glColorMaski(), index, r, g, b, a)

  public inline fun glColorMaterial(face: Int, mode: Int): Unit =
      PFNGLCOLORMATERIALPROC.invoke(GLCore.glad_debug_glColorMaterial(), face, mode)

  public inline fun glColorP3ui(type: Int, color: Int): Unit =
      PFNGLCOLORP3UIPROC.invoke(GLCore.glad_debug_glColorP3ui(), type, color)

  public inline fun glColorP3uiv(type: Int, color: MemorySegment): Unit =
      PFNGLCOLORP3UIVPROC.invoke(GLCore.glad_debug_glColorP3uiv(), type, color)

  public inline fun glColorP4ui(type: Int, color: Int): Unit =
      PFNGLCOLORP4UIPROC.invoke(GLCore.glad_debug_glColorP4ui(), type, color)

  public inline fun glColorP4uiv(type: Int, color: MemorySegment): Unit =
      PFNGLCOLORP4UIVPROC.invoke(GLCore.glad_debug_glColorP4uiv(), type, color)

  public inline fun glColorPointer(
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLCOLORPOINTERPROC.invoke(GLCore.glad_debug_glColorPointer(), size, type, stride,
      pointer)

  public inline fun glColorPointerEXT(
    size: Int,
    type: Int,
    stride: Int,
    count: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLCOLORPOINTEREXTPROC.invoke(GLCore.glad_debug_glColorPointerEXT(), size, type,
      stride, count, pointer)

  public inline fun glColorSubTable(
    target: Int,
    start: Int,
    count: Int,
    format: Int,
    type: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOLORSUBTABLEPROC.invoke(GLCore.glad_debug_glColorSubTable(), target, start, count,
      format, type, data)

  public inline fun glColorTable(
    target: Int,
    internalformat: Int,
    width: Int,
    format: Int,
    type: Int,
    table: MemorySegment,
  ): Unit = PFNGLCOLORTABLEPROC.invoke(GLCore.glad_debug_glColorTable(), target, internalformat,
      width, format, type, table)

  public inline fun glColorTableParameterfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLCOLORTABLEPARAMETERFVPROC.invoke(GLCore.glad_debug_glColorTableParameterfv(),
      target, pname, params)

  public inline fun glColorTableParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLCOLORTABLEPARAMETERIVPROC.invoke(GLCore.glad_debug_glColorTableParameteriv(),
      target, pname, params)

  public inline fun glCompileShader(shader: Int): Unit =
      PFNGLCOMPILESHADERPROC.invoke(GLCore.glad_debug_glCompileShader(), shader)

  public inline fun glCompileShaderARB(shaderObj: Int): Unit =
      PFNGLCOMPILESHADERARBPROC.invoke(GLCore.glad_debug_glCompileShaderARB(), shaderObj)

  public inline fun glCompressedMultiTexImage1DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    border: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDMULTITEXIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCompressedMultiTexImage1DEXT(),
      texunit, target, level, internalformat, width, border, imageSize, bits)

  public inline fun glCompressedMultiTexImage2DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    border: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDMULTITEXIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCompressedMultiTexImage2DEXT(),
      texunit, target, level, internalformat, width, height, border, imageSize, bits)

  public inline fun glCompressedMultiTexImage3DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    border: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDMULTITEXIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glCompressedMultiTexImage3DEXT(),
      texunit, target, level, internalformat, width, height, depth, border, imageSize, bits)

  public inline fun glCompressedMultiTexSubImage1DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCompressedMultiTexSubImage1DEXT(),
      texunit, target, level, xoffset, width, format, imageSize, bits)

  public inline fun glCompressedMultiTexSubImage2DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCompressedMultiTexSubImage2DEXT(),
      texunit, target, level, xoffset, yoffset, width, height, format, imageSize, bits)

  public inline fun glCompressedMultiTexSubImage3DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glCompressedMultiTexSubImage3DEXT(),
      texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize,
      bits)

  public inline fun glCompressedTexImage1D(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    border: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXIMAGE1DPROC.invoke(GLCore.glad_debug_glCompressedTexImage1D(), target,
      level, internalformat, width, border, imageSize, data)

  public inline fun glCompressedTexImage1DARB(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    border: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXIMAGE1DARBPROC.invoke(GLCore.glad_debug_glCompressedTexImage1DARB(),
      target, level, internalformat, width, border, imageSize, data)

  public inline fun glCompressedTexImage2D(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    border: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXIMAGE2DPROC.invoke(GLCore.glad_debug_glCompressedTexImage2D(), target,
      level, internalformat, width, height, border, imageSize, data)

  public inline fun glCompressedTexImage2DARB(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    border: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXIMAGE2DARBPROC.invoke(GLCore.glad_debug_glCompressedTexImage2DARB(),
      target, level, internalformat, width, height, border, imageSize, data)

  public inline fun glCompressedTexImage3D(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    border: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXIMAGE3DPROC.invoke(GLCore.glad_debug_glCompressedTexImage3D(), target,
      level, internalformat, width, height, depth, border, imageSize, data)

  public inline fun glCompressedTexImage3DARB(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    border: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXIMAGE3DARBPROC.invoke(GLCore.glad_debug_glCompressedTexImage3DARB(),
      target, level, internalformat, width, height, depth, border, imageSize, data)

  public inline fun glCompressedTexSubImage1D(
    target: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC.invoke(GLCore.glad_debug_glCompressedTexSubImage1D(),
      target, level, xoffset, width, format, imageSize, data)

  public inline fun glCompressedTexSubImage1DARB(
    target: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC.invoke(GLCore.glad_debug_glCompressedTexSubImage1DARB(),
      target, level, xoffset, width, format, imageSize, data)

  public inline fun glCompressedTexSubImage2D(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC.invoke(GLCore.glad_debug_glCompressedTexSubImage2D(),
      target, level, xoffset, yoffset, width, height, format, imageSize, data)

  public inline fun glCompressedTexSubImage2DARB(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROC.invoke(GLCore.glad_debug_glCompressedTexSubImage2DARB(),
      target, level, xoffset, yoffset, width, height, format, imageSize, data)

  public inline fun glCompressedTexSubImage3D(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC.invoke(GLCore.glad_debug_glCompressedTexSubImage3D(),
      target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data)

  public inline fun glCompressedTexSubImage3DARB(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC.invoke(GLCore.glad_debug_glCompressedTexSubImage3DARB(),
      target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data)

  public inline fun glCompressedTextureImage1DEXT(
    texture: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    border: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCompressedTextureImage1DEXT(),
      texture, target, level, internalformat, width, border, imageSize, bits)

  public inline fun glCompressedTextureImage2DEXT(
    texture: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    border: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTUREIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCompressedTextureImage2DEXT(),
      texture, target, level, internalformat, width, height, border, imageSize, bits)

  public inline fun glCompressedTextureImage3DEXT(
    texture: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    border: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glCompressedTextureImage3DEXT(),
      texture, target, level, internalformat, width, height, depth, border, imageSize, bits)

  public inline fun glCompressedTextureSubImage1D(
    texture: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC.invoke(GLCore.glad_debug_glCompressedTextureSubImage1D(),
      texture, level, xoffset, width, format, imageSize, data)

  public inline fun glCompressedTextureSubImage1DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCompressedTextureSubImage1DEXT(),
      texture, target, level, xoffset, width, format, imageSize, bits)

  public inline fun glCompressedTextureSubImage2D(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC.invoke(GLCore.glad_debug_glCompressedTextureSubImage2D(),
      texture, level, xoffset, yoffset, width, height, format, imageSize, data)

  public inline fun glCompressedTextureSubImage2DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCompressedTextureSubImage2DEXT(),
      texture, target, level, xoffset, yoffset, width, height, format, imageSize, bits)

  public inline fun glCompressedTextureSubImage3D(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    imageSize: Int,
    `data`: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC.invoke(GLCore.glad_debug_glCompressedTextureSubImage3D(),
      texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data)

  public inline fun glCompressedTextureSubImage3DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    imageSize: Int,
    bits: MemorySegment,
  ): Unit =
      PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glCompressedTextureSubImage3DEXT(),
      texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize,
      bits)

  public inline fun glConvolutionFilter1D(
    target: Int,
    internalformat: Int,
    width: Int,
    format: Int,
    type: Int,
    image: MemorySegment,
  ): Unit = PFNGLCONVOLUTIONFILTER1DPROC.invoke(GLCore.glad_debug_glConvolutionFilter1D(), target,
      internalformat, width, format, type, image)

  public inline fun glConvolutionFilter2D(
    target: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    image: MemorySegment,
  ): Unit = PFNGLCONVOLUTIONFILTER2DPROC.invoke(GLCore.glad_debug_glConvolutionFilter2D(), target,
      internalformat, width, height, format, type, image)

  public inline fun glConvolutionParameterf(
    target: Int,
    pname: Int,
    params: Float,
  ): Unit = PFNGLCONVOLUTIONPARAMETERFPROC.invoke(GLCore.glad_debug_glConvolutionParameterf(),
      target, pname, params)

  public inline fun glConvolutionParameterfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLCONVOLUTIONPARAMETERFVPROC.invoke(GLCore.glad_debug_glConvolutionParameterfv(),
      target, pname, params)

  public inline fun glConvolutionParameteri(
    target: Int,
    pname: Int,
    params: Int,
  ): Unit = PFNGLCONVOLUTIONPARAMETERIPROC.invoke(GLCore.glad_debug_glConvolutionParameteri(),
      target, pname, params)

  public inline fun glConvolutionParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLCONVOLUTIONPARAMETERIVPROC.invoke(GLCore.glad_debug_glConvolutionParameteriv(),
      target, pname, params)

  public inline fun glCopyBufferSubData(
    readTarget: Int,
    writeTarget: Int,
    readOffset: Long,
    writeOffset: Long,
    size: Long,
  ): Unit = PFNGLCOPYBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glCopyBufferSubData(), readTarget,
      writeTarget, readOffset, writeOffset, size)

  public inline fun glCopyColorSubTable(
    target: Int,
    start: Int,
    x: Int,
    y: Int,
    width: Int,
  ): Unit = PFNGLCOPYCOLORSUBTABLEPROC.invoke(GLCore.glad_debug_glCopyColorSubTable(), target,
      start, x, y, width)

  public inline fun glCopyColorTable(
    target: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
  ): Unit = PFNGLCOPYCOLORTABLEPROC.invoke(GLCore.glad_debug_glCopyColorTable(), target,
      internalformat, x, y, width)

  public inline fun glCopyConvolutionFilter1D(
    target: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
  ): Unit = PFNGLCOPYCONVOLUTIONFILTER1DPROC.invoke(GLCore.glad_debug_glCopyConvolutionFilter1D(),
      target, internalformat, x, y, width)

  public inline fun glCopyConvolutionFilter2D(
    target: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYCONVOLUTIONFILTER2DPROC.invoke(GLCore.glad_debug_glCopyConvolutionFilter2D(),
      target, internalformat, x, y, width, height)

  public inline fun glCopyImageSubData(
    srcName: Int,
    srcTarget: Int,
    srcLevel: Int,
    srcX: Int,
    srcY: Int,
    srcZ: Int,
    dstName: Int,
    dstTarget: Int,
    dstLevel: Int,
    dstX: Int,
    dstY: Int,
    dstZ: Int,
    srcWidth: Int,
    srcHeight: Int,
    srcDepth: Int,
  ): Unit = PFNGLCOPYIMAGESUBDATAPROC.invoke(GLCore.glad_debug_glCopyImageSubData(), srcName,
      srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ,
      srcWidth, srcHeight, srcDepth)

  public inline fun glCopyMultiTexImage1DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    border: Int,
  ): Unit = PFNGLCOPYMULTITEXIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCopyMultiTexImage1DEXT(),
      texunit, target, level, internalformat, x, y, width, border)

  public inline fun glCopyMultiTexImage2DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    border: Int,
  ): Unit = PFNGLCOPYMULTITEXIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCopyMultiTexImage2DEXT(),
      texunit, target, level, internalformat, x, y, width, height, border)

  public inline fun glCopyMultiTexSubImage1DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    x: Int,
    y: Int,
    width: Int,
  ): Unit =
      PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCopyMultiTexSubImage1DEXT(),
      texunit, target, level, xoffset, x, y, width)

  public inline fun glCopyMultiTexSubImage2DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLCOPYMULTITEXSUBIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCopyMultiTexSubImage2DEXT(),
      texunit, target, level, xoffset, yoffset, x, y, width, height)

  public inline fun glCopyMultiTexSubImage3DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glCopyMultiTexSubImage3DEXT(),
      texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height)

  public inline fun glCopyNamedBufferSubData(
    readBuffer: Int,
    writeBuffer: Int,
    readOffset: Long,
    writeOffset: Long,
    size: Long,
  ): Unit = PFNGLCOPYNAMEDBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glCopyNamedBufferSubData(),
      readBuffer, writeBuffer, readOffset, writeOffset, size)

  public inline fun glCopyPixels(
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    type: Int,
  ): Unit = PFNGLCOPYPIXELSPROC.invoke(GLCore.glad_debug_glCopyPixels(), x, y, width, height, type)

  public inline fun glCopyTexImage1D(
    target: Int,
    level: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    border: Int,
  ): Unit = PFNGLCOPYTEXIMAGE1DPROC.invoke(GLCore.glad_debug_glCopyTexImage1D(), target, level,
      internalformat, x, y, width, border)

  public inline fun glCopyTexImage1DEXT(
    target: Int,
    level: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    border: Int,
  ): Unit = PFNGLCOPYTEXIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCopyTexImage1DEXT(), target,
      level, internalformat, x, y, width, border)

  public inline fun glCopyTexImage2D(
    target: Int,
    level: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    border: Int,
  ): Unit = PFNGLCOPYTEXIMAGE2DPROC.invoke(GLCore.glad_debug_glCopyTexImage2D(), target, level,
      internalformat, x, y, width, height, border)

  public inline fun glCopyTexImage2DEXT(
    target: Int,
    level: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    border: Int,
  ): Unit = PFNGLCOPYTEXIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCopyTexImage2DEXT(), target,
      level, internalformat, x, y, width, height, border)

  public inline fun glCopyTexSubImage1D(
    target: Int,
    level: Int,
    xoffset: Int,
    x: Int,
    y: Int,
    width: Int,
  ): Unit = PFNGLCOPYTEXSUBIMAGE1DPROC.invoke(GLCore.glad_debug_glCopyTexSubImage1D(), target,
      level, xoffset, x, y, width)

  public inline fun glCopyTexSubImage1DEXT(
    target: Int,
    level: Int,
    xoffset: Int,
    x: Int,
    y: Int,
    width: Int,
  ): Unit = PFNGLCOPYTEXSUBIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCopyTexSubImage1DEXT(), target,
      level, xoffset, x, y, width)

  public inline fun glCopyTexSubImage2D(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYTEXSUBIMAGE2DPROC.invoke(GLCore.glad_debug_glCopyTexSubImage2D(), target,
      level, xoffset, yoffset, x, y, width, height)

  public inline fun glCopyTexSubImage2DEXT(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYTEXSUBIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCopyTexSubImage2DEXT(), target,
      level, xoffset, yoffset, x, y, width, height)

  public inline fun glCopyTexSubImage3D(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYTEXSUBIMAGE3DPROC.invoke(GLCore.glad_debug_glCopyTexSubImage3D(), target,
      level, xoffset, yoffset, zoffset, x, y, width, height)

  public inline fun glCopyTexSubImage3DEXT(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYTEXSUBIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glCopyTexSubImage3DEXT(), target,
      level, xoffset, yoffset, zoffset, x, y, width, height)

  public inline fun glCopyTextureImage1DEXT(
    texture: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    border: Int,
  ): Unit = PFNGLCOPYTEXTUREIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCopyTextureImage1DEXT(),
      texture, target, level, internalformat, x, y, width, border)

  public inline fun glCopyTextureImage2DEXT(
    texture: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    border: Int,
  ): Unit = PFNGLCOPYTEXTUREIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCopyTextureImage2DEXT(),
      texture, target, level, internalformat, x, y, width, height, border)

  public inline fun glCopyTextureSubImage1D(
    texture: Int,
    level: Int,
    xoffset: Int,
    x: Int,
    y: Int,
    width: Int,
  ): Unit = PFNGLCOPYTEXTURESUBIMAGE1DPROC.invoke(GLCore.glad_debug_glCopyTextureSubImage1D(),
      texture, level, xoffset, x, y, width)

  public inline fun glCopyTextureSubImage1DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    x: Int,
    y: Int,
    width: Int,
  ): Unit = PFNGLCOPYTEXTURESUBIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glCopyTextureSubImage1DEXT(),
      texture, target, level, xoffset, x, y, width)

  public inline fun glCopyTextureSubImage2D(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYTEXTURESUBIMAGE2DPROC.invoke(GLCore.glad_debug_glCopyTextureSubImage2D(),
      texture, level, xoffset, yoffset, x, y, width, height)

  public inline fun glCopyTextureSubImage2DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYTEXTURESUBIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glCopyTextureSubImage2DEXT(),
      texture, target, level, xoffset, yoffset, x, y, width, height)

  public inline fun glCopyTextureSubImage3D(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYTEXTURESUBIMAGE3DPROC.invoke(GLCore.glad_debug_glCopyTextureSubImage3D(),
      texture, level, xoffset, yoffset, zoffset, x, y, width, height)

  public inline fun glCopyTextureSubImage3DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLCOPYTEXTURESUBIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glCopyTextureSubImage3DEXT(),
      texture, target, level, xoffset, yoffset, zoffset, x, y, width, height)

  public inline fun glCreateBuffers(n: Int, buffers: MemorySegment): Unit =
      PFNGLCREATEBUFFERSPROC.invoke(GLCore.glad_debug_glCreateBuffers(), n, buffers)

  public inline fun glCreateFramebuffers(n: Int, framebuffers: MemorySegment): Unit =
      PFNGLCREATEFRAMEBUFFERSPROC.invoke(GLCore.glad_debug_glCreateFramebuffers(), n, framebuffers)

  public inline fun glCreateProgram(): Int =
      PFNGLCREATEPROGRAMPROC.invoke(GLCore.glad_debug_glCreateProgram(), )

  public inline fun glCreateProgramObjectARB(): Int =
      PFNGLCREATEPROGRAMOBJECTARBPROC.invoke(GLCore.glad_debug_glCreateProgramObjectARB(), )

  public inline fun glCreateProgramPipelines(n: Int, pipelines: MemorySegment): Unit =
      PFNGLCREATEPROGRAMPIPELINESPROC.invoke(GLCore.glad_debug_glCreateProgramPipelines(), n,
      pipelines)

  public inline fun glCreateQueries(
    target: Int,
    n: Int,
    ids: MemorySegment,
  ): Unit = PFNGLCREATEQUERIESPROC.invoke(GLCore.glad_debug_glCreateQueries(), target, n, ids)

  public inline fun glCreateRenderbuffers(n: Int, renderbuffers: MemorySegment): Unit =
      PFNGLCREATERENDERBUFFERSPROC.invoke(GLCore.glad_debug_glCreateRenderbuffers(), n,
      renderbuffers)

  public inline fun glCreateSamplers(n: Int, samplers: MemorySegment): Unit =
      PFNGLCREATESAMPLERSPROC.invoke(GLCore.glad_debug_glCreateSamplers(), n, samplers)

  public inline fun glCreateShader(type: Int): Int =
      PFNGLCREATESHADERPROC.invoke(GLCore.glad_debug_glCreateShader(), type)

  public inline fun glCreateShaderObjectARB(shaderType: Int): Int =
      PFNGLCREATESHADEROBJECTARBPROC.invoke(GLCore.glad_debug_glCreateShaderObjectARB(), shaderType)

  public inline fun glCreateShaderProgramv(
    type: Int,
    count: Int,
    strings: MemorySegment,
  ): Int = PFNGLCREATESHADERPROGRAMVPROC.invoke(GLCore.glad_debug_glCreateShaderProgramv(), type,
      count, strings)

  public inline fun glCreateTextures(
    target: Int,
    n: Int,
    textures: MemorySegment,
  ): Unit = PFNGLCREATETEXTURESPROC.invoke(GLCore.glad_debug_glCreateTextures(), target, n,
      textures)

  public inline fun glCreateTransformFeedbacks(n: Int, ids: MemorySegment): Unit =
      PFNGLCREATETRANSFORMFEEDBACKSPROC.invoke(GLCore.glad_debug_glCreateTransformFeedbacks(), n,
      ids)

  public inline fun glCreateVertexArrays(n: Int, arrays: MemorySegment): Unit =
      PFNGLCREATEVERTEXARRAYSPROC.invoke(GLCore.glad_debug_glCreateVertexArrays(), n, arrays)

  public inline fun glCullFace(mode: Int): Unit =
      PFNGLCULLFACEPROC.invoke(GLCore.glad_debug_glCullFace(), mode)

  public inline fun glDebugMessageCallback(callback: MemorySegment, userParam: MemorySegment): Unit
      = PFNGLDEBUGMESSAGECALLBACKPROC.invoke(GLCore.glad_debug_glDebugMessageCallback(), callback,
      userParam)

  public inline fun glDebugMessageCallbackARB(callback: MemorySegment, userParam: MemorySegment):
      Unit = PFNGLDEBUGMESSAGECALLBACKARBPROC.invoke(GLCore.glad_debug_glDebugMessageCallbackARB(),
      callback, userParam)

  public inline fun glDebugMessageControl(
    source: Int,
    type: Int,
    severity: Int,
    count: Int,
    ids: MemorySegment,
    enabled: Byte,
  ): Unit = PFNGLDEBUGMESSAGECONTROLPROC.invoke(GLCore.glad_debug_glDebugMessageControl(), source,
      type, severity, count, ids, enabled)

  public inline fun glDebugMessageControlARB(
    source: Int,
    type: Int,
    severity: Int,
    count: Int,
    ids: MemorySegment,
    enabled: Byte,
  ): Unit = PFNGLDEBUGMESSAGECONTROLARBPROC.invoke(GLCore.glad_debug_glDebugMessageControlARB(),
      source, type, severity, count, ids, enabled)

  public inline fun glDebugMessageInsert(
    source: Int,
    type: Int,
    id: Int,
    severity: Int,
    length: Int,
    buf: MemorySegment,
  ): Unit = PFNGLDEBUGMESSAGEINSERTPROC.invoke(GLCore.glad_debug_glDebugMessageInsert(), source,
      type, id, severity, length, buf)

  public inline fun glDebugMessageInsertARB(
    source: Int,
    type: Int,
    id: Int,
    severity: Int,
    length: Int,
    buf: MemorySegment,
  ): Unit = PFNGLDEBUGMESSAGEINSERTARBPROC.invoke(GLCore.glad_debug_glDebugMessageInsertARB(),
      source, type, id, severity, length, buf)

  public inline fun glDeleteBuffers(n: Int, buffers: MemorySegment): Unit =
      PFNGLDELETEBUFFERSPROC.invoke(GLCore.glad_debug_glDeleteBuffers(), n, buffers)

  public inline fun glDeleteBuffersARB(n: Int, buffers: MemorySegment): Unit =
      PFNGLDELETEBUFFERSARBPROC.invoke(GLCore.glad_debug_glDeleteBuffersARB(), n, buffers)

  public inline fun glDeleteFramebuffers(n: Int, framebuffers: MemorySegment): Unit =
      PFNGLDELETEFRAMEBUFFERSPROC.invoke(GLCore.glad_debug_glDeleteFramebuffers(), n, framebuffers)

  public inline fun glDeleteFramebuffersEXT(n: Int, framebuffers: MemorySegment): Unit =
      PFNGLDELETEFRAMEBUFFERSEXTPROC.invoke(GLCore.glad_debug_glDeleteFramebuffersEXT(), n,
      framebuffers)

  public inline fun glDeleteLists(list: Int, range: Int): Unit =
      PFNGLDELETELISTSPROC.invoke(GLCore.glad_debug_glDeleteLists(), list, range)

  public inline fun glDeleteObjectARB(obj: Int): Unit =
      PFNGLDELETEOBJECTARBPROC.invoke(GLCore.glad_debug_glDeleteObjectARB(), obj)

  public inline fun glDeleteProgram(program: Int): Unit =
      PFNGLDELETEPROGRAMPROC.invoke(GLCore.glad_debug_glDeleteProgram(), program)

  public inline fun glDeleteProgramPipelines(n: Int, pipelines: MemorySegment): Unit =
      PFNGLDELETEPROGRAMPIPELINESPROC.invoke(GLCore.glad_debug_glDeleteProgramPipelines(), n,
      pipelines)

  public inline fun glDeleteProgramsARB(n: Int, programs: MemorySegment): Unit =
      PFNGLDELETEPROGRAMSARBPROC.invoke(GLCore.glad_debug_glDeleteProgramsARB(), n, programs)

  public inline fun glDeleteProgramsNV(n: Int, programs: MemorySegment): Unit =
      PFNGLDELETEPROGRAMSNVPROC.invoke(GLCore.glad_debug_glDeleteProgramsNV(), n, programs)

  public inline fun glDeleteQueries(n: Int, ids: MemorySegment): Unit =
      PFNGLDELETEQUERIESPROC.invoke(GLCore.glad_debug_glDeleteQueries(), n, ids)

  public inline fun glDeleteQueriesARB(n: Int, ids: MemorySegment): Unit =
      PFNGLDELETEQUERIESARBPROC.invoke(GLCore.glad_debug_glDeleteQueriesARB(), n, ids)

  public inline fun glDeleteRenderbuffers(n: Int, renderbuffers: MemorySegment): Unit =
      PFNGLDELETERENDERBUFFERSPROC.invoke(GLCore.glad_debug_glDeleteRenderbuffers(), n,
      renderbuffers)

  public inline fun glDeleteRenderbuffersEXT(n: Int, renderbuffers: MemorySegment): Unit =
      PFNGLDELETERENDERBUFFERSEXTPROC.invoke(GLCore.glad_debug_glDeleteRenderbuffersEXT(), n,
      renderbuffers)

  public inline fun glDeleteSamplers(count: Int, samplers: MemorySegment): Unit =
      PFNGLDELETESAMPLERSPROC.invoke(GLCore.glad_debug_glDeleteSamplers(), count, samplers)

  public inline fun glDeleteShader(shader: Int): Unit =
      PFNGLDELETESHADERPROC.invoke(GLCore.glad_debug_glDeleteShader(), shader)

  public inline fun glDeleteSync(sync: MemorySegment): Unit =
      PFNGLDELETESYNCPROC.invoke(GLCore.glad_debug_glDeleteSync(), sync)

  public inline fun glDeleteTextures(n: Int, textures: MemorySegment): Unit =
      PFNGLDELETETEXTURESPROC.invoke(GLCore.glad_debug_glDeleteTextures(), n, textures)

  public inline fun glDeleteTexturesEXT(n: Int, textures: MemorySegment): Unit =
      PFNGLDELETETEXTURESEXTPROC.invoke(GLCore.glad_debug_glDeleteTexturesEXT(), n, textures)

  public inline fun glDeleteTransformFeedbacks(n: Int, ids: MemorySegment): Unit =
      PFNGLDELETETRANSFORMFEEDBACKSPROC.invoke(GLCore.glad_debug_glDeleteTransformFeedbacks(), n,
      ids)

  public inline fun glDeleteTransformFeedbacksNV(n: Int, ids: MemorySegment): Unit =
      PFNGLDELETETRANSFORMFEEDBACKSNVPROC.invoke(GLCore.glad_debug_glDeleteTransformFeedbacksNV(),
      n, ids)

  public inline fun glDeleteVertexArrays(n: Int, arrays: MemorySegment): Unit =
      PFNGLDELETEVERTEXARRAYSPROC.invoke(GLCore.glad_debug_glDeleteVertexArrays(), n, arrays)

  public inline fun glDeleteVertexArraysAPPLE(n: Int, arrays: MemorySegment): Unit =
      PFNGLDELETEVERTEXARRAYSAPPLEPROC.invoke(GLCore.glad_debug_glDeleteVertexArraysAPPLE(), n,
      arrays)

  public inline fun glDepthFunc(func: Int): Unit =
      PFNGLDEPTHFUNCPROC.invoke(GLCore.glad_debug_glDepthFunc(), func)

  public inline fun glDepthMask(flag: Byte): Unit =
      PFNGLDEPTHMASKPROC.invoke(GLCore.glad_debug_glDepthMask(), flag)

  public inline fun glDepthRange(n: Double, f: Double): Unit =
      PFNGLDEPTHRANGEPROC.invoke(GLCore.glad_debug_glDepthRange(), n, f)

  public inline fun glDepthRangeArraydvNV(
    first: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLDEPTHRANGEARRAYDVNVPROC.invoke(GLCore.glad_debug_glDepthRangeArraydvNV(), first,
      count, v)

  public inline fun glDepthRangeArrayv(
    first: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLDEPTHRANGEARRAYVPROC.invoke(GLCore.glad_debug_glDepthRangeArrayv(), first, count,
      v)

  public inline fun glDepthRangeIndexed(
    index: Int,
    n: Double,
    f: Double,
  ): Unit = PFNGLDEPTHRANGEINDEXEDPROC.invoke(GLCore.glad_debug_glDepthRangeIndexed(), index, n, f)

  public inline fun glDepthRangeIndexeddNV(
    index: Int,
    n: Double,
    f: Double,
  ): Unit = PFNGLDEPTHRANGEINDEXEDDNVPROC.invoke(GLCore.glad_debug_glDepthRangeIndexeddNV(), index,
      n, f)

  public inline fun glDepthRangef(n: Float, f: Float): Unit =
      PFNGLDEPTHRANGEFPROC.invoke(GLCore.glad_debug_glDepthRangef(), n, f)

  public inline fun glDepthRangefOES(n: Float, f: Float): Unit =
      PFNGLDEPTHRANGEFOESPROC.invoke(GLCore.glad_debug_glDepthRangefOES(), n, f)

  public inline fun glDetachObjectARB(containerObj: Int, attachedObj: Int): Unit =
      PFNGLDETACHOBJECTARBPROC.invoke(GLCore.glad_debug_glDetachObjectARB(), containerObj,
      attachedObj)

  public inline fun glDetachShader(program: Int, shader: Int): Unit =
      PFNGLDETACHSHADERPROC.invoke(GLCore.glad_debug_glDetachShader(), program, shader)

  public inline fun glDisable(cap: Int): Unit =
      PFNGLDISABLEPROC.invoke(GLCore.glad_debug_glDisable(), cap)

  public inline fun glDisableClientState(array: Int): Unit =
      PFNGLDISABLECLIENTSTATEPROC.invoke(GLCore.glad_debug_glDisableClientState(), array)

  public inline fun glDisableClientStateIndexedEXT(array: Int, index: Int): Unit =
      PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC.invoke(GLCore.glad_debug_glDisableClientStateIndexedEXT(),
      array, index)

  public inline fun glDisableClientStateiEXT(array: Int, index: Int): Unit =
      PFNGLDISABLECLIENTSTATEIEXTPROC.invoke(GLCore.glad_debug_glDisableClientStateiEXT(), array,
      index)

  public inline fun glDisableIndexedEXT(target: Int, index: Int): Unit =
      PFNGLDISABLEINDEXEDEXTPROC.invoke(GLCore.glad_debug_glDisableIndexedEXT(), target, index)

  public inline fun glDisableVertexArrayAttrib(vaobj: Int, index: Int): Unit =
      PFNGLDISABLEVERTEXARRAYATTRIBPROC.invoke(GLCore.glad_debug_glDisableVertexArrayAttrib(),
      vaobj, index)

  public inline fun glDisableVertexArrayAttribEXT(vaobj: Int, index: Int): Unit =
      PFNGLDISABLEVERTEXARRAYATTRIBEXTPROC.invoke(GLCore.glad_debug_glDisableVertexArrayAttribEXT(),
      vaobj, index)

  public inline fun glDisableVertexArrayEXT(vaobj: Int, array: Int): Unit =
      PFNGLDISABLEVERTEXARRAYEXTPROC.invoke(GLCore.glad_debug_glDisableVertexArrayEXT(), vaobj,
      array)

  public inline fun glDisableVertexAttribArray(index: Int): Unit =
      PFNGLDISABLEVERTEXATTRIBARRAYPROC.invoke(GLCore.glad_debug_glDisableVertexAttribArray(),
      index)

  public inline fun glDisableVertexAttribArrayARB(index: Int): Unit =
      PFNGLDISABLEVERTEXATTRIBARRAYARBPROC.invoke(GLCore.glad_debug_glDisableVertexAttribArrayARB(),
      index)

  public inline fun glDisablei(target: Int, index: Int): Unit =
      PFNGLDISABLEIPROC.invoke(GLCore.glad_debug_glDisablei(), target, index)

  public inline fun glDispatchCompute(
    num_groups_x: Int,
    num_groups_y: Int,
    num_groups_z: Int,
  ): Unit = PFNGLDISPATCHCOMPUTEPROC.invoke(GLCore.glad_debug_glDispatchCompute(), num_groups_x,
      num_groups_y, num_groups_z)

  public inline fun glDispatchComputeIndirect(indirect: Long): Unit =
      PFNGLDISPATCHCOMPUTEINDIRECTPROC.invoke(GLCore.glad_debug_glDispatchComputeIndirect(),
      indirect)

  public inline fun glDrawArrays(
    mode: Int,
    first: Int,
    count: Int,
  ): Unit = PFNGLDRAWARRAYSPROC.invoke(GLCore.glad_debug_glDrawArrays(), mode, first, count)

  public inline fun glDrawArraysEXT(
    mode: Int,
    first: Int,
    count: Int,
  ): Unit = PFNGLDRAWARRAYSEXTPROC.invoke(GLCore.glad_debug_glDrawArraysEXT(), mode, first, count)

  public inline fun glDrawArraysIndirect(mode: Int, indirect: MemorySegment): Unit =
      PFNGLDRAWARRAYSINDIRECTPROC.invoke(GLCore.glad_debug_glDrawArraysIndirect(), mode, indirect)

  public inline fun glDrawArraysInstanced(
    mode: Int,
    first: Int,
    count: Int,
    instancecount: Int,
  ): Unit = PFNGLDRAWARRAYSINSTANCEDPROC.invoke(GLCore.glad_debug_glDrawArraysInstanced(), mode,
      first, count, instancecount)

  public inline fun glDrawArraysInstancedARB(
    mode: Int,
    first: Int,
    count: Int,
    primcount: Int,
  ): Unit = PFNGLDRAWARRAYSINSTANCEDARBPROC.invoke(GLCore.glad_debug_glDrawArraysInstancedARB(),
      mode, first, count, primcount)

  public inline fun glDrawArraysInstancedBaseInstance(
    mode: Int,
    first: Int,
    count: Int,
    instancecount: Int,
    baseinstance: Int,
  ): Unit =
      PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC.invoke(GLCore.glad_debug_glDrawArraysInstancedBaseInstance(),
      mode, first, count, instancecount, baseinstance)

  public inline fun glDrawArraysInstancedEXT(
    mode: Int,
    start: Int,
    count: Int,
    primcount: Int,
  ): Unit = PFNGLDRAWARRAYSINSTANCEDEXTPROC.invoke(GLCore.glad_debug_glDrawArraysInstancedEXT(),
      mode, start, count, primcount)

  public inline fun glDrawBuffer(buf: Int): Unit =
      PFNGLDRAWBUFFERPROC.invoke(GLCore.glad_debug_glDrawBuffer(), buf)

  public inline fun glDrawBuffers(n: Int, bufs: MemorySegment): Unit =
      PFNGLDRAWBUFFERSPROC.invoke(GLCore.glad_debug_glDrawBuffers(), n, bufs)

  public inline fun glDrawBuffersARB(n: Int, bufs: MemorySegment): Unit =
      PFNGLDRAWBUFFERSARBPROC.invoke(GLCore.glad_debug_glDrawBuffersARB(), n, bufs)

  public inline fun glDrawBuffersATI(n: Int, bufs: MemorySegment): Unit =
      PFNGLDRAWBUFFERSATIPROC.invoke(GLCore.glad_debug_glDrawBuffersATI(), n, bufs)

  public inline fun glDrawElements(
    mode: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
  ): Unit = PFNGLDRAWELEMENTSPROC.invoke(GLCore.glad_debug_glDrawElements(), mode, count, type,
      indices)

  public inline fun glDrawElementsBaseVertex(
    mode: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
    basevertex: Int,
  ): Unit = PFNGLDRAWELEMENTSBASEVERTEXPROC.invoke(GLCore.glad_debug_glDrawElementsBaseVertex(),
      mode, count, type, indices, basevertex)

  public inline fun glDrawElementsIndirect(
    mode: Int,
    type: Int,
    indirect: MemorySegment,
  ): Unit = PFNGLDRAWELEMENTSINDIRECTPROC.invoke(GLCore.glad_debug_glDrawElementsIndirect(), mode,
      type, indirect)

  public inline fun glDrawElementsInstanced(
    mode: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
    instancecount: Int,
  ): Unit = PFNGLDRAWELEMENTSINSTANCEDPROC.invoke(GLCore.glad_debug_glDrawElementsInstanced(), mode,
      count, type, indices, instancecount)

  public inline fun glDrawElementsInstancedARB(
    mode: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
    primcount: Int,
  ): Unit = PFNGLDRAWELEMENTSINSTANCEDARBPROC.invoke(GLCore.glad_debug_glDrawElementsInstancedARB(),
      mode, count, type, indices, primcount)

  public inline fun glDrawElementsInstancedBaseInstance(
    mode: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
    instancecount: Int,
    baseinstance: Int,
  ): Unit =
      PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC.invoke(GLCore.glad_debug_glDrawElementsInstancedBaseInstance(),
      mode, count, type, indices, instancecount, baseinstance)

  public inline fun glDrawElementsInstancedBaseVertex(
    mode: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
    instancecount: Int,
    basevertex: Int,
  ): Unit =
      PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC.invoke(GLCore.glad_debug_glDrawElementsInstancedBaseVertex(),
      mode, count, type, indices, instancecount, basevertex)

  public inline fun glDrawElementsInstancedBaseVertexBaseInstance(
    mode: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
    instancecount: Int,
    basevertex: Int,
    baseinstance: Int,
  ): Unit =
      PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC.invoke(GLCore.glad_debug_glDrawElementsInstancedBaseVertexBaseInstance(),
      mode, count, type, indices, instancecount, basevertex, baseinstance)

  public inline fun glDrawElementsInstancedEXT(
    mode: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
    primcount: Int,
  ): Unit = PFNGLDRAWELEMENTSINSTANCEDEXTPROC.invoke(GLCore.glad_debug_glDrawElementsInstancedEXT(),
      mode, count, type, indices, primcount)

  public inline fun glDrawPixels(
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLDRAWPIXELSPROC.invoke(GLCore.glad_debug_glDrawPixels(), width, height, format,
      type, pixels)

  public inline fun glDrawRangeElements(
    mode: Int,
    start: Int,
    end: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
  ): Unit = PFNGLDRAWRANGEELEMENTSPROC.invoke(GLCore.glad_debug_glDrawRangeElements(), mode, start,
      end, count, type, indices)

  public inline fun glDrawRangeElementsBaseVertex(
    mode: Int,
    start: Int,
    end: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
    basevertex: Int,
  ): Unit =
      PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC.invoke(GLCore.glad_debug_glDrawRangeElementsBaseVertex(),
      mode, start, end, count, type, indices, basevertex)

  public inline fun glDrawRangeElementsEXT(
    mode: Int,
    start: Int,
    end: Int,
    count: Int,
    type: Int,
    indices: MemorySegment,
  ): Unit = PFNGLDRAWRANGEELEMENTSEXTPROC.invoke(GLCore.glad_debug_glDrawRangeElementsEXT(), mode,
      start, end, count, type, indices)

  public inline fun glDrawTransformFeedback(mode: Int, id: Int): Unit =
      PFNGLDRAWTRANSFORMFEEDBACKPROC.invoke(GLCore.glad_debug_glDrawTransformFeedback(), mode, id)

  public inline fun glDrawTransformFeedbackInstanced(
    mode: Int,
    id: Int,
    instancecount: Int,
  ): Unit =
      PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC.invoke(GLCore.glad_debug_glDrawTransformFeedbackInstanced(),
      mode, id, instancecount)

  public inline fun glDrawTransformFeedbackNV(mode: Int, id: Int): Unit =
      PFNGLDRAWTRANSFORMFEEDBACKNVPROC.invoke(GLCore.glad_debug_glDrawTransformFeedbackNV(), mode,
      id)

  public inline fun glDrawTransformFeedbackStream(
    mode: Int,
    id: Int,
    stream: Int,
  ): Unit =
      PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC.invoke(GLCore.glad_debug_glDrawTransformFeedbackStream(),
      mode, id, stream)

  public inline fun glDrawTransformFeedbackStreamInstanced(
    mode: Int,
    id: Int,
    stream: Int,
    instancecount: Int,
  ): Unit =
      PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC.invoke(GLCore.glad_debug_glDrawTransformFeedbackStreamInstanced(),
      mode, id, stream, instancecount)

  public inline fun glEdgeFlag(flag: Byte): Unit =
      PFNGLEDGEFLAGPROC.invoke(GLCore.glad_debug_glEdgeFlag(), flag)

  public inline fun glEdgeFlagPointer(stride: Int, pointer: MemorySegment): Unit =
      PFNGLEDGEFLAGPOINTERPROC.invoke(GLCore.glad_debug_glEdgeFlagPointer(), stride, pointer)

  public inline fun glEdgeFlagPointerEXT(
    stride: Int,
    count: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLEDGEFLAGPOINTEREXTPROC.invoke(GLCore.glad_debug_glEdgeFlagPointerEXT(), stride,
      count, pointer)

  public inline fun glEdgeFlagv(flag: MemorySegment): Unit =
      PFNGLEDGEFLAGVPROC.invoke(GLCore.glad_debug_glEdgeFlagv(), flag)

  public inline fun glEnable(cap: Int): Unit = PFNGLENABLEPROC.invoke(GLCore.glad_debug_glEnable(),
      cap)

  public inline fun glEnableClientState(array: Int): Unit =
      PFNGLENABLECLIENTSTATEPROC.invoke(GLCore.glad_debug_glEnableClientState(), array)

  public inline fun glEnableClientStateIndexedEXT(array: Int, index: Int): Unit =
      PFNGLENABLECLIENTSTATEINDEXEDEXTPROC.invoke(GLCore.glad_debug_glEnableClientStateIndexedEXT(),
      array, index)

  public inline fun glEnableClientStateiEXT(array: Int, index: Int): Unit =
      PFNGLENABLECLIENTSTATEIEXTPROC.invoke(GLCore.glad_debug_glEnableClientStateiEXT(), array,
      index)

  public inline fun glEnableIndexedEXT(target: Int, index: Int): Unit =
      PFNGLENABLEINDEXEDEXTPROC.invoke(GLCore.glad_debug_glEnableIndexedEXT(), target, index)

  public inline fun glEnableVertexArrayAttrib(vaobj: Int, index: Int): Unit =
      PFNGLENABLEVERTEXARRAYATTRIBPROC.invoke(GLCore.glad_debug_glEnableVertexArrayAttrib(), vaobj,
      index)

  public inline fun glEnableVertexArrayAttribEXT(vaobj: Int, index: Int): Unit =
      PFNGLENABLEVERTEXARRAYATTRIBEXTPROC.invoke(GLCore.glad_debug_glEnableVertexArrayAttribEXT(),
      vaobj, index)

  public inline fun glEnableVertexArrayEXT(vaobj: Int, array: Int): Unit =
      PFNGLENABLEVERTEXARRAYEXTPROC.invoke(GLCore.glad_debug_glEnableVertexArrayEXT(), vaobj, array)

  public inline fun glEnableVertexAttribArray(index: Int): Unit =
      PFNGLENABLEVERTEXATTRIBARRAYPROC.invoke(GLCore.glad_debug_glEnableVertexAttribArray(), index)

  public inline fun glEnableVertexAttribArrayARB(index: Int): Unit =
      PFNGLENABLEVERTEXATTRIBARRAYARBPROC.invoke(GLCore.glad_debug_glEnableVertexAttribArrayARB(),
      index)

  public inline fun glEnablei(target: Int, index: Int): Unit =
      PFNGLENABLEIPROC.invoke(GLCore.glad_debug_glEnablei(), target, index)

  public inline fun glEnd(): Unit = PFNGLENDPROC.invoke(GLCore.glad_debug_glEnd(), )

  public inline fun glEndConditionalRender(): Unit =
      PFNGLENDCONDITIONALRENDERPROC.invoke(GLCore.glad_debug_glEndConditionalRender(), )

  public inline fun glEndConditionalRenderNV(): Unit =
      PFNGLENDCONDITIONALRENDERNVPROC.invoke(GLCore.glad_debug_glEndConditionalRenderNV(), )

  public inline fun glEndConditionalRenderNVX(): Unit =
      PFNGLENDCONDITIONALRENDERNVXPROC.invoke(GLCore.glad_debug_glEndConditionalRenderNVX(), )

  public inline fun glEndList(): Unit = PFNGLENDLISTPROC.invoke(GLCore.glad_debug_glEndList(), )

  public inline fun glEndQuery(target: Int): Unit =
      PFNGLENDQUERYPROC.invoke(GLCore.glad_debug_glEndQuery(), target)

  public inline fun glEndQueryARB(target: Int): Unit =
      PFNGLENDQUERYARBPROC.invoke(GLCore.glad_debug_glEndQueryARB(), target)

  public inline fun glEndQueryIndexed(target: Int, index: Int): Unit =
      PFNGLENDQUERYINDEXEDPROC.invoke(GLCore.glad_debug_glEndQueryIndexed(), target, index)

  public inline fun glEndTransformFeedback(): Unit =
      PFNGLENDTRANSFORMFEEDBACKPROC.invoke(GLCore.glad_debug_glEndTransformFeedback(), )

  public inline fun glEndTransformFeedbackEXT(): Unit =
      PFNGLENDTRANSFORMFEEDBACKEXTPROC.invoke(GLCore.glad_debug_glEndTransformFeedbackEXT(), )

  public inline fun glEndTransformFeedbackNV(): Unit =
      PFNGLENDTRANSFORMFEEDBACKNVPROC.invoke(GLCore.glad_debug_glEndTransformFeedbackNV(), )

  public inline fun glEvalCoord1d(u: Double): Unit =
      PFNGLEVALCOORD1DPROC.invoke(GLCore.glad_debug_glEvalCoord1d(), u)

  public inline fun glEvalCoord1dv(u: MemorySegment): Unit =
      PFNGLEVALCOORD1DVPROC.invoke(GLCore.glad_debug_glEvalCoord1dv(), u)

  public inline fun glEvalCoord1f(u: Float): Unit =
      PFNGLEVALCOORD1FPROC.invoke(GLCore.glad_debug_glEvalCoord1f(), u)

  public inline fun glEvalCoord1fv(u: MemorySegment): Unit =
      PFNGLEVALCOORD1FVPROC.invoke(GLCore.glad_debug_glEvalCoord1fv(), u)

  public inline fun glEvalCoord2d(u: Double, v: Double): Unit =
      PFNGLEVALCOORD2DPROC.invoke(GLCore.glad_debug_glEvalCoord2d(), u, v)

  public inline fun glEvalCoord2dv(u: MemorySegment): Unit =
      PFNGLEVALCOORD2DVPROC.invoke(GLCore.glad_debug_glEvalCoord2dv(), u)

  public inline fun glEvalCoord2f(u: Float, v: Float): Unit =
      PFNGLEVALCOORD2FPROC.invoke(GLCore.glad_debug_glEvalCoord2f(), u, v)

  public inline fun glEvalCoord2fv(u: MemorySegment): Unit =
      PFNGLEVALCOORD2FVPROC.invoke(GLCore.glad_debug_glEvalCoord2fv(), u)

  public inline fun glEvalMesh1(
    mode: Int,
    i1: Int,
    i2: Int,
  ): Unit = PFNGLEVALMESH1PROC.invoke(GLCore.glad_debug_glEvalMesh1(), mode, i1, i2)

  public inline fun glEvalMesh2(
    mode: Int,
    i1: Int,
    i2: Int,
    j1: Int,
    j2: Int,
  ): Unit = PFNGLEVALMESH2PROC.invoke(GLCore.glad_debug_glEvalMesh2(), mode, i1, i2, j1, j2)

  public inline fun glEvalPoint1(i: Int): Unit =
      PFNGLEVALPOINT1PROC.invoke(GLCore.glad_debug_glEvalPoint1(), i)

  public inline fun glEvalPoint2(i: Int, j: Int): Unit =
      PFNGLEVALPOINT2PROC.invoke(GLCore.glad_debug_glEvalPoint2(), i, j)

  public inline fun glExecuteProgramNV(
    target: Int,
    id: Int,
    params: MemorySegment,
  ): Unit = PFNGLEXECUTEPROGRAMNVPROC.invoke(GLCore.glad_debug_glExecuteProgramNV(), target, id,
      params)

  public inline fun glFeedbackBuffer(
    size: Int,
    type: Int,
    buffer: MemorySegment,
  ): Unit = PFNGLFEEDBACKBUFFERPROC.invoke(GLCore.glad_debug_glFeedbackBuffer(), size, type, buffer)

  public inline fun glFenceSync(condition: Int, flags: Int): MemorySegment =
      PFNGLFENCESYNCPROC.invoke(GLCore.glad_debug_glFenceSync(), condition, flags)

  public inline fun glFinish(): Unit = PFNGLFINISHPROC.invoke(GLCore.glad_debug_glFinish(), )

  public inline fun glFlush(): Unit = PFNGLFLUSHPROC.invoke(GLCore.glad_debug_glFlush(), )

  public inline fun glFlushMappedBufferRange(
    target: Int,
    offset: Long,
    length: Long,
  ): Unit = PFNGLFLUSHMAPPEDBUFFERRANGEPROC.invoke(GLCore.glad_debug_glFlushMappedBufferRange(),
      target, offset, length)

  public inline fun glFlushMappedBufferRangeAPPLE(
    target: Int,
    offset: Long,
    size: Long,
  ): Unit =
      PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC.invoke(GLCore.glad_debug_glFlushMappedBufferRangeAPPLE(),
      target, offset, size)

  public inline fun glFlushMappedNamedBufferRange(
    buffer: Int,
    offset: Long,
    length: Long,
  ): Unit =
      PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC.invoke(GLCore.glad_debug_glFlushMappedNamedBufferRange(),
      buffer, offset, length)

  public inline fun glFlushMappedNamedBufferRangeEXT(
    buffer: Int,
    offset: Long,
    length: Long,
  ): Unit =
      PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROC.invoke(GLCore.glad_debug_glFlushMappedNamedBufferRangeEXT(),
      buffer, offset, length)

  public inline fun glFogCoordPointer(
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLFOGCOORDPOINTERPROC.invoke(GLCore.glad_debug_glFogCoordPointer(), type, stride,
      pointer)

  public inline fun glFogCoordPointerEXT(
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLFOGCOORDPOINTEREXTPROC.invoke(GLCore.glad_debug_glFogCoordPointerEXT(), type,
      stride, pointer)

  public inline fun glFogCoordd(coord: Double): Unit =
      PFNGLFOGCOORDDPROC.invoke(GLCore.glad_debug_glFogCoordd(), coord)

  public inline fun glFogCoorddEXT(coord: Double): Unit =
      PFNGLFOGCOORDDEXTPROC.invoke(GLCore.glad_debug_glFogCoorddEXT(), coord)

  public inline fun glFogCoorddv(coord: MemorySegment): Unit =
      PFNGLFOGCOORDDVPROC.invoke(GLCore.glad_debug_glFogCoorddv(), coord)

  public inline fun glFogCoorddvEXT(coord: MemorySegment): Unit =
      PFNGLFOGCOORDDVEXTPROC.invoke(GLCore.glad_debug_glFogCoorddvEXT(), coord)

  public inline fun glFogCoordf(coord: Float): Unit =
      PFNGLFOGCOORDFPROC.invoke(GLCore.glad_debug_glFogCoordf(), coord)

  public inline fun glFogCoordfEXT(coord: Float): Unit =
      PFNGLFOGCOORDFEXTPROC.invoke(GLCore.glad_debug_glFogCoordfEXT(), coord)

  public inline fun glFogCoordfv(coord: MemorySegment): Unit =
      PFNGLFOGCOORDFVPROC.invoke(GLCore.glad_debug_glFogCoordfv(), coord)

  public inline fun glFogCoordfvEXT(coord: MemorySegment): Unit =
      PFNGLFOGCOORDFVEXTPROC.invoke(GLCore.glad_debug_glFogCoordfvEXT(), coord)

  public inline fun glFogf(pname: Int, `param`: Float): Unit =
      PFNGLFOGFPROC.invoke(GLCore.glad_debug_glFogf(), pname, param)

  public inline fun glFogfv(pname: Int, params: MemorySegment): Unit =
      PFNGLFOGFVPROC.invoke(GLCore.glad_debug_glFogfv(), pname, params)

  public inline fun glFogi(pname: Int, `param`: Int): Unit =
      PFNGLFOGIPROC.invoke(GLCore.glad_debug_glFogi(), pname, param)

  public inline fun glFogiv(pname: Int, params: MemorySegment): Unit =
      PFNGLFOGIVPROC.invoke(GLCore.glad_debug_glFogiv(), pname, params)

  public inline fun glFramebufferDrawBufferEXT(framebuffer: Int, mode: Int): Unit =
      PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC.invoke(GLCore.glad_debug_glFramebufferDrawBufferEXT(),
      framebuffer, mode)

  public inline fun glFramebufferDrawBuffersEXT(
    framebuffer: Int,
    n: Int,
    bufs: MemorySegment,
  ): Unit =
      PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC.invoke(GLCore.glad_debug_glFramebufferDrawBuffersEXT(),
      framebuffer, n, bufs)

  public inline fun glFramebufferParameteri(
    target: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLFRAMEBUFFERPARAMETERIPROC.invoke(GLCore.glad_debug_glFramebufferParameteri(),
      target, pname, param)

  public inline fun glFramebufferReadBufferEXT(framebuffer: Int, mode: Int): Unit =
      PFNGLFRAMEBUFFERREADBUFFEREXTPROC.invoke(GLCore.glad_debug_glFramebufferReadBufferEXT(),
      framebuffer, mode)

  public inline fun glFramebufferRenderbuffer(
    target: Int,
    attachment: Int,
    renderbuffertarget: Int,
    renderbuffer: Int,
  ): Unit = PFNGLFRAMEBUFFERRENDERBUFFERPROC.invoke(GLCore.glad_debug_glFramebufferRenderbuffer(),
      target, attachment, renderbuffertarget, renderbuffer)

  public inline fun glFramebufferRenderbufferEXT(
    target: Int,
    attachment: Int,
    renderbuffertarget: Int,
    renderbuffer: Int,
  ): Unit =
      PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC.invoke(GLCore.glad_debug_glFramebufferRenderbufferEXT(),
      target, attachment, renderbuffertarget, renderbuffer)

  public inline fun glFramebufferTexture(
    target: Int,
    attachment: Int,
    texture: Int,
    level: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTUREPROC.invoke(GLCore.glad_debug_glFramebufferTexture(), target,
      attachment, texture, level)

  public inline fun glFramebufferTexture1D(
    target: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTURE1DPROC.invoke(GLCore.glad_debug_glFramebufferTexture1D(), target,
      attachment, textarget, texture, level)

  public inline fun glFramebufferTexture1DEXT(
    target: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTURE1DEXTPROC.invoke(GLCore.glad_debug_glFramebufferTexture1DEXT(),
      target, attachment, textarget, texture, level)

  public inline fun glFramebufferTexture2D(
    target: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTURE2DPROC.invoke(GLCore.glad_debug_glFramebufferTexture2D(), target,
      attachment, textarget, texture, level)

  public inline fun glFramebufferTexture2DEXT(
    target: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTURE2DEXTPROC.invoke(GLCore.glad_debug_glFramebufferTexture2DEXT(),
      target, attachment, textarget, texture, level)

  public inline fun glFramebufferTexture3D(
    target: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
    zoffset: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTURE3DPROC.invoke(GLCore.glad_debug_glFramebufferTexture3D(), target,
      attachment, textarget, texture, level, zoffset)

  public inline fun glFramebufferTexture3DEXT(
    target: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
    zoffset: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTURE3DEXTPROC.invoke(GLCore.glad_debug_glFramebufferTexture3DEXT(),
      target, attachment, textarget, texture, level, zoffset)

  public inline fun glFramebufferTextureARB(
    target: Int,
    attachment: Int,
    texture: Int,
    level: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTUREARBPROC.invoke(GLCore.glad_debug_glFramebufferTextureARB(),
      target, attachment, texture, level)

  public inline fun glFramebufferTextureEXT(
    target: Int,
    attachment: Int,
    texture: Int,
    level: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTUREEXTPROC.invoke(GLCore.glad_debug_glFramebufferTextureEXT(),
      target, attachment, texture, level)

  public inline fun glFramebufferTextureFaceARB(
    target: Int,
    attachment: Int,
    texture: Int,
    level: Int,
    face: Int,
  ): Unit =
      PFNGLFRAMEBUFFERTEXTUREFACEARBPROC.invoke(GLCore.glad_debug_glFramebufferTextureFaceARB(),
      target, attachment, texture, level, face)

  public inline fun glFramebufferTextureFaceEXT(
    target: Int,
    attachment: Int,
    texture: Int,
    level: Int,
    face: Int,
  ): Unit =
      PFNGLFRAMEBUFFERTEXTUREFACEEXTPROC.invoke(GLCore.glad_debug_glFramebufferTextureFaceEXT(),
      target, attachment, texture, level, face)

  public inline fun glFramebufferTextureLayer(
    target: Int,
    attachment: Int,
    texture: Int,
    level: Int,
    layer: Int,
  ): Unit = PFNGLFRAMEBUFFERTEXTURELAYERPROC.invoke(GLCore.glad_debug_glFramebufferTextureLayer(),
      target, attachment, texture, level, layer)

  public inline fun glFramebufferTextureLayerARB(
    target: Int,
    attachment: Int,
    texture: Int,
    level: Int,
    layer: Int,
  ): Unit =
      PFNGLFRAMEBUFFERTEXTURELAYERARBPROC.invoke(GLCore.glad_debug_glFramebufferTextureLayerARB(),
      target, attachment, texture, level, layer)

  public inline fun glFramebufferTextureLayerEXT(
    target: Int,
    attachment: Int,
    texture: Int,
    level: Int,
    layer: Int,
  ): Unit =
      PFNGLFRAMEBUFFERTEXTURELAYEREXTPROC.invoke(GLCore.glad_debug_glFramebufferTextureLayerEXT(),
      target, attachment, texture, level, layer)

  public inline fun glFrontFace(mode: Int): Unit =
      PFNGLFRONTFACEPROC.invoke(GLCore.glad_debug_glFrontFace(), mode)

  public inline fun glFrustum(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    zNear: Double,
    zFar: Double,
  ): Unit = PFNGLFRUSTUMPROC.invoke(GLCore.glad_debug_glFrustum(), left, right, bottom, top, zNear,
      zFar)

  public inline fun glFrustumfOES(
    l: Float,
    r: Float,
    b: Float,
    t: Float,
    n: Float,
    f: Float,
  ): Unit = PFNGLFRUSTUMFOESPROC.invoke(GLCore.glad_debug_glFrustumfOES(), l, r, b, t, n, f)

  public inline fun glGenBuffers(n: Int, buffers: MemorySegment): Unit =
      PFNGLGENBUFFERSPROC.invoke(GLCore.glad_debug_glGenBuffers(), n, buffers)

  public inline fun glGenBuffersARB(n: Int, buffers: MemorySegment): Unit =
      PFNGLGENBUFFERSARBPROC.invoke(GLCore.glad_debug_glGenBuffersARB(), n, buffers)

  public inline fun glGenFramebuffers(n: Int, framebuffers: MemorySegment): Unit =
      PFNGLGENFRAMEBUFFERSPROC.invoke(GLCore.glad_debug_glGenFramebuffers(), n, framebuffers)

  public inline fun glGenFramebuffersEXT(n: Int, framebuffers: MemorySegment): Unit =
      PFNGLGENFRAMEBUFFERSEXTPROC.invoke(GLCore.glad_debug_glGenFramebuffersEXT(), n, framebuffers)

  public inline fun glGenLists(range: Int): Int =
      PFNGLGENLISTSPROC.invoke(GLCore.glad_debug_glGenLists(), range)

  public inline fun glGenProgramPipelines(n: Int, pipelines: MemorySegment): Unit =
      PFNGLGENPROGRAMPIPELINESPROC.invoke(GLCore.glad_debug_glGenProgramPipelines(), n, pipelines)

  public inline fun glGenProgramsARB(n: Int, programs: MemorySegment): Unit =
      PFNGLGENPROGRAMSARBPROC.invoke(GLCore.glad_debug_glGenProgramsARB(), n, programs)

  public inline fun glGenProgramsNV(n: Int, programs: MemorySegment): Unit =
      PFNGLGENPROGRAMSNVPROC.invoke(GLCore.glad_debug_glGenProgramsNV(), n, programs)

  public inline fun glGenQueries(n: Int, ids: MemorySegment): Unit =
      PFNGLGENQUERIESPROC.invoke(GLCore.glad_debug_glGenQueries(), n, ids)

  public inline fun glGenQueriesARB(n: Int, ids: MemorySegment): Unit =
      PFNGLGENQUERIESARBPROC.invoke(GLCore.glad_debug_glGenQueriesARB(), n, ids)

  public inline fun glGenRenderbuffers(n: Int, renderbuffers: MemorySegment): Unit =
      PFNGLGENRENDERBUFFERSPROC.invoke(GLCore.glad_debug_glGenRenderbuffers(), n, renderbuffers)

  public inline fun glGenRenderbuffersEXT(n: Int, renderbuffers: MemorySegment): Unit =
      PFNGLGENRENDERBUFFERSEXTPROC.invoke(GLCore.glad_debug_glGenRenderbuffersEXT(), n,
      renderbuffers)

  public inline fun glGenSamplers(count: Int, samplers: MemorySegment): Unit =
      PFNGLGENSAMPLERSPROC.invoke(GLCore.glad_debug_glGenSamplers(), count, samplers)

  public inline fun glGenTextures(n: Int, textures: MemorySegment): Unit =
      PFNGLGENTEXTURESPROC.invoke(GLCore.glad_debug_glGenTextures(), n, textures)

  public inline fun glGenTexturesEXT(n: Int, textures: MemorySegment): Unit =
      PFNGLGENTEXTURESEXTPROC.invoke(GLCore.glad_debug_glGenTexturesEXT(), n, textures)

  public inline fun glGenTransformFeedbacks(n: Int, ids: MemorySegment): Unit =
      PFNGLGENTRANSFORMFEEDBACKSPROC.invoke(GLCore.glad_debug_glGenTransformFeedbacks(), n, ids)

  public inline fun glGenTransformFeedbacksNV(n: Int, ids: MemorySegment): Unit =
      PFNGLGENTRANSFORMFEEDBACKSNVPROC.invoke(GLCore.glad_debug_glGenTransformFeedbacksNV(), n, ids)

  public inline fun glGenVertexArrays(n: Int, arrays: MemorySegment): Unit =
      PFNGLGENVERTEXARRAYSPROC.invoke(GLCore.glad_debug_glGenVertexArrays(), n, arrays)

  public inline fun glGenVertexArraysAPPLE(n: Int, arrays: MemorySegment): Unit =
      PFNGLGENVERTEXARRAYSAPPLEPROC.invoke(GLCore.glad_debug_glGenVertexArraysAPPLE(), n, arrays)

  public inline fun glGenerateMipmap(target: Int): Unit =
      PFNGLGENERATEMIPMAPPROC.invoke(GLCore.glad_debug_glGenerateMipmap(), target)

  public inline fun glGenerateMipmapEXT(target: Int): Unit =
      PFNGLGENERATEMIPMAPEXTPROC.invoke(GLCore.glad_debug_glGenerateMipmapEXT(), target)

  public inline fun glGenerateMultiTexMipmapEXT(texunit: Int, target: Int): Unit =
      PFNGLGENERATEMULTITEXMIPMAPEXTPROC.invoke(GLCore.glad_debug_glGenerateMultiTexMipmapEXT(),
      texunit, target)

  public inline fun glGenerateTextureMipmap(texture: Int): Unit =
      PFNGLGENERATETEXTUREMIPMAPPROC.invoke(GLCore.glad_debug_glGenerateTextureMipmap(), texture)

  public inline fun glGenerateTextureMipmapEXT(texture: Int, target: Int): Unit =
      PFNGLGENERATETEXTUREMIPMAPEXTPROC.invoke(GLCore.glad_debug_glGenerateTextureMipmapEXT(),
      texture, target)

  public inline fun glGetActiveAtomicCounterBufferiv(
    program: Int,
    bufferIndex: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC.invoke(GLCore.glad_debug_glGetActiveAtomicCounterBufferiv(),
      program, bufferIndex, pname, params)

  public inline fun glGetActiveAttrib(
    program: Int,
    index: Int,
    bufSize: Int,
    length: MemorySegment,
    size: MemorySegment,
    type: MemorySegment,
    name: MemorySegment,
  ): Unit = PFNGLGETACTIVEATTRIBPROC.invoke(GLCore.glad_debug_glGetActiveAttrib(), program, index,
      bufSize, length, size, type, name)

  public inline fun glGetActiveAttribARB(
    programObj: Int,
    index: Int,
    maxLength: Int,
    length: MemorySegment,
    size: MemorySegment,
    type: MemorySegment,
    name: MemorySegment,
  ): Unit = PFNGLGETACTIVEATTRIBARBPROC.invoke(GLCore.glad_debug_glGetActiveAttribARB(), programObj,
      index, maxLength, length, size, type, name)

  public inline fun glGetActiveSubroutineName(
    program: Int,
    shadertype: Int,
    index: Int,
    bufSize: Int,
    length: MemorySegment,
    name: MemorySegment,
  ): Unit = PFNGLGETACTIVESUBROUTINENAMEPROC.invoke(GLCore.glad_debug_glGetActiveSubroutineName(),
      program, shadertype, index, bufSize, length, name)

  public inline fun glGetActiveSubroutineUniformName(
    program: Int,
    shadertype: Int,
    index: Int,
    bufSize: Int,
    length: MemorySegment,
    name: MemorySegment,
  ): Unit =
      PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC.invoke(GLCore.glad_debug_glGetActiveSubroutineUniformName(),
      program, shadertype, index, bufSize, length, name)

  public inline fun glGetActiveSubroutineUniformiv(
    program: Int,
    shadertype: Int,
    index: Int,
    pname: Int,
    values: MemorySegment,
  ): Unit =
      PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC.invoke(GLCore.glad_debug_glGetActiveSubroutineUniformiv(),
      program, shadertype, index, pname, values)

  public inline fun glGetActiveUniform(
    program: Int,
    index: Int,
    bufSize: Int,
    length: MemorySegment,
    size: MemorySegment,
    type: MemorySegment,
    name: MemorySegment,
  ): Unit = PFNGLGETACTIVEUNIFORMPROC.invoke(GLCore.glad_debug_glGetActiveUniform(), program, index,
      bufSize, length, size, type, name)

  public inline fun glGetActiveUniformARB(
    programObj: Int,
    index: Int,
    maxLength: Int,
    length: MemorySegment,
    size: MemorySegment,
    type: MemorySegment,
    name: MemorySegment,
  ): Unit = PFNGLGETACTIVEUNIFORMARBPROC.invoke(GLCore.glad_debug_glGetActiveUniformARB(),
      programObj, index, maxLength, length, size, type, name)

  public inline fun glGetActiveUniformBlockName(
    program: Int,
    uniformBlockIndex: Int,
    bufSize: Int,
    length: MemorySegment,
    uniformBlockName: MemorySegment,
  ): Unit =
      PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC.invoke(GLCore.glad_debug_glGetActiveUniformBlockName(),
      program, uniformBlockIndex, bufSize, length, uniformBlockName)

  public inline fun glGetActiveUniformBlockiv(
    program: Int,
    uniformBlockIndex: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETACTIVEUNIFORMBLOCKIVPROC.invoke(GLCore.glad_debug_glGetActiveUniformBlockiv(),
      program, uniformBlockIndex, pname, params)

  public inline fun glGetActiveUniformName(
    program: Int,
    uniformIndex: Int,
    bufSize: Int,
    length: MemorySegment,
    uniformName: MemorySegment,
  ): Unit = PFNGLGETACTIVEUNIFORMNAMEPROC.invoke(GLCore.glad_debug_glGetActiveUniformName(),
      program, uniformIndex, bufSize, length, uniformName)

  public inline fun glGetActiveUniformsiv(
    program: Int,
    uniformCount: Int,
    uniformIndices: MemorySegment,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETACTIVEUNIFORMSIVPROC.invoke(GLCore.glad_debug_glGetActiveUniformsiv(), program,
      uniformCount, uniformIndices, pname, params)

  public inline fun glGetActiveVaryingNV(
    program: Int,
    index: Int,
    bufSize: Int,
    length: MemorySegment,
    size: MemorySegment,
    type: MemorySegment,
    name: MemorySegment,
  ): Unit = PFNGLGETACTIVEVARYINGNVPROC.invoke(GLCore.glad_debug_glGetActiveVaryingNV(), program,
      index, bufSize, length, size, type, name)

  public inline fun glGetAttachedObjectsARB(
    containerObj: Int,
    maxCount: Int,
    count: MemorySegment,
    obj: MemorySegment,
  ): Unit = PFNGLGETATTACHEDOBJECTSARBPROC.invoke(GLCore.glad_debug_glGetAttachedObjectsARB(),
      containerObj, maxCount, count, obj)

  public inline fun glGetAttachedShaders(
    program: Int,
    maxCount: Int,
    count: MemorySegment,
    shaders: MemorySegment,
  ): Unit = PFNGLGETATTACHEDSHADERSPROC.invoke(GLCore.glad_debug_glGetAttachedShaders(), program,
      maxCount, count, shaders)

  public inline fun glGetAttribLocation(program: Int, name: MemorySegment): Int =
      PFNGLGETATTRIBLOCATIONPROC.invoke(GLCore.glad_debug_glGetAttribLocation(), program, name)

  public inline fun glGetAttribLocationARB(programObj: Int, name: MemorySegment): Int =
      PFNGLGETATTRIBLOCATIONARBPROC.invoke(GLCore.glad_debug_glGetAttribLocationARB(), programObj,
      name)

  public inline fun glGetBooleanIndexedvEXT(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETBOOLEANINDEXEDVEXTPROC.invoke(GLCore.glad_debug_glGetBooleanIndexedvEXT(),
      target, index, data)

  public inline fun glGetBooleani_v(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETBOOLEANI_VPROC.invoke(GLCore.glad_debug_glGetBooleani_v(), target, index, data)

  public inline fun glGetBooleanv(pname: Int, `data`: MemorySegment): Unit =
      PFNGLGETBOOLEANVPROC.invoke(GLCore.glad_debug_glGetBooleanv(), pname, data)

  public inline fun glGetBufferParameteri64v(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETBUFFERPARAMETERI64VPROC.invoke(GLCore.glad_debug_glGetBufferParameteri64v(),
      target, pname, params)

  public inline fun glGetBufferParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETBUFFERPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetBufferParameteriv(), target,
      pname, params)

  public inline fun glGetBufferParameterivARB(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETBUFFERPARAMETERIVARBPROC.invoke(GLCore.glad_debug_glGetBufferParameterivARB(),
      target, pname, params)

  public inline fun glGetBufferPointerv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETBUFFERPOINTERVPROC.invoke(GLCore.glad_debug_glGetBufferPointerv(), target,
      pname, params)

  public inline fun glGetBufferPointervARB(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETBUFFERPOINTERVARBPROC.invoke(GLCore.glad_debug_glGetBufferPointervARB(), target,
      pname, params)

  public inline fun glGetBufferSubData(
    target: Int,
    offset: Long,
    size: Long,
    `data`: MemorySegment,
  ): Unit = PFNGLGETBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glGetBufferSubData(), target, offset,
      size, data)

  public inline fun glGetBufferSubDataARB(
    target: Int,
    offset: Long,
    size: Long,
    `data`: MemorySegment,
  ): Unit = PFNGLGETBUFFERSUBDATAARBPROC.invoke(GLCore.glad_debug_glGetBufferSubDataARB(), target,
      offset, size, data)

  public inline fun glGetClipPlane(plane: Int, equation: MemorySegment): Unit =
      PFNGLGETCLIPPLANEPROC.invoke(GLCore.glad_debug_glGetClipPlane(), plane, equation)

  public inline fun glGetClipPlanefOES(plane: Int, equation: MemorySegment): Unit =
      PFNGLGETCLIPPLANEFOESPROC.invoke(GLCore.glad_debug_glGetClipPlanefOES(), plane, equation)

  public inline fun glGetColorTable(
    target: Int,
    format: Int,
    type: Int,
    table: MemorySegment,
  ): Unit = PFNGLGETCOLORTABLEPROC.invoke(GLCore.glad_debug_glGetColorTable(), target, format, type,
      table)

  public inline fun glGetColorTableParameterfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETCOLORTABLEPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetColorTableParameterfv(),
      target, pname, params)

  public inline fun glGetColorTableParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETCOLORTABLEPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetColorTableParameteriv(),
      target, pname, params)

  public inline fun glGetCompressedMultiTexImageEXT(
    texunit: Int,
    target: Int,
    lod: Int,
    img: MemorySegment,
  ): Unit =
      PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC.invoke(GLCore.glad_debug_glGetCompressedMultiTexImageEXT(),
      texunit, target, lod, img)

  public inline fun glGetCompressedTexImage(
    target: Int,
    level: Int,
    img: MemorySegment,
  ): Unit = PFNGLGETCOMPRESSEDTEXIMAGEPROC.invoke(GLCore.glad_debug_glGetCompressedTexImage(),
      target, level, img)

  public inline fun glGetCompressedTexImageARB(
    target: Int,
    level: Int,
    img: MemorySegment,
  ): Unit = PFNGLGETCOMPRESSEDTEXIMAGEARBPROC.invoke(GLCore.glad_debug_glGetCompressedTexImageARB(),
      target, level, img)

  public inline fun glGetCompressedTextureImage(
    texture: Int,
    level: Int,
    bufSize: Int,
    pixels: MemorySegment,
  ): Unit =
      PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC.invoke(GLCore.glad_debug_glGetCompressedTextureImage(),
      texture, level, bufSize, pixels)

  public inline fun glGetCompressedTextureImageEXT(
    texture: Int,
    target: Int,
    lod: Int,
    img: MemorySegment,
  ): Unit =
      PFNGLGETCOMPRESSEDTEXTUREIMAGEEXTPROC.invoke(GLCore.glad_debug_glGetCompressedTextureImageEXT(),
      texture, target, lod, img)

  public inline fun glGetCompressedTextureSubImage(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    bufSize: Int,
    pixels: MemorySegment,
  ): Unit =
      PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC.invoke(GLCore.glad_debug_glGetCompressedTextureSubImage(),
      texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels)

  public inline fun glGetConvolutionFilter(
    target: Int,
    format: Int,
    type: Int,
    image: MemorySegment,
  ): Unit = PFNGLGETCONVOLUTIONFILTERPROC.invoke(GLCore.glad_debug_glGetConvolutionFilter(), target,
      format, type, image)

  public inline fun glGetConvolutionParameterfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETCONVOLUTIONPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetConvolutionParameterfv(),
      target, pname, params)

  public inline fun glGetConvolutionParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETCONVOLUTIONPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetConvolutionParameteriv(),
      target, pname, params)

  public inline fun glGetDebugMessageLog(
    count: Int,
    bufSize: Int,
    sources: MemorySegment,
    types: MemorySegment,
    ids: MemorySegment,
    severities: MemorySegment,
    lengths: MemorySegment,
    messageLog: MemorySegment,
  ): Int = PFNGLGETDEBUGMESSAGELOGPROC.invoke(GLCore.glad_debug_glGetDebugMessageLog(), count,
      bufSize, sources, types, ids, severities, lengths, messageLog)

  public inline fun glGetDebugMessageLogARB(
    count: Int,
    bufSize: Int,
    sources: MemorySegment,
    types: MemorySegment,
    ids: MemorySegment,
    severities: MemorySegment,
    lengths: MemorySegment,
    messageLog: MemorySegment,
  ): Int = PFNGLGETDEBUGMESSAGELOGARBPROC.invoke(GLCore.glad_debug_glGetDebugMessageLogARB(), count,
      bufSize, sources, types, ids, severities, lengths, messageLog)

  public inline fun glGetDoubleIndexedvEXT(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETDOUBLEINDEXEDVEXTPROC.invoke(GLCore.glad_debug_glGetDoubleIndexedvEXT(), target,
      index, data)

  public inline fun glGetDoublei_v(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETDOUBLEI_VPROC.invoke(GLCore.glad_debug_glGetDoublei_v(), target, index, data)

  public inline fun glGetDoublei_vEXT(
    pname: Int,
    index: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETDOUBLEI_VEXTPROC.invoke(GLCore.glad_debug_glGetDoublei_vEXT(), pname, index,
      params)

  public inline fun glGetDoublev(pname: Int, `data`: MemorySegment): Unit =
      PFNGLGETDOUBLEVPROC.invoke(GLCore.glad_debug_glGetDoublev(), pname, data)

  public inline fun glGetError(): Int = PFNGLGETERRORPROC.invoke(GLCore.glad_debug_glGetError(), )

  public inline fun glGetFloatIndexedvEXT(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETFLOATINDEXEDVEXTPROC.invoke(GLCore.glad_debug_glGetFloatIndexedvEXT(), target,
      index, data)

  public inline fun glGetFloati_v(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETFLOATI_VPROC.invoke(GLCore.glad_debug_glGetFloati_v(), target, index, data)

  public inline fun glGetFloati_vEXT(
    pname: Int,
    index: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETFLOATI_VEXTPROC.invoke(GLCore.glad_debug_glGetFloati_vEXT(), pname, index,
      params)

  public inline fun glGetFloatv(pname: Int, `data`: MemorySegment): Unit =
      PFNGLGETFLOATVPROC.invoke(GLCore.glad_debug_glGetFloatv(), pname, data)

  public inline fun glGetFragDataIndex(program: Int, name: MemorySegment): Int =
      PFNGLGETFRAGDATAINDEXPROC.invoke(GLCore.glad_debug_glGetFragDataIndex(), program, name)

  public inline fun glGetFragDataLocation(program: Int, name: MemorySegment): Int =
      PFNGLGETFRAGDATALOCATIONPROC.invoke(GLCore.glad_debug_glGetFragDataLocation(), program, name)

  public inline fun glGetFragDataLocationEXT(program: Int, name: MemorySegment): Int =
      PFNGLGETFRAGDATALOCATIONEXTPROC.invoke(GLCore.glad_debug_glGetFragDataLocationEXT(), program,
      name)

  public inline fun glGetFramebufferAttachmentParameteriv(
    target: Int,
    attachment: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetFramebufferAttachmentParameteriv(),
      target, attachment, pname, params)

  public inline fun glGetFramebufferAttachmentParameterivEXT(
    target: Int,
    attachment: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetFramebufferAttachmentParameterivEXT(),
      target, attachment, pname, params)

  public inline fun glGetFramebufferParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETFRAMEBUFFERPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetFramebufferParameteriv(),
      target, pname, params)

  public inline fun glGetFramebufferParameterivEXT(
    framebuffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETFRAMEBUFFERPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetFramebufferParameterivEXT(),
      framebuffer, pname, params)

  public inline fun glGetGraphicsResetStatus(): Int =
      PFNGLGETGRAPHICSRESETSTATUSPROC.invoke(GLCore.glad_debug_glGetGraphicsResetStatus(), )

  public inline fun glGetGraphicsResetStatusARB(): Int =
      PFNGLGETGRAPHICSRESETSTATUSARBPROC.invoke(GLCore.glad_debug_glGetGraphicsResetStatusARB(), )

  public inline fun glGetHandleARB(pname: Int): Int =
      PFNGLGETHANDLEARBPROC.invoke(GLCore.glad_debug_glGetHandleARB(), pname)

  public inline fun glGetHistogram(
    target: Int,
    reset: Byte,
    format: Int,
    type: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETHISTOGRAMPROC.invoke(GLCore.glad_debug_glGetHistogram(), target, reset, format,
      type, values)

  public inline fun glGetHistogramParameterfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETHISTOGRAMPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetHistogramParameterfv(),
      target, pname, params)

  public inline fun glGetHistogramParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETHISTOGRAMPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetHistogramParameteriv(),
      target, pname, params)

  public inline fun glGetInfoLogARB(
    obj: Int,
    maxLength: Int,
    length: MemorySegment,
    infoLog: MemorySegment,
  ): Unit = PFNGLGETINFOLOGARBPROC.invoke(GLCore.glad_debug_glGetInfoLogARB(), obj, maxLength,
      length, infoLog)

  public inline fun glGetInteger64i_v(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETINTEGER64I_VPROC.invoke(GLCore.glad_debug_glGetInteger64i_v(), target, index,
      data)

  public inline fun glGetInteger64v(pname: Int, `data`: MemorySegment): Unit =
      PFNGLGETINTEGER64VPROC.invoke(GLCore.glad_debug_glGetInteger64v(), pname, data)

  public inline fun glGetIntegerIndexedvEXT(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETINTEGERINDEXEDVEXTPROC.invoke(GLCore.glad_debug_glGetIntegerIndexedvEXT(),
      target, index, data)

  public inline fun glGetIntegeri_v(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETINTEGERI_VPROC.invoke(GLCore.glad_debug_glGetIntegeri_v(), target, index, data)

  public inline fun glGetIntegerv(pname: Int, `data`: MemorySegment): Unit =
      PFNGLGETINTEGERVPROC.invoke(GLCore.glad_debug_glGetIntegerv(), pname, data)

  public inline fun glGetInternalformati64v(
    target: Int,
    internalformat: Int,
    pname: Int,
    count: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETINTERNALFORMATI64VPROC.invoke(GLCore.glad_debug_glGetInternalformati64v(),
      target, internalformat, pname, count, params)

  public inline fun glGetInternalformativ(
    target: Int,
    internalformat: Int,
    pname: Int,
    count: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETINTERNALFORMATIVPROC.invoke(GLCore.glad_debug_glGetInternalformativ(), target,
      internalformat, pname, count, params)

  public inline fun glGetLightfv(
    light: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETLIGHTFVPROC.invoke(GLCore.glad_debug_glGetLightfv(), light, pname, params)

  public inline fun glGetLightiv(
    light: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETLIGHTIVPROC.invoke(GLCore.glad_debug_glGetLightiv(), light, pname, params)

  public inline fun glGetMapdv(
    target: Int,
    query: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETMAPDVPROC.invoke(GLCore.glad_debug_glGetMapdv(), target, query, v)

  public inline fun glGetMapfv(
    target: Int,
    query: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETMAPFVPROC.invoke(GLCore.glad_debug_glGetMapfv(), target, query, v)

  public inline fun glGetMapiv(
    target: Int,
    query: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETMAPIVPROC.invoke(GLCore.glad_debug_glGetMapiv(), target, query, v)

  public inline fun glGetMaterialfv(
    face: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMATERIALFVPROC.invoke(GLCore.glad_debug_glGetMaterialfv(), face, pname, params)

  public inline fun glGetMaterialiv(
    face: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMATERIALIVPROC.invoke(GLCore.glad_debug_glGetMaterialiv(), face, pname, params)

  public inline fun glGetMinmax(
    target: Int,
    reset: Byte,
    format: Int,
    type: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETMINMAXPROC.invoke(GLCore.glad_debug_glGetMinmax(), target, reset, format, type,
      values)

  public inline fun glGetMinmaxParameterfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMINMAXPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetMinmaxParameterfv(), target,
      pname, params)

  public inline fun glGetMinmaxParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMINMAXPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetMinmaxParameteriv(), target,
      pname, params)

  public inline fun glGetMultiTexEnvfvEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMULTITEXENVFVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexEnvfvEXT(), texunit,
      target, pname, params)

  public inline fun glGetMultiTexEnvivEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMULTITEXENVIVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexEnvivEXT(), texunit,
      target, pname, params)

  public inline fun glGetMultiTexGendvEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMULTITEXGENDVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexGendvEXT(), texunit,
      coord, pname, params)

  public inline fun glGetMultiTexGenfvEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMULTITEXGENFVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexGenfvEXT(), texunit,
      coord, pname, params)

  public inline fun glGetMultiTexGenivEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETMULTITEXGENIVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexGenivEXT(), texunit,
      coord, pname, params)

  public inline fun glGetMultiTexImageEXT(
    texunit: Int,
    target: Int,
    level: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLGETMULTITEXIMAGEEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexImageEXT(), texunit,
      target, level, format, type, pixels)

  public inline fun glGetMultiTexLevelParameterfvEXT(
    texunit: Int,
    target: Int,
    level: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETMULTITEXLEVELPARAMETERFVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexLevelParameterfvEXT(),
      texunit, target, level, pname, params)

  public inline fun glGetMultiTexLevelParameterivEXT(
    texunit: Int,
    target: Int,
    level: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexLevelParameterivEXT(),
      texunit, target, level, pname, params)

  public inline fun glGetMultiTexParameterIivEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETMULTITEXPARAMETERIIVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexParameterIivEXT(),
      texunit, target, pname, params)

  public inline fun glGetMultiTexParameterIuivEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETMULTITEXPARAMETERIUIVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexParameterIuivEXT(),
      texunit, target, pname, params)

  public inline fun glGetMultiTexParameterfvEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETMULTITEXPARAMETERFVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexParameterfvEXT(),
      texunit, target, pname, params)

  public inline fun glGetMultiTexParameterivEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETMULTITEXPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetMultiTexParameterivEXT(),
      texunit, target, pname, params)

  public inline fun glGetMultisamplefv(
    pname: Int,
    index: Int,
    `val`: MemorySegment,
  ): Unit = PFNGLGETMULTISAMPLEFVPROC.invoke(GLCore.glad_debug_glGetMultisamplefv(), pname, index,
      `val`)

  public inline fun glGetMultisamplefvNV(
    pname: Int,
    index: Int,
    `val`: MemorySegment,
  ): Unit = PFNGLGETMULTISAMPLEFVNVPROC.invoke(GLCore.glad_debug_glGetMultisamplefvNV(), pname,
      index, `val`)

  public inline fun glGetNamedBufferParameteri64v(
    buffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDBUFFERPARAMETERI64VPROC.invoke(GLCore.glad_debug_glGetNamedBufferParameteri64v(),
      buffer, pname, params)

  public inline fun glGetNamedBufferParameteriv(
    buffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDBUFFERPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetNamedBufferParameteriv(),
      buffer, pname, params)

  public inline fun glGetNamedBufferParameterivEXT(
    buffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetNamedBufferParameterivEXT(),
      buffer, pname, params)

  public inline fun glGetNamedBufferPointerv(
    buffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNAMEDBUFFERPOINTERVPROC.invoke(GLCore.glad_debug_glGetNamedBufferPointerv(),
      buffer, pname, params)

  public inline fun glGetNamedBufferPointervEXT(
    buffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDBUFFERPOINTERVEXTPROC.invoke(GLCore.glad_debug_glGetNamedBufferPointervEXT(),
      buffer, pname, params)

  public inline fun glGetNamedBufferSubData(
    buffer: Int,
    offset: Long,
    size: Long,
    `data`: MemorySegment,
  ): Unit = PFNGLGETNAMEDBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glGetNamedBufferSubData(),
      buffer, offset, size, data)

  public inline fun glGetNamedBufferSubDataEXT(
    buffer: Int,
    offset: Long,
    size: Long,
    `data`: MemorySegment,
  ): Unit = PFNGLGETNAMEDBUFFERSUBDATAEXTPROC.invoke(GLCore.glad_debug_glGetNamedBufferSubDataEXT(),
      buffer, offset, size, data)

  public inline fun glGetNamedFramebufferAttachmentParameteriv(
    framebuffer: Int,
    attachment: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetNamedFramebufferAttachmentParameteriv(),
      framebuffer, attachment, pname, params)

  public inline fun glGetNamedFramebufferAttachmentParameterivEXT(
    framebuffer: Int,
    attachment: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetNamedFramebufferAttachmentParameterivEXT(),
      framebuffer, attachment, pname, params)

  public inline fun glGetNamedFramebufferParameteriv(
    framebuffer: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetNamedFramebufferParameteriv(),
      framebuffer, pname, param)

  public inline fun glGetNamedFramebufferParameterivEXT(
    framebuffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetNamedFramebufferParameterivEXT(),
      framebuffer, pname, params)

  public inline fun glGetNamedProgramLocalParameterIivEXT(
    program: Int,
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC.invoke(GLCore.glad_debug_glGetNamedProgramLocalParameterIivEXT(),
      program, target, index, params)

  public inline fun glGetNamedProgramLocalParameterIuivEXT(
    program: Int,
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDPROGRAMLOCALPARAMETERIUIVEXTPROC.invoke(GLCore.glad_debug_glGetNamedProgramLocalParameterIuivEXT(),
      program, target, index, params)

  public inline fun glGetNamedProgramLocalParameterdvEXT(
    program: Int,
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC.invoke(GLCore.glad_debug_glGetNamedProgramLocalParameterdvEXT(),
      program, target, index, params)

  public inline fun glGetNamedProgramLocalParameterfvEXT(
    program: Int,
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDPROGRAMLOCALPARAMETERFVEXTPROC.invoke(GLCore.glad_debug_glGetNamedProgramLocalParameterfvEXT(),
      program, target, index, params)

  public inline fun glGetNamedProgramStringEXT(
    program: Int,
    target: Int,
    pname: Int,
    string: MemorySegment,
  ): Unit = PFNGLGETNAMEDPROGRAMSTRINGEXTPROC.invoke(GLCore.glad_debug_glGetNamedProgramStringEXT(),
      program, target, pname, string)

  public inline fun glGetNamedProgramivEXT(
    program: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNAMEDPROGRAMIVEXTPROC.invoke(GLCore.glad_debug_glGetNamedProgramivEXT(),
      program, target, pname, params)

  public inline fun glGetNamedRenderbufferParameteriv(
    renderbuffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetNamedRenderbufferParameteriv(),
      renderbuffer, pname, params)

  public inline fun glGetNamedRenderbufferParameterivEXT(
    renderbuffer: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETNAMEDRENDERBUFFERPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetNamedRenderbufferParameterivEXT(),
      renderbuffer, pname, params)

  public inline fun glGetObjectLabel(
    identifier: Int,
    name: Int,
    bufSize: Int,
    length: MemorySegment,
    label: MemorySegment,
  ): Unit = PFNGLGETOBJECTLABELPROC.invoke(GLCore.glad_debug_glGetObjectLabel(), identifier, name,
      bufSize, length, label)

  public inline fun glGetObjectParameterfvARB(
    obj: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETOBJECTPARAMETERFVARBPROC.invoke(GLCore.glad_debug_glGetObjectParameterfvARB(),
      obj, pname, params)

  public inline fun glGetObjectParameterivARB(
    obj: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETOBJECTPARAMETERIVARBPROC.invoke(GLCore.glad_debug_glGetObjectParameterivARB(),
      obj, pname, params)

  public inline fun glGetObjectPtrLabel(
    ptr: MemorySegment,
    bufSize: Int,
    length: MemorySegment,
    label: MemorySegment,
  ): Unit = PFNGLGETOBJECTPTRLABELPROC.invoke(GLCore.glad_debug_glGetObjectPtrLabel(), ptr, bufSize,
      length, label)

  public inline fun glGetPixelMapfv(map: Int, values: MemorySegment): Unit =
      PFNGLGETPIXELMAPFVPROC.invoke(GLCore.glad_debug_glGetPixelMapfv(), map, values)

  public inline fun glGetPixelMapuiv(map: Int, values: MemorySegment): Unit =
      PFNGLGETPIXELMAPUIVPROC.invoke(GLCore.glad_debug_glGetPixelMapuiv(), map, values)

  public inline fun glGetPixelMapusv(map: Int, values: MemorySegment): Unit =
      PFNGLGETPIXELMAPUSVPROC.invoke(GLCore.glad_debug_glGetPixelMapusv(), map, values)

  public inline fun glGetPointerIndexedvEXT(
    target: Int,
    index: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLGETPOINTERINDEXEDVEXTPROC.invoke(GLCore.glad_debug_glGetPointerIndexedvEXT(),
      target, index, data)

  public inline fun glGetPointeri_vEXT(
    pname: Int,
    index: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETPOINTERI_VEXTPROC.invoke(GLCore.glad_debug_glGetPointeri_vEXT(), pname, index,
      params)

  public inline fun glGetPointerv(pname: Int, params: MemorySegment): Unit =
      PFNGLGETPOINTERVPROC.invoke(GLCore.glad_debug_glGetPointerv(), pname, params)

  public inline fun glGetPointervEXT(pname: Int, params: MemorySegment): Unit =
      PFNGLGETPOINTERVEXTPROC.invoke(GLCore.glad_debug_glGetPointervEXT(), pname, params)

  public inline fun glGetPolygonStipple(mask: MemorySegment): Unit =
      PFNGLGETPOLYGONSTIPPLEPROC.invoke(GLCore.glad_debug_glGetPolygonStipple(), mask)

  public inline fun glGetProgramBinary(
    program: Int,
    bufSize: Int,
    length: MemorySegment,
    binaryFormat: MemorySegment,
    binary: MemorySegment,
  ): Unit = PFNGLGETPROGRAMBINARYPROC.invoke(GLCore.glad_debug_glGetProgramBinary(), program,
      bufSize, length, binaryFormat, binary)

  public inline fun glGetProgramEnvParameterdvARB(
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETPROGRAMENVPARAMETERDVARBPROC.invoke(GLCore.glad_debug_glGetProgramEnvParameterdvARB(),
      target, index, params)

  public inline fun glGetProgramEnvParameterfvARB(
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETPROGRAMENVPARAMETERFVARBPROC.invoke(GLCore.glad_debug_glGetProgramEnvParameterfvARB(),
      target, index, params)

  public inline fun glGetProgramInfoLog(
    program: Int,
    bufSize: Int,
    length: MemorySegment,
    infoLog: MemorySegment,
  ): Unit = PFNGLGETPROGRAMINFOLOGPROC.invoke(GLCore.glad_debug_glGetProgramInfoLog(), program,
      bufSize, length, infoLog)

  public inline fun glGetProgramInterfaceiv(
    program: Int,
    programInterface: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETPROGRAMINTERFACEIVPROC.invoke(GLCore.glad_debug_glGetProgramInterfaceiv(),
      program, programInterface, pname, params)

  public inline fun glGetProgramLocalParameterdvARB(
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETPROGRAMLOCALPARAMETERDVARBPROC.invoke(GLCore.glad_debug_glGetProgramLocalParameterdvARB(),
      target, index, params)

  public inline fun glGetProgramLocalParameterfvARB(
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC.invoke(GLCore.glad_debug_glGetProgramLocalParameterfvARB(),
      target, index, params)

  public inline fun glGetProgramParameterdvNV(
    target: Int,
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETPROGRAMPARAMETERDVNVPROC.invoke(GLCore.glad_debug_glGetProgramParameterdvNV(),
      target, index, pname, params)

  public inline fun glGetProgramParameterfvNV(
    target: Int,
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETPROGRAMPARAMETERFVNVPROC.invoke(GLCore.glad_debug_glGetProgramParameterfvNV(),
      target, index, pname, params)

  public inline fun glGetProgramPipelineInfoLog(
    pipeline: Int,
    bufSize: Int,
    length: MemorySegment,
    infoLog: MemorySegment,
  ): Unit =
      PFNGLGETPROGRAMPIPELINEINFOLOGPROC.invoke(GLCore.glad_debug_glGetProgramPipelineInfoLog(),
      pipeline, bufSize, length, infoLog)

  public inline fun glGetProgramPipelineiv(
    pipeline: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETPROGRAMPIPELINEIVPROC.invoke(GLCore.glad_debug_glGetProgramPipelineiv(),
      pipeline, pname, params)

  public inline fun glGetProgramResourceIndex(
    program: Int,
    programInterface: Int,
    name: MemorySegment,
  ): Int = PFNGLGETPROGRAMRESOURCEINDEXPROC.invoke(GLCore.glad_debug_glGetProgramResourceIndex(),
      program, programInterface, name)

  public inline fun glGetProgramResourceLocation(
    program: Int,
    programInterface: Int,
    name: MemorySegment,
  ): Int =
      PFNGLGETPROGRAMRESOURCELOCATIONPROC.invoke(GLCore.glad_debug_glGetProgramResourceLocation(),
      program, programInterface, name)

  public inline fun glGetProgramResourceLocationIndex(
    program: Int,
    programInterface: Int,
    name: MemorySegment,
  ): Int =
      PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC.invoke(GLCore.glad_debug_glGetProgramResourceLocationIndex(),
      program, programInterface, name)

  public inline fun glGetProgramResourceName(
    program: Int,
    programInterface: Int,
    index: Int,
    bufSize: Int,
    length: MemorySegment,
    name: MemorySegment,
  ): Unit = PFNGLGETPROGRAMRESOURCENAMEPROC.invoke(GLCore.glad_debug_glGetProgramResourceName(),
      program, programInterface, index, bufSize, length, name)

  public inline fun glGetProgramResourceiv(
    program: Int,
    programInterface: Int,
    index: Int,
    propCount: Int,
    props: MemorySegment,
    count: Int,
    length: MemorySegment,
    params: MemorySegment,
  ): Unit = PFNGLGETPROGRAMRESOURCEIVPROC.invoke(GLCore.glad_debug_glGetProgramResourceiv(),
      program, programInterface, index, propCount, props, count, length, params)

  public inline fun glGetProgramStageiv(
    program: Int,
    shadertype: Int,
    pname: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETPROGRAMSTAGEIVPROC.invoke(GLCore.glad_debug_glGetProgramStageiv(), program,
      shadertype, pname, values)

  public inline fun glGetProgramStringARB(
    target: Int,
    pname: Int,
    string: MemorySegment,
  ): Unit = PFNGLGETPROGRAMSTRINGARBPROC.invoke(GLCore.glad_debug_glGetProgramStringARB(), target,
      pname, string)

  public inline fun glGetProgramStringNV(
    id: Int,
    pname: Int,
    program: MemorySegment,
  ): Unit = PFNGLGETPROGRAMSTRINGNVPROC.invoke(GLCore.glad_debug_glGetProgramStringNV(), id, pname,
      program)

  public inline fun glGetProgramiv(
    program: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETPROGRAMIVPROC.invoke(GLCore.glad_debug_glGetProgramiv(), program, pname, params)

  public inline fun glGetProgramivARB(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETPROGRAMIVARBPROC.invoke(GLCore.glad_debug_glGetProgramivARB(), target, pname,
      params)

  public inline fun glGetProgramivNV(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETPROGRAMIVNVPROC.invoke(GLCore.glad_debug_glGetProgramivNV(), id, pname, params)

  public inline fun glGetQueryBufferObjecti64v(
    id: Int,
    buffer: Int,
    pname: Int,
    offset: Long,
  ): Unit = PFNGLGETQUERYBUFFEROBJECTI64VPROC.invoke(GLCore.glad_debug_glGetQueryBufferObjecti64v(),
      id, buffer, pname, offset)

  public inline fun glGetQueryBufferObjectiv(
    id: Int,
    buffer: Int,
    pname: Int,
    offset: Long,
  ): Unit = PFNGLGETQUERYBUFFEROBJECTIVPROC.invoke(GLCore.glad_debug_glGetQueryBufferObjectiv(), id,
      buffer, pname, offset)

  public inline fun glGetQueryBufferObjectui64v(
    id: Int,
    buffer: Int,
    pname: Int,
    offset: Long,
  ): Unit =
      PFNGLGETQUERYBUFFEROBJECTUI64VPROC.invoke(GLCore.glad_debug_glGetQueryBufferObjectui64v(), id,
      buffer, pname, offset)

  public inline fun glGetQueryBufferObjectuiv(
    id: Int,
    buffer: Int,
    pname: Int,
    offset: Long,
  ): Unit = PFNGLGETQUERYBUFFEROBJECTUIVPROC.invoke(GLCore.glad_debug_glGetQueryBufferObjectuiv(),
      id, buffer, pname, offset)

  public inline fun glGetQueryIndexediv(
    target: Int,
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYINDEXEDIVPROC.invoke(GLCore.glad_debug_glGetQueryIndexediv(), target,
      index, pname, params)

  public inline fun glGetQueryObjecti64v(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYOBJECTI64VPROC.invoke(GLCore.glad_debug_glGetQueryObjecti64v(), id, pname,
      params)

  public inline fun glGetQueryObjecti64vEXT(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYOBJECTI64VEXTPROC.invoke(GLCore.glad_debug_glGetQueryObjecti64vEXT(), id,
      pname, params)

  public inline fun glGetQueryObjectiv(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYOBJECTIVPROC.invoke(GLCore.glad_debug_glGetQueryObjectiv(), id, pname,
      params)

  public inline fun glGetQueryObjectivARB(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYOBJECTIVARBPROC.invoke(GLCore.glad_debug_glGetQueryObjectivARB(), id,
      pname, params)

  public inline fun glGetQueryObjectui64v(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYOBJECTUI64VPROC.invoke(GLCore.glad_debug_glGetQueryObjectui64v(), id,
      pname, params)

  public inline fun glGetQueryObjectui64vEXT(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYOBJECTUI64VEXTPROC.invoke(GLCore.glad_debug_glGetQueryObjectui64vEXT(), id,
      pname, params)

  public inline fun glGetQueryObjectuiv(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYOBJECTUIVPROC.invoke(GLCore.glad_debug_glGetQueryObjectuiv(), id, pname,
      params)

  public inline fun glGetQueryObjectuivARB(
    id: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYOBJECTUIVARBPROC.invoke(GLCore.glad_debug_glGetQueryObjectuivARB(), id,
      pname, params)

  public inline fun glGetQueryiv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYIVPROC.invoke(GLCore.glad_debug_glGetQueryiv(), target, pname, params)

  public inline fun glGetQueryivARB(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETQUERYIVARBPROC.invoke(GLCore.glad_debug_glGetQueryivARB(), target, pname,
      params)

  public inline fun glGetRenderbufferParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETRENDERBUFFERPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetRenderbufferParameteriv(),
      target, pname, params)

  public inline fun glGetRenderbufferParameterivEXT(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETRENDERBUFFERPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetRenderbufferParameterivEXT(),
      target, pname, params)

  public inline fun glGetSamplerParameterIiv(
    sampler: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETSAMPLERPARAMETERIIVPROC.invoke(GLCore.glad_debug_glGetSamplerParameterIiv(),
      sampler, pname, params)

  public inline fun glGetSamplerParameterIuiv(
    sampler: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETSAMPLERPARAMETERIUIVPROC.invoke(GLCore.glad_debug_glGetSamplerParameterIuiv(),
      sampler, pname, params)

  public inline fun glGetSamplerParameterfv(
    sampler: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETSAMPLERPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetSamplerParameterfv(),
      sampler, pname, params)

  public inline fun glGetSamplerParameteriv(
    sampler: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETSAMPLERPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetSamplerParameteriv(),
      sampler, pname, params)

  public inline fun glGetSeparableFilter(
    target: Int,
    format: Int,
    type: Int,
    row: MemorySegment,
    column: MemorySegment,
    span: MemorySegment,
  ): Unit = PFNGLGETSEPARABLEFILTERPROC.invoke(GLCore.glad_debug_glGetSeparableFilter(), target,
      format, type, row, column, span)

  public inline fun glGetShaderInfoLog(
    shader: Int,
    bufSize: Int,
    length: MemorySegment,
    infoLog: MemorySegment,
  ): Unit = PFNGLGETSHADERINFOLOGPROC.invoke(GLCore.glad_debug_glGetShaderInfoLog(), shader,
      bufSize, length, infoLog)

  public inline fun glGetShaderPrecisionFormat(
    shadertype: Int,
    precisiontype: Int,
    range: MemorySegment,
    precision: MemorySegment,
  ): Unit = PFNGLGETSHADERPRECISIONFORMATPROC.invoke(GLCore.glad_debug_glGetShaderPrecisionFormat(),
      shadertype, precisiontype, range, precision)

  public inline fun glGetShaderSource(
    shader: Int,
    bufSize: Int,
    length: MemorySegment,
    source: MemorySegment,
  ): Unit = PFNGLGETSHADERSOURCEPROC.invoke(GLCore.glad_debug_glGetShaderSource(), shader, bufSize,
      length, source)

  public inline fun glGetShaderSourceARB(
    obj: Int,
    maxLength: Int,
    length: MemorySegment,
    source: MemorySegment,
  ): Unit = PFNGLGETSHADERSOURCEARBPROC.invoke(GLCore.glad_debug_glGetShaderSourceARB(), obj,
      maxLength, length, source)

  public inline fun glGetShaderiv(
    shader: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETSHADERIVPROC.invoke(GLCore.glad_debug_glGetShaderiv(), shader, pname, params)

  public inline fun glGetString(name: Int): MemorySegment =
      PFNGLGETSTRINGPROC.invoke(GLCore.glad_debug_glGetString(), name)

  public inline fun glGetStringi(name: Int, index: Int): MemorySegment =
      PFNGLGETSTRINGIPROC.invoke(GLCore.glad_debug_glGetStringi(), name, index)

  public inline fun glGetSubroutineIndex(
    program: Int,
    shadertype: Int,
    name: MemorySegment,
  ): Int = PFNGLGETSUBROUTINEINDEXPROC.invoke(GLCore.glad_debug_glGetSubroutineIndex(), program,
      shadertype, name)

  public inline fun glGetSubroutineUniformLocation(
    program: Int,
    shadertype: Int,
    name: MemorySegment,
  ): Int =
      PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC.invoke(GLCore.glad_debug_glGetSubroutineUniformLocation(),
      program, shadertype, name)

  public inline fun glGetSynciv(
    sync: MemorySegment,
    pname: Int,
    count: Int,
    length: MemorySegment,
    values: MemorySegment,
  ): Unit = PFNGLGETSYNCIVPROC.invoke(GLCore.glad_debug_glGetSynciv(), sync, pname, count, length,
      values)

  public inline fun glGetTexEnvfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXENVFVPROC.invoke(GLCore.glad_debug_glGetTexEnvfv(), target, pname, params)

  public inline fun glGetTexEnviv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXENVIVPROC.invoke(GLCore.glad_debug_glGetTexEnviv(), target, pname, params)

  public inline fun glGetTexGendv(
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXGENDVPROC.invoke(GLCore.glad_debug_glGetTexGendv(), coord, pname, params)

  public inline fun glGetTexGenfv(
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXGENFVPROC.invoke(GLCore.glad_debug_glGetTexGenfv(), coord, pname, params)

  public inline fun glGetTexGeniv(
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXGENIVPROC.invoke(GLCore.glad_debug_glGetTexGeniv(), coord, pname, params)

  public inline fun glGetTexImage(
    target: Int,
    level: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLGETTEXIMAGEPROC.invoke(GLCore.glad_debug_glGetTexImage(), target, level, format,
      type, pixels)

  public inline fun glGetTexLevelParameterfv(
    target: Int,
    level: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXLEVELPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetTexLevelParameterfv(),
      target, level, pname, params)

  public inline fun glGetTexLevelParameteriv(
    target: Int,
    level: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXLEVELPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetTexLevelParameteriv(),
      target, level, pname, params)

  public inline fun glGetTexParameterIiv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXPARAMETERIIVPROC.invoke(GLCore.glad_debug_glGetTexParameterIiv(), target,
      pname, params)

  public inline fun glGetTexParameterIivEXT(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXPARAMETERIIVEXTPROC.invoke(GLCore.glad_debug_glGetTexParameterIivEXT(),
      target, pname, params)

  public inline fun glGetTexParameterIuiv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXPARAMETERIUIVPROC.invoke(GLCore.glad_debug_glGetTexParameterIuiv(), target,
      pname, params)

  public inline fun glGetTexParameterIuivEXT(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXPARAMETERIUIVEXTPROC.invoke(GLCore.glad_debug_glGetTexParameterIuivEXT(),
      target, pname, params)

  public inline fun glGetTexParameterfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetTexParameterfv(), target,
      pname, params)

  public inline fun glGetTexParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetTexParameteriv(), target,
      pname, params)

  public inline fun glGetTextureImage(
    texture: Int,
    level: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLGETTEXTUREIMAGEPROC.invoke(GLCore.glad_debug_glGetTextureImage(), texture, level,
      format, type, bufSize, pixels)

  public inline fun glGetTextureImageEXT(
    texture: Int,
    target: Int,
    level: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLGETTEXTUREIMAGEEXTPROC.invoke(GLCore.glad_debug_glGetTextureImageEXT(), texture,
      target, level, format, type, pixels)

  public inline fun glGetTextureLevelParameterfv(
    texture: Int,
    level: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETTEXTURELEVELPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetTextureLevelParameterfv(),
      texture, level, pname, params)

  public inline fun glGetTextureLevelParameterfvEXT(
    texture: Int,
    target: Int,
    level: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC.invoke(GLCore.glad_debug_glGetTextureLevelParameterfvEXT(),
      texture, target, level, pname, params)

  public inline fun glGetTextureLevelParameteriv(
    texture: Int,
    level: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETTEXTURELEVELPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetTextureLevelParameteriv(),
      texture, level, pname, params)

  public inline fun glGetTextureLevelParameterivEXT(
    texture: Int,
    target: Int,
    level: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetTextureLevelParameterivEXT(),
      texture, target, level, pname, params)

  public inline fun glGetTextureParameterIiv(
    texture: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXTUREPARAMETERIIVPROC.invoke(GLCore.glad_debug_glGetTextureParameterIiv(),
      texture, pname, params)

  public inline fun glGetTextureParameterIivEXT(
    texture: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETTEXTUREPARAMETERIIVEXTPROC.invoke(GLCore.glad_debug_glGetTextureParameterIivEXT(),
      texture, target, pname, params)

  public inline fun glGetTextureParameterIuiv(
    texture: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXTUREPARAMETERIUIVPROC.invoke(GLCore.glad_debug_glGetTextureParameterIuiv(),
      texture, pname, params)

  public inline fun glGetTextureParameterIuivEXT(
    texture: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLGETTEXTUREPARAMETERIUIVEXTPROC.invoke(GLCore.glad_debug_glGetTextureParameterIuivEXT(),
      texture, target, pname, params)

  public inline fun glGetTextureParameterfv(
    texture: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXTUREPARAMETERFVPROC.invoke(GLCore.glad_debug_glGetTextureParameterfv(),
      texture, pname, params)

  public inline fun glGetTextureParameterfvEXT(
    texture: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXTUREPARAMETERFVEXTPROC.invoke(GLCore.glad_debug_glGetTextureParameterfvEXT(),
      texture, target, pname, params)

  public inline fun glGetTextureParameteriv(
    texture: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXTUREPARAMETERIVPROC.invoke(GLCore.glad_debug_glGetTextureParameteriv(),
      texture, pname, params)

  public inline fun glGetTextureParameterivEXT(
    texture: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTEXTUREPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glGetTextureParameterivEXT(),
      texture, target, pname, params)

  public inline fun glGetTextureSubImage(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLGETTEXTURESUBIMAGEPROC.invoke(GLCore.glad_debug_glGetTextureSubImage(), texture,
      level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels)

  public inline fun glGetTrackMatrixivNV(
    target: Int,
    address: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETTRACKMATRIXIVNVPROC.invoke(GLCore.glad_debug_glGetTrackMatrixivNV(), target,
      address, pname, params)

  public inline fun glGetTransformFeedbackVarying(
    program: Int,
    index: Int,
    bufSize: Int,
    length: MemorySegment,
    size: MemorySegment,
    type: MemorySegment,
    name: MemorySegment,
  ): Unit =
      PFNGLGETTRANSFORMFEEDBACKVARYINGPROC.invoke(GLCore.glad_debug_glGetTransformFeedbackVarying(),
      program, index, bufSize, length, size, type, name)

  public inline fun glGetTransformFeedbackVaryingEXT(
    program: Int,
    index: Int,
    bufSize: Int,
    length: MemorySegment,
    size: MemorySegment,
    type: MemorySegment,
    name: MemorySegment,
  ): Unit =
      PFNGLGETTRANSFORMFEEDBACKVARYINGEXTPROC.invoke(GLCore.glad_debug_glGetTransformFeedbackVaryingEXT(),
      program, index, bufSize, length, size, type, name)

  public inline fun glGetTransformFeedbackVaryingNV(
    program: Int,
    index: Int,
    location: MemorySegment,
  ): Unit =
      PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROC.invoke(GLCore.glad_debug_glGetTransformFeedbackVaryingNV(),
      program, index, location)

  public inline fun glGetTransformFeedbacki64_v(
    xfb: Int,
    pname: Int,
    index: Int,
    `param`: MemorySegment,
  ): Unit =
      PFNGLGETTRANSFORMFEEDBACKI64_VPROC.invoke(GLCore.glad_debug_glGetTransformFeedbacki64_v(),
      xfb, pname, index, param)

  public inline fun glGetTransformFeedbacki_v(
    xfb: Int,
    pname: Int,
    index: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLGETTRANSFORMFEEDBACKI_VPROC.invoke(GLCore.glad_debug_glGetTransformFeedbacki_v(),
      xfb, pname, index, param)

  public inline fun glGetTransformFeedbackiv(
    xfb: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLGETTRANSFORMFEEDBACKIVPROC.invoke(GLCore.glad_debug_glGetTransformFeedbackiv(),
      xfb, pname, param)

  public inline fun glGetUniformBlockIndex(program: Int, uniformBlockName: MemorySegment): Int =
      PFNGLGETUNIFORMBLOCKINDEXPROC.invoke(GLCore.glad_debug_glGetUniformBlockIndex(), program,
      uniformBlockName)

  public inline fun glGetUniformIndices(
    program: Int,
    uniformCount: Int,
    uniformNames: MemorySegment,
    uniformIndices: MemorySegment,
  ): Unit = PFNGLGETUNIFORMINDICESPROC.invoke(GLCore.glad_debug_glGetUniformIndices(), program,
      uniformCount, uniformNames, uniformIndices)

  public inline fun glGetUniformLocation(program: Int, name: MemorySegment): Int =
      PFNGLGETUNIFORMLOCATIONPROC.invoke(GLCore.glad_debug_glGetUniformLocation(), program, name)

  public inline fun glGetUniformLocationARB(programObj: Int, name: MemorySegment): Int =
      PFNGLGETUNIFORMLOCATIONARBPROC.invoke(GLCore.glad_debug_glGetUniformLocationARB(), programObj,
      name)

  public inline fun glGetUniformSubroutineuiv(
    shadertype: Int,
    location: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETUNIFORMSUBROUTINEUIVPROC.invoke(GLCore.glad_debug_glGetUniformSubroutineuiv(),
      shadertype, location, params)

  public inline fun glGetUniformdv(
    program: Int,
    location: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETUNIFORMDVPROC.invoke(GLCore.glad_debug_glGetUniformdv(), program, location,
      params)

  public inline fun glGetUniformfv(
    program: Int,
    location: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETUNIFORMFVPROC.invoke(GLCore.glad_debug_glGetUniformfv(), program, location,
      params)

  public inline fun glGetUniformfvARB(
    programObj: Int,
    location: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETUNIFORMFVARBPROC.invoke(GLCore.glad_debug_glGetUniformfvARB(), programObj,
      location, params)

  public inline fun glGetUniformiv(
    program: Int,
    location: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETUNIFORMIVPROC.invoke(GLCore.glad_debug_glGetUniformiv(), program, location,
      params)

  public inline fun glGetUniformivARB(
    programObj: Int,
    location: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETUNIFORMIVARBPROC.invoke(GLCore.glad_debug_glGetUniformivARB(), programObj,
      location, params)

  public inline fun glGetUniformuiv(
    program: Int,
    location: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETUNIFORMUIVPROC.invoke(GLCore.glad_debug_glGetUniformuiv(), program, location,
      params)

  public inline fun glGetUniformuivEXT(
    program: Int,
    location: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETUNIFORMUIVEXTPROC.invoke(GLCore.glad_debug_glGetUniformuivEXT(), program,
      location, params)

  public inline fun glGetVaryingLocationNV(program: Int, name: MemorySegment): Int =
      PFNGLGETVARYINGLOCATIONNVPROC.invoke(GLCore.glad_debug_glGetVaryingLocationNV(), program,
      name)

  public inline fun glGetVertexArrayIndexed64iv(
    vaobj: Int,
    index: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit =
      PFNGLGETVERTEXARRAYINDEXED64IVPROC.invoke(GLCore.glad_debug_glGetVertexArrayIndexed64iv(),
      vaobj, index, pname, param)

  public inline fun glGetVertexArrayIndexediv(
    vaobj: Int,
    index: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLGETVERTEXARRAYINDEXEDIVPROC.invoke(GLCore.glad_debug_glGetVertexArrayIndexediv(),
      vaobj, index, pname, param)

  public inline fun glGetVertexArrayIntegeri_vEXT(
    vaobj: Int,
    index: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit =
      PFNGLGETVERTEXARRAYINTEGERI_VEXTPROC.invoke(GLCore.glad_debug_glGetVertexArrayIntegeri_vEXT(),
      vaobj, index, pname, param)

  public inline fun glGetVertexArrayIntegervEXT(
    vaobj: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit =
      PFNGLGETVERTEXARRAYINTEGERVEXTPROC.invoke(GLCore.glad_debug_glGetVertexArrayIntegervEXT(),
      vaobj, pname, param)

  public inline fun glGetVertexArrayPointeri_vEXT(
    vaobj: Int,
    index: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit =
      PFNGLGETVERTEXARRAYPOINTERI_VEXTPROC.invoke(GLCore.glad_debug_glGetVertexArrayPointeri_vEXT(),
      vaobj, index, pname, param)

  public inline fun glGetVertexArrayPointervEXT(
    vaobj: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit =
      PFNGLGETVERTEXARRAYPOINTERVEXTPROC.invoke(GLCore.glad_debug_glGetVertexArrayPointervEXT(),
      vaobj, pname, param)

  public inline fun glGetVertexArrayiv(
    vaobj: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLGETVERTEXARRAYIVPROC.invoke(GLCore.glad_debug_glGetVertexArrayiv(), vaobj, pname,
      param)

  public inline fun glGetVertexAttribIiv(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBIIVPROC.invoke(GLCore.glad_debug_glGetVertexAttribIiv(), index,
      pname, params)

  public inline fun glGetVertexAttribIivEXT(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBIIVEXTPROC.invoke(GLCore.glad_debug_glGetVertexAttribIivEXT(),
      index, pname, params)

  public inline fun glGetVertexAttribIuiv(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBIUIVPROC.invoke(GLCore.glad_debug_glGetVertexAttribIuiv(), index,
      pname, params)

  public inline fun glGetVertexAttribIuivEXT(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBIUIVEXTPROC.invoke(GLCore.glad_debug_glGetVertexAttribIuivEXT(),
      index, pname, params)

  public inline fun glGetVertexAttribLdv(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBLDVPROC.invoke(GLCore.glad_debug_glGetVertexAttribLdv(), index,
      pname, params)

  public inline fun glGetVertexAttribLdvEXT(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBLDVEXTPROC.invoke(GLCore.glad_debug_glGetVertexAttribLdvEXT(),
      index, pname, params)

  public inline fun glGetVertexAttribPointerv(
    index: Int,
    pname: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBPOINTERVPROC.invoke(GLCore.glad_debug_glGetVertexAttribPointerv(),
      index, pname, pointer)

  public inline fun glGetVertexAttribPointervARB(
    index: Int,
    pname: Int,
    pointer: MemorySegment,
  ): Unit =
      PFNGLGETVERTEXATTRIBPOINTERVARBPROC.invoke(GLCore.glad_debug_glGetVertexAttribPointervARB(),
      index, pname, pointer)

  public inline fun glGetVertexAttribPointervNV(
    index: Int,
    pname: Int,
    pointer: MemorySegment,
  ): Unit =
      PFNGLGETVERTEXATTRIBPOINTERVNVPROC.invoke(GLCore.glad_debug_glGetVertexAttribPointervNV(),
      index, pname, pointer)

  public inline fun glGetVertexAttribdv(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBDVPROC.invoke(GLCore.glad_debug_glGetVertexAttribdv(), index, pname,
      params)

  public inline fun glGetVertexAttribdvARB(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBDVARBPROC.invoke(GLCore.glad_debug_glGetVertexAttribdvARB(), index,
      pname, params)

  public inline fun glGetVertexAttribdvNV(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBDVNVPROC.invoke(GLCore.glad_debug_glGetVertexAttribdvNV(), index,
      pname, params)

  public inline fun glGetVertexAttribfv(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBFVPROC.invoke(GLCore.glad_debug_glGetVertexAttribfv(), index, pname,
      params)

  public inline fun glGetVertexAttribfvARB(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBFVARBPROC.invoke(GLCore.glad_debug_glGetVertexAttribfvARB(), index,
      pname, params)

  public inline fun glGetVertexAttribfvNV(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBFVNVPROC.invoke(GLCore.glad_debug_glGetVertexAttribfvNV(), index,
      pname, params)

  public inline fun glGetVertexAttribiv(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBIVPROC.invoke(GLCore.glad_debug_glGetVertexAttribiv(), index, pname,
      params)

  public inline fun glGetVertexAttribivARB(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBIVARBPROC.invoke(GLCore.glad_debug_glGetVertexAttribivARB(), index,
      pname, params)

  public inline fun glGetVertexAttribivNV(
    index: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETVERTEXATTRIBIVNVPROC.invoke(GLCore.glad_debug_glGetVertexAttribivNV(), index,
      pname, params)

  public inline fun glGetnColorTable(
    target: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    table: MemorySegment,
  ): Unit = PFNGLGETNCOLORTABLEPROC.invoke(GLCore.glad_debug_glGetnColorTable(), target, format,
      type, bufSize, table)

  public inline fun glGetnColorTableARB(
    target: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    table: MemorySegment,
  ): Unit = PFNGLGETNCOLORTABLEARBPROC.invoke(GLCore.glad_debug_glGetnColorTableARB(), target,
      format, type, bufSize, table)

  public inline fun glGetnCompressedTexImage(
    target: Int,
    lod: Int,
    bufSize: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLGETNCOMPRESSEDTEXIMAGEPROC.invoke(GLCore.glad_debug_glGetnCompressedTexImage(),
      target, lod, bufSize, pixels)

  public inline fun glGetnCompressedTexImageARB(
    target: Int,
    lod: Int,
    bufSize: Int,
    img: MemorySegment,
  ): Unit =
      PFNGLGETNCOMPRESSEDTEXIMAGEARBPROC.invoke(GLCore.glad_debug_glGetnCompressedTexImageARB(),
      target, lod, bufSize, img)

  public inline fun glGetnConvolutionFilter(
    target: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    image: MemorySegment,
  ): Unit = PFNGLGETNCONVOLUTIONFILTERPROC.invoke(GLCore.glad_debug_glGetnConvolutionFilter(),
      target, format, type, bufSize, image)

  public inline fun glGetnConvolutionFilterARB(
    target: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    image: MemorySegment,
  ): Unit = PFNGLGETNCONVOLUTIONFILTERARBPROC.invoke(GLCore.glad_debug_glGetnConvolutionFilterARB(),
      target, format, type, bufSize, image)

  public inline fun glGetnHistogram(
    target: Int,
    reset: Byte,
    format: Int,
    type: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNHISTOGRAMPROC.invoke(GLCore.glad_debug_glGetnHistogram(), target, reset,
      format, type, bufSize, values)

  public inline fun glGetnHistogramARB(
    target: Int,
    reset: Byte,
    format: Int,
    type: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNHISTOGRAMARBPROC.invoke(GLCore.glad_debug_glGetnHistogramARB(), target, reset,
      format, type, bufSize, values)

  public inline fun glGetnMapdv(
    target: Int,
    query: Int,
    bufSize: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETNMAPDVPROC.invoke(GLCore.glad_debug_glGetnMapdv(), target, query, bufSize, v)

  public inline fun glGetnMapdvARB(
    target: Int,
    query: Int,
    bufSize: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETNMAPDVARBPROC.invoke(GLCore.glad_debug_glGetnMapdvARB(), target, query, bufSize,
      v)

  public inline fun glGetnMapfv(
    target: Int,
    query: Int,
    bufSize: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETNMAPFVPROC.invoke(GLCore.glad_debug_glGetnMapfv(), target, query, bufSize, v)

  public inline fun glGetnMapfvARB(
    target: Int,
    query: Int,
    bufSize: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETNMAPFVARBPROC.invoke(GLCore.glad_debug_glGetnMapfvARB(), target, query, bufSize,
      v)

  public inline fun glGetnMapiv(
    target: Int,
    query: Int,
    bufSize: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETNMAPIVPROC.invoke(GLCore.glad_debug_glGetnMapiv(), target, query, bufSize, v)

  public inline fun glGetnMapivARB(
    target: Int,
    query: Int,
    bufSize: Int,
    v: MemorySegment,
  ): Unit = PFNGLGETNMAPIVARBPROC.invoke(GLCore.glad_debug_glGetnMapivARB(), target, query, bufSize,
      v)

  public inline fun glGetnMinmax(
    target: Int,
    reset: Byte,
    format: Int,
    type: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNMINMAXPROC.invoke(GLCore.glad_debug_glGetnMinmax(), target, reset, format,
      type, bufSize, values)

  public inline fun glGetnMinmaxARB(
    target: Int,
    reset: Byte,
    format: Int,
    type: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNMINMAXARBPROC.invoke(GLCore.glad_debug_glGetnMinmaxARB(), target, reset,
      format, type, bufSize, values)

  public inline fun glGetnPixelMapfv(
    map: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNPIXELMAPFVPROC.invoke(GLCore.glad_debug_glGetnPixelMapfv(), map, bufSize,
      values)

  public inline fun glGetnPixelMapfvARB(
    map: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNPIXELMAPFVARBPROC.invoke(GLCore.glad_debug_glGetnPixelMapfvARB(), map, bufSize,
      values)

  public inline fun glGetnPixelMapuiv(
    map: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNPIXELMAPUIVPROC.invoke(GLCore.glad_debug_glGetnPixelMapuiv(), map, bufSize,
      values)

  public inline fun glGetnPixelMapuivARB(
    map: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNPIXELMAPUIVARBPROC.invoke(GLCore.glad_debug_glGetnPixelMapuivARB(), map,
      bufSize, values)

  public inline fun glGetnPixelMapusv(
    map: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNPIXELMAPUSVPROC.invoke(GLCore.glad_debug_glGetnPixelMapusv(), map, bufSize,
      values)

  public inline fun glGetnPixelMapusvARB(
    map: Int,
    bufSize: Int,
    values: MemorySegment,
  ): Unit = PFNGLGETNPIXELMAPUSVARBPROC.invoke(GLCore.glad_debug_glGetnPixelMapusvARB(), map,
      bufSize, values)

  public inline fun glGetnPolygonStipple(bufSize: Int, pattern: MemorySegment): Unit =
      PFNGLGETNPOLYGONSTIPPLEPROC.invoke(GLCore.glad_debug_glGetnPolygonStipple(), bufSize, pattern)

  public inline fun glGetnPolygonStippleARB(bufSize: Int, pattern: MemorySegment): Unit =
      PFNGLGETNPOLYGONSTIPPLEARBPROC.invoke(GLCore.glad_debug_glGetnPolygonStippleARB(), bufSize,
      pattern)

  public inline fun glGetnSeparableFilter(
    target: Int,
    format: Int,
    type: Int,
    rowBufSize: Int,
    row: MemorySegment,
    columnBufSize: Int,
    column: MemorySegment,
    span: MemorySegment,
  ): Unit = PFNGLGETNSEPARABLEFILTERPROC.invoke(GLCore.glad_debug_glGetnSeparableFilter(), target,
      format, type, rowBufSize, row, columnBufSize, column, span)

  public inline fun glGetnSeparableFilterARB(
    target: Int,
    format: Int,
    type: Int,
    rowBufSize: Int,
    row: MemorySegment,
    columnBufSize: Int,
    column: MemorySegment,
    span: MemorySegment,
  ): Unit = PFNGLGETNSEPARABLEFILTERARBPROC.invoke(GLCore.glad_debug_glGetnSeparableFilterARB(),
      target, format, type, rowBufSize, row, columnBufSize, column, span)

  public inline fun glGetnTexImage(
    target: Int,
    level: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLGETNTEXIMAGEPROC.invoke(GLCore.glad_debug_glGetnTexImage(), target, level, format,
      type, bufSize, pixels)

  public inline fun glGetnTexImageARB(
    target: Int,
    level: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    img: MemorySegment,
  ): Unit = PFNGLGETNTEXIMAGEARBPROC.invoke(GLCore.glad_debug_glGetnTexImageARB(), target, level,
      format, type, bufSize, img)

  public inline fun glGetnUniformdv(
    program: Int,
    location: Int,
    bufSize: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNUNIFORMDVPROC.invoke(GLCore.glad_debug_glGetnUniformdv(), program, location,
      bufSize, params)

  public inline fun glGetnUniformdvARB(
    program: Int,
    location: Int,
    bufSize: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNUNIFORMDVARBPROC.invoke(GLCore.glad_debug_glGetnUniformdvARB(), program,
      location, bufSize, params)

  public inline fun glGetnUniformfv(
    program: Int,
    location: Int,
    bufSize: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNUNIFORMFVPROC.invoke(GLCore.glad_debug_glGetnUniformfv(), program, location,
      bufSize, params)

  public inline fun glGetnUniformfvARB(
    program: Int,
    location: Int,
    bufSize: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNUNIFORMFVARBPROC.invoke(GLCore.glad_debug_glGetnUniformfvARB(), program,
      location, bufSize, params)

  public inline fun glGetnUniformiv(
    program: Int,
    location: Int,
    bufSize: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNUNIFORMIVPROC.invoke(GLCore.glad_debug_glGetnUniformiv(), program, location,
      bufSize, params)

  public inline fun glGetnUniformivARB(
    program: Int,
    location: Int,
    bufSize: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNUNIFORMIVARBPROC.invoke(GLCore.glad_debug_glGetnUniformivARB(), program,
      location, bufSize, params)

  public inline fun glGetnUniformuiv(
    program: Int,
    location: Int,
    bufSize: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNUNIFORMUIVPROC.invoke(GLCore.glad_debug_glGetnUniformuiv(), program, location,
      bufSize, params)

  public inline fun glGetnUniformuivARB(
    program: Int,
    location: Int,
    bufSize: Int,
    params: MemorySegment,
  ): Unit = PFNGLGETNUNIFORMUIVARBPROC.invoke(GLCore.glad_debug_glGetnUniformuivARB(), program,
      location, bufSize, params)

  public inline fun glHint(target: Int, mode: Int): Unit =
      PFNGLHINTPROC.invoke(GLCore.glad_debug_glHint(), target, mode)

  public inline fun glHistogram(
    target: Int,
    width: Int,
    internalformat: Int,
    sink: Byte,
  ): Unit = PFNGLHISTOGRAMPROC.invoke(GLCore.glad_debug_glHistogram(), target, width,
      internalformat, sink)

  public inline fun glIndexMask(mask: Int): Unit =
      PFNGLINDEXMASKPROC.invoke(GLCore.glad_debug_glIndexMask(), mask)

  public inline fun glIndexPointer(
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLINDEXPOINTERPROC.invoke(GLCore.glad_debug_glIndexPointer(), type, stride, pointer)

  public inline fun glIndexPointerEXT(
    type: Int,
    stride: Int,
    count: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLINDEXPOINTEREXTPROC.invoke(GLCore.glad_debug_glIndexPointerEXT(), type, stride,
      count, pointer)

  public inline fun glIndexd(c: Double): Unit = PFNGLINDEXDPROC.invoke(GLCore.glad_debug_glIndexd(),
      c)

  public inline fun glIndexdv(c: MemorySegment): Unit =
      PFNGLINDEXDVPROC.invoke(GLCore.glad_debug_glIndexdv(), c)

  public inline fun glIndexf(c: Float): Unit = PFNGLINDEXFPROC.invoke(GLCore.glad_debug_glIndexf(),
      c)

  public inline fun glIndexfv(c: MemorySegment): Unit =
      PFNGLINDEXFVPROC.invoke(GLCore.glad_debug_glIndexfv(), c)

  public inline fun glIndexi(c: Int): Unit = PFNGLINDEXIPROC.invoke(GLCore.glad_debug_glIndexi(), c)

  public inline fun glIndexiv(c: MemorySegment): Unit =
      PFNGLINDEXIVPROC.invoke(GLCore.glad_debug_glIndexiv(), c)

  public inline fun glIndexs(c: Short): Unit = PFNGLINDEXSPROC.invoke(GLCore.glad_debug_glIndexs(),
      c)

  public inline fun glIndexsv(c: MemorySegment): Unit =
      PFNGLINDEXSVPROC.invoke(GLCore.glad_debug_glIndexsv(), c)

  public inline fun glIndexub(c: Byte): Unit =
      PFNGLINDEXUBPROC.invoke(GLCore.glad_debug_glIndexub(), c)

  public inline fun glIndexubv(c: MemorySegment): Unit =
      PFNGLINDEXUBVPROC.invoke(GLCore.glad_debug_glIndexubv(), c)

  public inline fun glInitNames(): Unit = PFNGLINITNAMESPROC.invoke(GLCore.glad_debug_glInitNames(),
      )

  public inline fun glInterleavedArrays(
    format: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLINTERLEAVEDARRAYSPROC.invoke(GLCore.glad_debug_glInterleavedArrays(), format,
      stride, pointer)

  public inline fun glInvalidateBufferData(buffer: Int): Unit =
      PFNGLINVALIDATEBUFFERDATAPROC.invoke(GLCore.glad_debug_glInvalidateBufferData(), buffer)

  public inline fun glInvalidateBufferSubData(
    buffer: Int,
    offset: Long,
    length: Long,
  ): Unit = PFNGLINVALIDATEBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glInvalidateBufferSubData(),
      buffer, offset, length)

  public inline fun glInvalidateFramebuffer(
    target: Int,
    numAttachments: Int,
    attachments: MemorySegment,
  ): Unit = PFNGLINVALIDATEFRAMEBUFFERPROC.invoke(GLCore.glad_debug_glInvalidateFramebuffer(),
      target, numAttachments, attachments)

  public inline fun glInvalidateNamedFramebufferData(
    framebuffer: Int,
    numAttachments: Int,
    attachments: MemorySegment,
  ): Unit =
      PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC.invoke(GLCore.glad_debug_glInvalidateNamedFramebufferData(),
      framebuffer, numAttachments, attachments)

  public inline fun glInvalidateNamedFramebufferSubData(
    framebuffer: Int,
    numAttachments: Int,
    attachments: MemorySegment,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glInvalidateNamedFramebufferSubData(),
      framebuffer, numAttachments, attachments, x, y, width, height)

  public inline fun glInvalidateSubFramebuffer(
    target: Int,
    numAttachments: Int,
    attachments: MemorySegment,
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLINVALIDATESUBFRAMEBUFFERPROC.invoke(GLCore.glad_debug_glInvalidateSubFramebuffer(),
      target, numAttachments, attachments, x, y, width, height)

  public inline fun glInvalidateTexImage(texture: Int, level: Int): Unit =
      PFNGLINVALIDATETEXIMAGEPROC.invoke(GLCore.glad_debug_glInvalidateTexImage(), texture, level)

  public inline fun glInvalidateTexSubImage(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
  ): Unit = PFNGLINVALIDATETEXSUBIMAGEPROC.invoke(GLCore.glad_debug_glInvalidateTexSubImage(),
      texture, level, xoffset, yoffset, zoffset, width, height, depth)

  public inline fun glIsBuffer(buffer: Int): Byte =
      PFNGLISBUFFERPROC.invoke(GLCore.glad_debug_glIsBuffer(), buffer)

  public inline fun glIsBufferARB(buffer: Int): Byte =
      PFNGLISBUFFERARBPROC.invoke(GLCore.glad_debug_glIsBufferARB(), buffer)

  public inline fun glIsEnabled(cap: Int): Byte =
      PFNGLISENABLEDPROC.invoke(GLCore.glad_debug_glIsEnabled(), cap)

  public inline fun glIsEnabledIndexedEXT(target: Int, index: Int): Byte =
      PFNGLISENABLEDINDEXEDEXTPROC.invoke(GLCore.glad_debug_glIsEnabledIndexedEXT(), target, index)

  public inline fun glIsEnabledi(target: Int, index: Int): Byte =
      PFNGLISENABLEDIPROC.invoke(GLCore.glad_debug_glIsEnabledi(), target, index)

  public inline fun glIsFramebuffer(framebuffer: Int): Byte =
      PFNGLISFRAMEBUFFERPROC.invoke(GLCore.glad_debug_glIsFramebuffer(), framebuffer)

  public inline fun glIsFramebufferEXT(framebuffer: Int): Byte =
      PFNGLISFRAMEBUFFEREXTPROC.invoke(GLCore.glad_debug_glIsFramebufferEXT(), framebuffer)

  public inline fun glIsList(list: Int): Byte = PFNGLISLISTPROC.invoke(GLCore.glad_debug_glIsList(),
      list)

  public inline fun glIsProgram(program: Int): Byte =
      PFNGLISPROGRAMPROC.invoke(GLCore.glad_debug_glIsProgram(), program)

  public inline fun glIsProgramARB(program: Int): Byte =
      PFNGLISPROGRAMARBPROC.invoke(GLCore.glad_debug_glIsProgramARB(), program)

  public inline fun glIsProgramNV(id: Int): Byte =
      PFNGLISPROGRAMNVPROC.invoke(GLCore.glad_debug_glIsProgramNV(), id)

  public inline fun glIsProgramPipeline(pipeline: Int): Byte =
      PFNGLISPROGRAMPIPELINEPROC.invoke(GLCore.glad_debug_glIsProgramPipeline(), pipeline)

  public inline fun glIsQuery(id: Int): Byte =
      PFNGLISQUERYPROC.invoke(GLCore.glad_debug_glIsQuery(), id)

  public inline fun glIsQueryARB(id: Int): Byte =
      PFNGLISQUERYARBPROC.invoke(GLCore.glad_debug_glIsQueryARB(), id)

  public inline fun glIsRenderbuffer(renderbuffer: Int): Byte =
      PFNGLISRENDERBUFFERPROC.invoke(GLCore.glad_debug_glIsRenderbuffer(), renderbuffer)

  public inline fun glIsRenderbufferEXT(renderbuffer: Int): Byte =
      PFNGLISRENDERBUFFEREXTPROC.invoke(GLCore.glad_debug_glIsRenderbufferEXT(), renderbuffer)

  public inline fun glIsSampler(sampler: Int): Byte =
      PFNGLISSAMPLERPROC.invoke(GLCore.glad_debug_glIsSampler(), sampler)

  public inline fun glIsShader(shader: Int): Byte =
      PFNGLISSHADERPROC.invoke(GLCore.glad_debug_glIsShader(), shader)

  public inline fun glIsSync(sync: MemorySegment): Byte =
      PFNGLISSYNCPROC.invoke(GLCore.glad_debug_glIsSync(), sync)

  public inline fun glIsTexture(texture: Int): Byte =
      PFNGLISTEXTUREPROC.invoke(GLCore.glad_debug_glIsTexture(), texture)

  public inline fun glIsTextureEXT(texture: Int): Byte =
      PFNGLISTEXTUREEXTPROC.invoke(GLCore.glad_debug_glIsTextureEXT(), texture)

  public inline fun glIsTransformFeedback(id: Int): Byte =
      PFNGLISTRANSFORMFEEDBACKPROC.invoke(GLCore.glad_debug_glIsTransformFeedback(), id)

  public inline fun glIsTransformFeedbackNV(id: Int): Byte =
      PFNGLISTRANSFORMFEEDBACKNVPROC.invoke(GLCore.glad_debug_glIsTransformFeedbackNV(), id)

  public inline fun glIsVertexArray(array: Int): Byte =
      PFNGLISVERTEXARRAYPROC.invoke(GLCore.glad_debug_glIsVertexArray(), array)

  public inline fun glIsVertexArrayAPPLE(array: Int): Byte =
      PFNGLISVERTEXARRAYAPPLEPROC.invoke(GLCore.glad_debug_glIsVertexArrayAPPLE(), array)

  public inline fun glLightModelf(pname: Int, `param`: Float): Unit =
      PFNGLLIGHTMODELFPROC.invoke(GLCore.glad_debug_glLightModelf(), pname, param)

  public inline fun glLightModelfv(pname: Int, params: MemorySegment): Unit =
      PFNGLLIGHTMODELFVPROC.invoke(GLCore.glad_debug_glLightModelfv(), pname, params)

  public inline fun glLightModeli(pname: Int, `param`: Int): Unit =
      PFNGLLIGHTMODELIPROC.invoke(GLCore.glad_debug_glLightModeli(), pname, param)

  public inline fun glLightModeliv(pname: Int, params: MemorySegment): Unit =
      PFNGLLIGHTMODELIVPROC.invoke(GLCore.glad_debug_glLightModeliv(), pname, params)

  public inline fun glLightf(
    light: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLLIGHTFPROC.invoke(GLCore.glad_debug_glLightf(), light, pname, param)

  public inline fun glLightfv(
    light: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLLIGHTFVPROC.invoke(GLCore.glad_debug_glLightfv(), light, pname, params)

  public inline fun glLighti(
    light: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLLIGHTIPROC.invoke(GLCore.glad_debug_glLighti(), light, pname, param)

  public inline fun glLightiv(
    light: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLLIGHTIVPROC.invoke(GLCore.glad_debug_glLightiv(), light, pname, params)

  public inline fun glLineStipple(factor: Int, pattern: Short): Unit =
      PFNGLLINESTIPPLEPROC.invoke(GLCore.glad_debug_glLineStipple(), factor, pattern)

  public inline fun glLineWidth(width: Float): Unit =
      PFNGLLINEWIDTHPROC.invoke(GLCore.glad_debug_glLineWidth(), width)

  public inline fun glLinkProgram(program: Int): Unit =
      PFNGLLINKPROGRAMPROC.invoke(GLCore.glad_debug_glLinkProgram(), program)

  public inline fun glLinkProgramARB(programObj: Int): Unit =
      PFNGLLINKPROGRAMARBPROC.invoke(GLCore.glad_debug_glLinkProgramARB(), programObj)

  public inline fun glListBase(base: Int): Unit =
      PFNGLLISTBASEPROC.invoke(GLCore.glad_debug_glListBase(), base)

  public inline fun glLoadIdentity(): Unit =
      PFNGLLOADIDENTITYPROC.invoke(GLCore.glad_debug_glLoadIdentity(), )

  public inline fun glLoadMatrixd(m: MemorySegment): Unit =
      PFNGLLOADMATRIXDPROC.invoke(GLCore.glad_debug_glLoadMatrixd(), m)

  public inline fun glLoadMatrixf(m: MemorySegment): Unit =
      PFNGLLOADMATRIXFPROC.invoke(GLCore.glad_debug_glLoadMatrixf(), m)

  public inline fun glLoadName(name: Int): Unit =
      PFNGLLOADNAMEPROC.invoke(GLCore.glad_debug_glLoadName(), name)

  public inline fun glLoadProgramNV(
    target: Int,
    id: Int,
    len: Int,
    program: MemorySegment,
  ): Unit = PFNGLLOADPROGRAMNVPROC.invoke(GLCore.glad_debug_glLoadProgramNV(), target, id, len,
      program)

  public inline fun glLoadTransposeMatrixd(m: MemorySegment): Unit =
      PFNGLLOADTRANSPOSEMATRIXDPROC.invoke(GLCore.glad_debug_glLoadTransposeMatrixd(), m)

  public inline fun glLoadTransposeMatrixdARB(m: MemorySegment): Unit =
      PFNGLLOADTRANSPOSEMATRIXDARBPROC.invoke(GLCore.glad_debug_glLoadTransposeMatrixdARB(), m)

  public inline fun glLoadTransposeMatrixf(m: MemorySegment): Unit =
      PFNGLLOADTRANSPOSEMATRIXFPROC.invoke(GLCore.glad_debug_glLoadTransposeMatrixf(), m)

  public inline fun glLoadTransposeMatrixfARB(m: MemorySegment): Unit =
      PFNGLLOADTRANSPOSEMATRIXFARBPROC.invoke(GLCore.glad_debug_glLoadTransposeMatrixfARB(), m)

  public inline fun glLogicOp(opcode: Int): Unit =
      PFNGLLOGICOPPROC.invoke(GLCore.glad_debug_glLogicOp(), opcode)

  public inline fun glMap1d(
    target: Int,
    u1: Double,
    u2: Double,
    stride: Int,
    order: Int,
    points: MemorySegment,
  ): Unit = PFNGLMAP1DPROC.invoke(GLCore.glad_debug_glMap1d(), target, u1, u2, stride, order,
      points)

  public inline fun glMap1f(
    target: Int,
    u1: Float,
    u2: Float,
    stride: Int,
    order: Int,
    points: MemorySegment,
  ): Unit = PFNGLMAP1FPROC.invoke(GLCore.glad_debug_glMap1f(), target, u1, u2, stride, order,
      points)

  public inline fun glMap2d(
    target: Int,
    u1: Double,
    u2: Double,
    ustride: Int,
    uorder: Int,
    v1: Double,
    v2: Double,
    vstride: Int,
    vorder: Int,
    points: MemorySegment,
  ): Unit = PFNGLMAP2DPROC.invoke(GLCore.glad_debug_glMap2d(), target, u1, u2, ustride, uorder, v1,
      v2, vstride, vorder, points)

  public inline fun glMap2f(
    target: Int,
    u1: Float,
    u2: Float,
    ustride: Int,
    uorder: Int,
    v1: Float,
    v2: Float,
    vstride: Int,
    vorder: Int,
    points: MemorySegment,
  ): Unit = PFNGLMAP2FPROC.invoke(GLCore.glad_debug_glMap2f(), target, u1, u2, ustride, uorder, v1,
      v2, vstride, vorder, points)

  public inline fun glMapBuffer(target: Int, access: Int): MemorySegment =
      PFNGLMAPBUFFERPROC.invoke(GLCore.glad_debug_glMapBuffer(), target, access)

  public inline fun glMapBufferARB(target: Int, access: Int): MemorySegment =
      PFNGLMAPBUFFERARBPROC.invoke(GLCore.glad_debug_glMapBufferARB(), target, access)

  public inline fun glMapBufferRange(
    target: Int,
    offset: Long,
    length: Long,
    access: Int,
  ): MemorySegment = PFNGLMAPBUFFERRANGEPROC.invoke(GLCore.glad_debug_glMapBufferRange(), target,
      offset, length, access)

  public inline fun glMapGrid1d(
    un: Int,
    u1: Double,
    u2: Double,
  ): Unit = PFNGLMAPGRID1DPROC.invoke(GLCore.glad_debug_glMapGrid1d(), un, u1, u2)

  public inline fun glMapGrid1f(
    un: Int,
    u1: Float,
    u2: Float,
  ): Unit = PFNGLMAPGRID1FPROC.invoke(GLCore.glad_debug_glMapGrid1f(), un, u1, u2)

  public inline fun glMapGrid2d(
    un: Int,
    u1: Double,
    u2: Double,
    vn: Int,
    v1: Double,
    v2: Double,
  ): Unit = PFNGLMAPGRID2DPROC.invoke(GLCore.glad_debug_glMapGrid2d(), un, u1, u2, vn, v1, v2)

  public inline fun glMapGrid2f(
    un: Int,
    u1: Float,
    u2: Float,
    vn: Int,
    v1: Float,
    v2: Float,
  ): Unit = PFNGLMAPGRID2FPROC.invoke(GLCore.glad_debug_glMapGrid2f(), un, u1, u2, vn, v1, v2)

  public inline fun glMapNamedBuffer(buffer: Int, access: Int): MemorySegment =
      PFNGLMAPNAMEDBUFFERPROC.invoke(GLCore.glad_debug_glMapNamedBuffer(), buffer, access)

  public inline fun glMapNamedBufferEXT(buffer: Int, access: Int): MemorySegment =
      PFNGLMAPNAMEDBUFFEREXTPROC.invoke(GLCore.glad_debug_glMapNamedBufferEXT(), buffer, access)

  public inline fun glMapNamedBufferRange(
    buffer: Int,
    offset: Long,
    length: Long,
    access: Int,
  ): MemorySegment = PFNGLMAPNAMEDBUFFERRANGEPROC.invoke(GLCore.glad_debug_glMapNamedBufferRange(),
      buffer, offset, length, access)

  public inline fun glMapNamedBufferRangeEXT(
    buffer: Int,
    offset: Long,
    length: Long,
    access: Int,
  ): MemorySegment =
      PFNGLMAPNAMEDBUFFERRANGEEXTPROC.invoke(GLCore.glad_debug_glMapNamedBufferRangeEXT(), buffer,
      offset, length, access)

  public inline fun glMaterialf(
    face: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLMATERIALFPROC.invoke(GLCore.glad_debug_glMaterialf(), face, pname, param)

  public inline fun glMaterialfv(
    face: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMATERIALFVPROC.invoke(GLCore.glad_debug_glMaterialfv(), face, pname, params)

  public inline fun glMateriali(
    face: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLMATERIALIPROC.invoke(GLCore.glad_debug_glMateriali(), face, pname, param)

  public inline fun glMaterialiv(
    face: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMATERIALIVPROC.invoke(GLCore.glad_debug_glMaterialiv(), face, pname, params)

  public inline fun glMatrixFrustumEXT(
    mode: Int,
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    zNear: Double,
    zFar: Double,
  ): Unit = PFNGLMATRIXFRUSTUMEXTPROC.invoke(GLCore.glad_debug_glMatrixFrustumEXT(), mode, left,
      right, bottom, top, zNear, zFar)

  public inline fun glMatrixLoadIdentityEXT(mode: Int): Unit =
      PFNGLMATRIXLOADIDENTITYEXTPROC.invoke(GLCore.glad_debug_glMatrixLoadIdentityEXT(), mode)

  public inline fun glMatrixLoadTransposedEXT(mode: Int, m: MemorySegment): Unit =
      PFNGLMATRIXLOADTRANSPOSEDEXTPROC.invoke(GLCore.glad_debug_glMatrixLoadTransposedEXT(), mode,
      m)

  public inline fun glMatrixLoadTransposefEXT(mode: Int, m: MemorySegment): Unit =
      PFNGLMATRIXLOADTRANSPOSEFEXTPROC.invoke(GLCore.glad_debug_glMatrixLoadTransposefEXT(), mode,
      m)

  public inline fun glMatrixLoaddEXT(mode: Int, m: MemorySegment): Unit =
      PFNGLMATRIXLOADDEXTPROC.invoke(GLCore.glad_debug_glMatrixLoaddEXT(), mode, m)

  public inline fun glMatrixLoadfEXT(mode: Int, m: MemorySegment): Unit =
      PFNGLMATRIXLOADFEXTPROC.invoke(GLCore.glad_debug_glMatrixLoadfEXT(), mode, m)

  public inline fun glMatrixMode(mode: Int): Unit =
      PFNGLMATRIXMODEPROC.invoke(GLCore.glad_debug_glMatrixMode(), mode)

  public inline fun glMatrixMultTransposedEXT(mode: Int, m: MemorySegment): Unit =
      PFNGLMATRIXMULTTRANSPOSEDEXTPROC.invoke(GLCore.glad_debug_glMatrixMultTransposedEXT(), mode,
      m)

  public inline fun glMatrixMultTransposefEXT(mode: Int, m: MemorySegment): Unit =
      PFNGLMATRIXMULTTRANSPOSEFEXTPROC.invoke(GLCore.glad_debug_glMatrixMultTransposefEXT(), mode,
      m)

  public inline fun glMatrixMultdEXT(mode: Int, m: MemorySegment): Unit =
      PFNGLMATRIXMULTDEXTPROC.invoke(GLCore.glad_debug_glMatrixMultdEXT(), mode, m)

  public inline fun glMatrixMultfEXT(mode: Int, m: MemorySegment): Unit =
      PFNGLMATRIXMULTFEXTPROC.invoke(GLCore.glad_debug_glMatrixMultfEXT(), mode, m)

  public inline fun glMatrixOrthoEXT(
    mode: Int,
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    zNear: Double,
    zFar: Double,
  ): Unit = PFNGLMATRIXORTHOEXTPROC.invoke(GLCore.glad_debug_glMatrixOrthoEXT(), mode, left, right,
      bottom, top, zNear, zFar)

  public inline fun glMatrixPopEXT(mode: Int): Unit =
      PFNGLMATRIXPOPEXTPROC.invoke(GLCore.glad_debug_glMatrixPopEXT(), mode)

  public inline fun glMatrixPushEXT(mode: Int): Unit =
      PFNGLMATRIXPUSHEXTPROC.invoke(GLCore.glad_debug_glMatrixPushEXT(), mode)

  public inline fun glMatrixRotatedEXT(
    mode: Int,
    angle: Double,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLMATRIXROTATEDEXTPROC.invoke(GLCore.glad_debug_glMatrixRotatedEXT(), mode, angle, x,
      y, z)

  public inline fun glMatrixRotatefEXT(
    mode: Int,
    angle: Float,
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLMATRIXROTATEFEXTPROC.invoke(GLCore.glad_debug_glMatrixRotatefEXT(), mode, angle, x,
      y, z)

  public inline fun glMatrixScaledEXT(
    mode: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLMATRIXSCALEDEXTPROC.invoke(GLCore.glad_debug_glMatrixScaledEXT(), mode, x, y, z)

  public inline fun glMatrixScalefEXT(
    mode: Int,
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLMATRIXSCALEFEXTPROC.invoke(GLCore.glad_debug_glMatrixScalefEXT(), mode, x, y, z)

  public inline fun glMatrixTranslatedEXT(
    mode: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLMATRIXTRANSLATEDEXTPROC.invoke(GLCore.glad_debug_glMatrixTranslatedEXT(), mode, x,
      y, z)

  public inline fun glMatrixTranslatefEXT(
    mode: Int,
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLMATRIXTRANSLATEFEXTPROC.invoke(GLCore.glad_debug_glMatrixTranslatefEXT(), mode, x,
      y, z)

  public inline fun glMemoryBarrier(barriers: Int): Unit =
      PFNGLMEMORYBARRIERPROC.invoke(GLCore.glad_debug_glMemoryBarrier(), barriers)

  public inline fun glMemoryBarrierByRegion(barriers: Int): Unit =
      PFNGLMEMORYBARRIERBYREGIONPROC.invoke(GLCore.glad_debug_glMemoryBarrierByRegion(), barriers)

  public inline fun glMemoryBarrierEXT(barriers: Int): Unit =
      PFNGLMEMORYBARRIEREXTPROC.invoke(GLCore.glad_debug_glMemoryBarrierEXT(), barriers)

  public inline fun glMinSampleShading(`value`: Float): Unit =
      PFNGLMINSAMPLESHADINGPROC.invoke(GLCore.glad_debug_glMinSampleShading(), value)

  public inline fun glMinSampleShadingARB(`value`: Float): Unit =
      PFNGLMINSAMPLESHADINGARBPROC.invoke(GLCore.glad_debug_glMinSampleShadingARB(), value)

  public inline fun glMinmax(
    target: Int,
    internalformat: Int,
    sink: Byte,
  ): Unit = PFNGLMINMAXPROC.invoke(GLCore.glad_debug_glMinmax(), target, internalformat, sink)

  public inline fun glMultMatrixd(m: MemorySegment): Unit =
      PFNGLMULTMATRIXDPROC.invoke(GLCore.glad_debug_glMultMatrixd(), m)

  public inline fun glMultMatrixf(m: MemorySegment): Unit =
      PFNGLMULTMATRIXFPROC.invoke(GLCore.glad_debug_glMultMatrixf(), m)

  public inline fun glMultTransposeMatrixd(m: MemorySegment): Unit =
      PFNGLMULTTRANSPOSEMATRIXDPROC.invoke(GLCore.glad_debug_glMultTransposeMatrixd(), m)

  public inline fun glMultTransposeMatrixdARB(m: MemorySegment): Unit =
      PFNGLMULTTRANSPOSEMATRIXDARBPROC.invoke(GLCore.glad_debug_glMultTransposeMatrixdARB(), m)

  public inline fun glMultTransposeMatrixf(m: MemorySegment): Unit =
      PFNGLMULTTRANSPOSEMATRIXFPROC.invoke(GLCore.glad_debug_glMultTransposeMatrixf(), m)

  public inline fun glMultTransposeMatrixfARB(m: MemorySegment): Unit =
      PFNGLMULTTRANSPOSEMATRIXFARBPROC.invoke(GLCore.glad_debug_glMultTransposeMatrixfARB(), m)

  public inline fun glMultiDrawArrays(
    mode: Int,
    first: MemorySegment,
    count: MemorySegment,
    drawcount: Int,
  ): Unit = PFNGLMULTIDRAWARRAYSPROC.invoke(GLCore.glad_debug_glMultiDrawArrays(), mode, first,
      count, drawcount)

  public inline fun glMultiDrawArraysEXT(
    mode: Int,
    first: MemorySegment,
    count: MemorySegment,
    primcount: Int,
  ): Unit = PFNGLMULTIDRAWARRAYSEXTPROC.invoke(GLCore.glad_debug_glMultiDrawArraysEXT(), mode,
      first, count, primcount)

  public inline fun glMultiDrawArraysIndirect(
    mode: Int,
    indirect: MemorySegment,
    drawcount: Int,
    stride: Int,
  ): Unit = PFNGLMULTIDRAWARRAYSINDIRECTPROC.invoke(GLCore.glad_debug_glMultiDrawArraysIndirect(),
      mode, indirect, drawcount, stride)

  public inline fun glMultiDrawArraysIndirectAMD(
    mode: Int,
    indirect: MemorySegment,
    primcount: Int,
    stride: Int,
  ): Unit =
      PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC.invoke(GLCore.glad_debug_glMultiDrawArraysIndirectAMD(),
      mode, indirect, primcount, stride)

  public inline fun glMultiDrawArraysIndirectCount(
    mode: Int,
    indirect: MemorySegment,
    drawcount: Long,
    maxdrawcount: Int,
    stride: Int,
  ): Unit =
      PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC.invoke(GLCore.glad_debug_glMultiDrawArraysIndirectCount(),
      mode, indirect, drawcount, maxdrawcount, stride)

  public inline fun glMultiDrawArraysIndirectCountARB(
    mode: Int,
    indirect: MemorySegment,
    drawcount: Long,
    maxdrawcount: Int,
    stride: Int,
  ): Unit =
      PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC.invoke(GLCore.glad_debug_glMultiDrawArraysIndirectCountARB(),
      mode, indirect, drawcount, maxdrawcount, stride)

  public inline fun glMultiDrawElements(
    mode: Int,
    count: MemorySegment,
    type: Int,
    indices: MemorySegment,
    drawcount: Int,
  ): Unit = PFNGLMULTIDRAWELEMENTSPROC.invoke(GLCore.glad_debug_glMultiDrawElements(), mode, count,
      type, indices, drawcount)

  public inline fun glMultiDrawElementsBaseVertex(
    mode: Int,
    count: MemorySegment,
    type: Int,
    indices: MemorySegment,
    drawcount: Int,
    basevertex: MemorySegment,
  ): Unit =
      PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC.invoke(GLCore.glad_debug_glMultiDrawElementsBaseVertex(),
      mode, count, type, indices, drawcount, basevertex)

  public inline fun glMultiDrawElementsEXT(
    mode: Int,
    count: MemorySegment,
    type: Int,
    indices: MemorySegment,
    primcount: Int,
  ): Unit = PFNGLMULTIDRAWELEMENTSEXTPROC.invoke(GLCore.glad_debug_glMultiDrawElementsEXT(), mode,
      count, type, indices, primcount)

  public inline fun glMultiDrawElementsIndirect(
    mode: Int,
    type: Int,
    indirect: MemorySegment,
    drawcount: Int,
    stride: Int,
  ): Unit =
      PFNGLMULTIDRAWELEMENTSINDIRECTPROC.invoke(GLCore.glad_debug_glMultiDrawElementsIndirect(),
      mode, type, indirect, drawcount, stride)

  public inline fun glMultiDrawElementsIndirectAMD(
    mode: Int,
    type: Int,
    indirect: MemorySegment,
    primcount: Int,
    stride: Int,
  ): Unit =
      PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC.invoke(GLCore.glad_debug_glMultiDrawElementsIndirectAMD(),
      mode, type, indirect, primcount, stride)

  public inline fun glMultiDrawElementsIndirectCount(
    mode: Int,
    type: Int,
    indirect: MemorySegment,
    drawcount: Long,
    maxdrawcount: Int,
    stride: Int,
  ): Unit =
      PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC.invoke(GLCore.glad_debug_glMultiDrawElementsIndirectCount(),
      mode, type, indirect, drawcount, maxdrawcount, stride)

  public inline fun glMultiDrawElementsIndirectCountARB(
    mode: Int,
    type: Int,
    indirect: MemorySegment,
    drawcount: Long,
    maxdrawcount: Int,
    stride: Int,
  ): Unit =
      PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC.invoke(GLCore.glad_debug_glMultiDrawElementsIndirectCountARB(),
      mode, type, indirect, drawcount, maxdrawcount, stride)

  public inline fun glMultiTexBufferEXT(
    texunit: Int,
    target: Int,
    internalformat: Int,
    buffer: Int,
  ): Unit = PFNGLMULTITEXBUFFEREXTPROC.invoke(GLCore.glad_debug_glMultiTexBufferEXT(), texunit,
      target, internalformat, buffer)

  public inline fun glMultiTexCoord1d(target: Int, s: Double): Unit =
      PFNGLMULTITEXCOORD1DPROC.invoke(GLCore.glad_debug_glMultiTexCoord1d(), target, s)

  public inline fun glMultiTexCoord1dARB(target: Int, s: Double): Unit =
      PFNGLMULTITEXCOORD1DARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord1dARB(), target, s)

  public inline fun glMultiTexCoord1dv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD1DVPROC.invoke(GLCore.glad_debug_glMultiTexCoord1dv(), target, v)

  public inline fun glMultiTexCoord1dvARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD1DVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord1dvARB(), target, v)

  public inline fun glMultiTexCoord1f(target: Int, s: Float): Unit =
      PFNGLMULTITEXCOORD1FPROC.invoke(GLCore.glad_debug_glMultiTexCoord1f(), target, s)

  public inline fun glMultiTexCoord1fARB(target: Int, s: Float): Unit =
      PFNGLMULTITEXCOORD1FARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord1fARB(), target, s)

  public inline fun glMultiTexCoord1fv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD1FVPROC.invoke(GLCore.glad_debug_glMultiTexCoord1fv(), target, v)

  public inline fun glMultiTexCoord1fvARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD1FVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord1fvARB(), target, v)

  public inline fun glMultiTexCoord1i(target: Int, s: Int): Unit =
      PFNGLMULTITEXCOORD1IPROC.invoke(GLCore.glad_debug_glMultiTexCoord1i(), target, s)

  public inline fun glMultiTexCoord1iARB(target: Int, s: Int): Unit =
      PFNGLMULTITEXCOORD1IARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord1iARB(), target, s)

  public inline fun glMultiTexCoord1iv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD1IVPROC.invoke(GLCore.glad_debug_glMultiTexCoord1iv(), target, v)

  public inline fun glMultiTexCoord1ivARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD1IVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord1ivARB(), target, v)

  public inline fun glMultiTexCoord1s(target: Int, s: Short): Unit =
      PFNGLMULTITEXCOORD1SPROC.invoke(GLCore.glad_debug_glMultiTexCoord1s(), target, s)

  public inline fun glMultiTexCoord1sARB(target: Int, s: Short): Unit =
      PFNGLMULTITEXCOORD1SARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord1sARB(), target, s)

  public inline fun glMultiTexCoord1sv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD1SVPROC.invoke(GLCore.glad_debug_glMultiTexCoord1sv(), target, v)

  public inline fun glMultiTexCoord1svARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD1SVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord1svARB(), target, v)

  public inline fun glMultiTexCoord2d(
    target: Int,
    s: Double,
    t: Double,
  ): Unit = PFNGLMULTITEXCOORD2DPROC.invoke(GLCore.glad_debug_glMultiTexCoord2d(), target, s, t)

  public inline fun glMultiTexCoord2dARB(
    target: Int,
    s: Double,
    t: Double,
  ): Unit = PFNGLMULTITEXCOORD2DARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord2dARB(), target, s,
      t)

  public inline fun glMultiTexCoord2dv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD2DVPROC.invoke(GLCore.glad_debug_glMultiTexCoord2dv(), target, v)

  public inline fun glMultiTexCoord2dvARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD2DVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord2dvARB(), target, v)

  public inline fun glMultiTexCoord2f(
    target: Int,
    s: Float,
    t: Float,
  ): Unit = PFNGLMULTITEXCOORD2FPROC.invoke(GLCore.glad_debug_glMultiTexCoord2f(), target, s, t)

  public inline fun glMultiTexCoord2fARB(
    target: Int,
    s: Float,
    t: Float,
  ): Unit = PFNGLMULTITEXCOORD2FARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord2fARB(), target, s,
      t)

  public inline fun glMultiTexCoord2fv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD2FVPROC.invoke(GLCore.glad_debug_glMultiTexCoord2fv(), target, v)

  public inline fun glMultiTexCoord2fvARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD2FVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord2fvARB(), target, v)

  public inline fun glMultiTexCoord2i(
    target: Int,
    s: Int,
    t: Int,
  ): Unit = PFNGLMULTITEXCOORD2IPROC.invoke(GLCore.glad_debug_glMultiTexCoord2i(), target, s, t)

  public inline fun glMultiTexCoord2iARB(
    target: Int,
    s: Int,
    t: Int,
  ): Unit = PFNGLMULTITEXCOORD2IARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord2iARB(), target, s,
      t)

  public inline fun glMultiTexCoord2iv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD2IVPROC.invoke(GLCore.glad_debug_glMultiTexCoord2iv(), target, v)

  public inline fun glMultiTexCoord2ivARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD2IVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord2ivARB(), target, v)

  public inline fun glMultiTexCoord2s(
    target: Int,
    s: Short,
    t: Short,
  ): Unit = PFNGLMULTITEXCOORD2SPROC.invoke(GLCore.glad_debug_glMultiTexCoord2s(), target, s, t)

  public inline fun glMultiTexCoord2sARB(
    target: Int,
    s: Short,
    t: Short,
  ): Unit = PFNGLMULTITEXCOORD2SARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord2sARB(), target, s,
      t)

  public inline fun glMultiTexCoord2sv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD2SVPROC.invoke(GLCore.glad_debug_glMultiTexCoord2sv(), target, v)

  public inline fun glMultiTexCoord2svARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD2SVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord2svARB(), target, v)

  public inline fun glMultiTexCoord3d(
    target: Int,
    s: Double,
    t: Double,
    r: Double,
  ): Unit = PFNGLMULTITEXCOORD3DPROC.invoke(GLCore.glad_debug_glMultiTexCoord3d(), target, s, t, r)

  public inline fun glMultiTexCoord3dARB(
    target: Int,
    s: Double,
    t: Double,
    r: Double,
  ): Unit = PFNGLMULTITEXCOORD3DARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord3dARB(), target, s,
      t, r)

  public inline fun glMultiTexCoord3dv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD3DVPROC.invoke(GLCore.glad_debug_glMultiTexCoord3dv(), target, v)

  public inline fun glMultiTexCoord3dvARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD3DVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord3dvARB(), target, v)

  public inline fun glMultiTexCoord3f(
    target: Int,
    s: Float,
    t: Float,
    r: Float,
  ): Unit = PFNGLMULTITEXCOORD3FPROC.invoke(GLCore.glad_debug_glMultiTexCoord3f(), target, s, t, r)

  public inline fun glMultiTexCoord3fARB(
    target: Int,
    s: Float,
    t: Float,
    r: Float,
  ): Unit = PFNGLMULTITEXCOORD3FARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord3fARB(), target, s,
      t, r)

  public inline fun glMultiTexCoord3fv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD3FVPROC.invoke(GLCore.glad_debug_glMultiTexCoord3fv(), target, v)

  public inline fun glMultiTexCoord3fvARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD3FVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord3fvARB(), target, v)

  public inline fun glMultiTexCoord3i(
    target: Int,
    s: Int,
    t: Int,
    r: Int,
  ): Unit = PFNGLMULTITEXCOORD3IPROC.invoke(GLCore.glad_debug_glMultiTexCoord3i(), target, s, t, r)

  public inline fun glMultiTexCoord3iARB(
    target: Int,
    s: Int,
    t: Int,
    r: Int,
  ): Unit = PFNGLMULTITEXCOORD3IARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord3iARB(), target, s,
      t, r)

  public inline fun glMultiTexCoord3iv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD3IVPROC.invoke(GLCore.glad_debug_glMultiTexCoord3iv(), target, v)

  public inline fun glMultiTexCoord3ivARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD3IVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord3ivARB(), target, v)

  public inline fun glMultiTexCoord3s(
    target: Int,
    s: Short,
    t: Short,
    r: Short,
  ): Unit = PFNGLMULTITEXCOORD3SPROC.invoke(GLCore.glad_debug_glMultiTexCoord3s(), target, s, t, r)

  public inline fun glMultiTexCoord3sARB(
    target: Int,
    s: Short,
    t: Short,
    r: Short,
  ): Unit = PFNGLMULTITEXCOORD3SARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord3sARB(), target, s,
      t, r)

  public inline fun glMultiTexCoord3sv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD3SVPROC.invoke(GLCore.glad_debug_glMultiTexCoord3sv(), target, v)

  public inline fun glMultiTexCoord3svARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD3SVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord3svARB(), target, v)

  public inline fun glMultiTexCoord4d(
    target: Int,
    s: Double,
    t: Double,
    r: Double,
    q: Double,
  ): Unit = PFNGLMULTITEXCOORD4DPROC.invoke(GLCore.glad_debug_glMultiTexCoord4d(), target, s, t, r,
      q)

  public inline fun glMultiTexCoord4dARB(
    target: Int,
    s: Double,
    t: Double,
    r: Double,
    q: Double,
  ): Unit = PFNGLMULTITEXCOORD4DARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord4dARB(), target, s,
      t, r, q)

  public inline fun glMultiTexCoord4dv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD4DVPROC.invoke(GLCore.glad_debug_glMultiTexCoord4dv(), target, v)

  public inline fun glMultiTexCoord4dvARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD4DVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord4dvARB(), target, v)

  public inline fun glMultiTexCoord4f(
    target: Int,
    s: Float,
    t: Float,
    r: Float,
    q: Float,
  ): Unit = PFNGLMULTITEXCOORD4FPROC.invoke(GLCore.glad_debug_glMultiTexCoord4f(), target, s, t, r,
      q)

  public inline fun glMultiTexCoord4fARB(
    target: Int,
    s: Float,
    t: Float,
    r: Float,
    q: Float,
  ): Unit = PFNGLMULTITEXCOORD4FARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord4fARB(), target, s,
      t, r, q)

  public inline fun glMultiTexCoord4fv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD4FVPROC.invoke(GLCore.glad_debug_glMultiTexCoord4fv(), target, v)

  public inline fun glMultiTexCoord4fvARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD4FVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord4fvARB(), target, v)

  public inline fun glMultiTexCoord4i(
    target: Int,
    s: Int,
    t: Int,
    r: Int,
    q: Int,
  ): Unit = PFNGLMULTITEXCOORD4IPROC.invoke(GLCore.glad_debug_glMultiTexCoord4i(), target, s, t, r,
      q)

  public inline fun glMultiTexCoord4iARB(
    target: Int,
    s: Int,
    t: Int,
    r: Int,
    q: Int,
  ): Unit = PFNGLMULTITEXCOORD4IARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord4iARB(), target, s,
      t, r, q)

  public inline fun glMultiTexCoord4iv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD4IVPROC.invoke(GLCore.glad_debug_glMultiTexCoord4iv(), target, v)

  public inline fun glMultiTexCoord4ivARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD4IVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord4ivARB(), target, v)

  public inline fun glMultiTexCoord4s(
    target: Int,
    s: Short,
    t: Short,
    r: Short,
    q: Short,
  ): Unit = PFNGLMULTITEXCOORD4SPROC.invoke(GLCore.glad_debug_glMultiTexCoord4s(), target, s, t, r,
      q)

  public inline fun glMultiTexCoord4sARB(
    target: Int,
    s: Short,
    t: Short,
    r: Short,
    q: Short,
  ): Unit = PFNGLMULTITEXCOORD4SARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord4sARB(), target, s,
      t, r, q)

  public inline fun glMultiTexCoord4sv(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD4SVPROC.invoke(GLCore.glad_debug_glMultiTexCoord4sv(), target, v)

  public inline fun glMultiTexCoord4svARB(target: Int, v: MemorySegment): Unit =
      PFNGLMULTITEXCOORD4SVARBPROC.invoke(GLCore.glad_debug_glMultiTexCoord4svARB(), target, v)

  public inline fun glMultiTexCoordP1ui(
    texture: Int,
    type: Int,
    coords: Int,
  ): Unit = PFNGLMULTITEXCOORDP1UIPROC.invoke(GLCore.glad_debug_glMultiTexCoordP1ui(), texture,
      type, coords)

  public inline fun glMultiTexCoordP1uiv(
    texture: Int,
    type: Int,
    coords: MemorySegment,
  ): Unit = PFNGLMULTITEXCOORDP1UIVPROC.invoke(GLCore.glad_debug_glMultiTexCoordP1uiv(), texture,
      type, coords)

  public inline fun glMultiTexCoordP2ui(
    texture: Int,
    type: Int,
    coords: Int,
  ): Unit = PFNGLMULTITEXCOORDP2UIPROC.invoke(GLCore.glad_debug_glMultiTexCoordP2ui(), texture,
      type, coords)

  public inline fun glMultiTexCoordP2uiv(
    texture: Int,
    type: Int,
    coords: MemorySegment,
  ): Unit = PFNGLMULTITEXCOORDP2UIVPROC.invoke(GLCore.glad_debug_glMultiTexCoordP2uiv(), texture,
      type, coords)

  public inline fun glMultiTexCoordP3ui(
    texture: Int,
    type: Int,
    coords: Int,
  ): Unit = PFNGLMULTITEXCOORDP3UIPROC.invoke(GLCore.glad_debug_glMultiTexCoordP3ui(), texture,
      type, coords)

  public inline fun glMultiTexCoordP3uiv(
    texture: Int,
    type: Int,
    coords: MemorySegment,
  ): Unit = PFNGLMULTITEXCOORDP3UIVPROC.invoke(GLCore.glad_debug_glMultiTexCoordP3uiv(), texture,
      type, coords)

  public inline fun glMultiTexCoordP4ui(
    texture: Int,
    type: Int,
    coords: Int,
  ): Unit = PFNGLMULTITEXCOORDP4UIPROC.invoke(GLCore.glad_debug_glMultiTexCoordP4ui(), texture,
      type, coords)

  public inline fun glMultiTexCoordP4uiv(
    texture: Int,
    type: Int,
    coords: MemorySegment,
  ): Unit = PFNGLMULTITEXCOORDP4UIVPROC.invoke(GLCore.glad_debug_glMultiTexCoordP4uiv(), texture,
      type, coords)

  public inline fun glMultiTexCoordPointerEXT(
    texunit: Int,
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLMULTITEXCOORDPOINTEREXTPROC.invoke(GLCore.glad_debug_glMultiTexCoordPointerEXT(),
      texunit, size, type, stride, pointer)

  public inline fun glMultiTexEnvfEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLMULTITEXENVFEXTPROC.invoke(GLCore.glad_debug_glMultiTexEnvfEXT(), texunit, target,
      pname, param)

  public inline fun glMultiTexEnvfvEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXENVFVEXTPROC.invoke(GLCore.glad_debug_glMultiTexEnvfvEXT(), texunit,
      target, pname, params)

  public inline fun glMultiTexEnviEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLMULTITEXENVIEXTPROC.invoke(GLCore.glad_debug_glMultiTexEnviEXT(), texunit, target,
      pname, param)

  public inline fun glMultiTexEnvivEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXENVIVEXTPROC.invoke(GLCore.glad_debug_glMultiTexEnvivEXT(), texunit,
      target, pname, params)

  public inline fun glMultiTexGendEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    `param`: Double,
  ): Unit = PFNGLMULTITEXGENDEXTPROC.invoke(GLCore.glad_debug_glMultiTexGendEXT(), texunit, coord,
      pname, param)

  public inline fun glMultiTexGendvEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXGENDVEXTPROC.invoke(GLCore.glad_debug_glMultiTexGendvEXT(), texunit, coord,
      pname, params)

  public inline fun glMultiTexGenfEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLMULTITEXGENFEXTPROC.invoke(GLCore.glad_debug_glMultiTexGenfEXT(), texunit, coord,
      pname, param)

  public inline fun glMultiTexGenfvEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXGENFVEXTPROC.invoke(GLCore.glad_debug_glMultiTexGenfvEXT(), texunit, coord,
      pname, params)

  public inline fun glMultiTexGeniEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLMULTITEXGENIEXTPROC.invoke(GLCore.glad_debug_glMultiTexGeniEXT(), texunit, coord,
      pname, param)

  public inline fun glMultiTexGenivEXT(
    texunit: Int,
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXGENIVEXTPROC.invoke(GLCore.glad_debug_glMultiTexGenivEXT(), texunit, coord,
      pname, params)

  public inline fun glMultiTexImage1DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLMULTITEXIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glMultiTexImage1DEXT(), texunit,
      target, level, internalformat, width, border, format, type, pixels)

  public inline fun glMultiTexImage2DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLMULTITEXIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glMultiTexImage2DEXT(), texunit,
      target, level, internalformat, width, height, border, format, type, pixels)

  public inline fun glMultiTexImage3DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLMULTITEXIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glMultiTexImage3DEXT(), texunit,
      target, level, internalformat, width, height, depth, border, format, type, pixels)

  public inline fun glMultiTexParameterIivEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXPARAMETERIIVEXTPROC.invoke(GLCore.glad_debug_glMultiTexParameterIivEXT(),
      texunit, target, pname, params)

  public inline fun glMultiTexParameterIuivEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXPARAMETERIUIVEXTPROC.invoke(GLCore.glad_debug_glMultiTexParameterIuivEXT(),
      texunit, target, pname, params)

  public inline fun glMultiTexParameterfEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLMULTITEXPARAMETERFEXTPROC.invoke(GLCore.glad_debug_glMultiTexParameterfEXT(),
      texunit, target, pname, param)

  public inline fun glMultiTexParameterfvEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXPARAMETERFVEXTPROC.invoke(GLCore.glad_debug_glMultiTexParameterfvEXT(),
      texunit, target, pname, params)

  public inline fun glMultiTexParameteriEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLMULTITEXPARAMETERIEXTPROC.invoke(GLCore.glad_debug_glMultiTexParameteriEXT(),
      texunit, target, pname, param)

  public inline fun glMultiTexParameterivEXT(
    texunit: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLMULTITEXPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glMultiTexParameterivEXT(),
      texunit, target, pname, params)

  public inline fun glMultiTexRenderbufferEXT(
    texunit: Int,
    target: Int,
    renderbuffer: Int,
  ): Unit = PFNGLMULTITEXRENDERBUFFEREXTPROC.invoke(GLCore.glad_debug_glMultiTexRenderbufferEXT(),
      texunit, target, renderbuffer)

  public inline fun glMultiTexSubImage1DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLMULTITEXSUBIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glMultiTexSubImage1DEXT(),
      texunit, target, level, xoffset, width, format, type, pixels)

  public inline fun glMultiTexSubImage2DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLMULTITEXSUBIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glMultiTexSubImage2DEXT(),
      texunit, target, level, xoffset, yoffset, width, height, format, type, pixels)

  public inline fun glMultiTexSubImage3DEXT(
    texunit: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLMULTITEXSUBIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glMultiTexSubImage3DEXT(),
      texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels)

  public inline fun glNamedBufferData(
    buffer: Int,
    size: Long,
    `data`: MemorySegment,
    usage: Int,
  ): Unit = PFNGLNAMEDBUFFERDATAPROC.invoke(GLCore.glad_debug_glNamedBufferData(), buffer, size,
      data, usage)

  public inline fun glNamedBufferDataEXT(
    buffer: Int,
    size: Long,
    `data`: MemorySegment,
    usage: Int,
  ): Unit = PFNGLNAMEDBUFFERDATAEXTPROC.invoke(GLCore.glad_debug_glNamedBufferDataEXT(), buffer,
      size, data, usage)

  public inline fun glNamedBufferStorage(
    buffer: Int,
    size: Long,
    `data`: MemorySegment,
    flags: Int,
  ): Unit = PFNGLNAMEDBUFFERSTORAGEPROC.invoke(GLCore.glad_debug_glNamedBufferStorage(), buffer,
      size, data, flags)

  public inline fun glNamedBufferStorageEXT(
    buffer: Int,
    size: Long,
    `data`: MemorySegment,
    flags: Int,
  ): Unit = PFNGLNAMEDBUFFERSTORAGEEXTPROC.invoke(GLCore.glad_debug_glNamedBufferStorageEXT(),
      buffer, size, data, flags)

  public inline fun glNamedBufferSubData(
    buffer: Int,
    offset: Long,
    size: Long,
    `data`: MemorySegment,
  ): Unit = PFNGLNAMEDBUFFERSUBDATAPROC.invoke(GLCore.glad_debug_glNamedBufferSubData(), buffer,
      offset, size, data)

  public inline fun glNamedBufferSubDataEXT(
    buffer: Int,
    offset: Long,
    size: Long,
    `data`: MemorySegment,
  ): Unit = PFNGLNAMEDBUFFERSUBDATAEXTPROC.invoke(GLCore.glad_debug_glNamedBufferSubDataEXT(),
      buffer, offset, size, data)

  public inline fun glNamedCopyBufferSubDataEXT(
    readBuffer: Int,
    writeBuffer: Int,
    readOffset: Long,
    writeOffset: Long,
    size: Long,
  ): Unit =
      PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC.invoke(GLCore.glad_debug_glNamedCopyBufferSubDataEXT(),
      readBuffer, writeBuffer, readOffset, writeOffset, size)

  public inline fun glNamedFramebufferDrawBuffer(framebuffer: Int, buf: Int): Unit =
      PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC.invoke(GLCore.glad_debug_glNamedFramebufferDrawBuffer(),
      framebuffer, buf)

  public inline fun glNamedFramebufferDrawBuffers(
    framebuffer: Int,
    n: Int,
    bufs: MemorySegment,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC.invoke(GLCore.glad_debug_glNamedFramebufferDrawBuffers(),
      framebuffer, n, bufs)

  public inline fun glNamedFramebufferParameteri(
    framebuffer: Int,
    pname: Int,
    `param`: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC.invoke(GLCore.glad_debug_glNamedFramebufferParameteri(),
      framebuffer, pname, param)

  public inline fun glNamedFramebufferParameteriEXT(
    framebuffer: Int,
    pname: Int,
    `param`: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC.invoke(GLCore.glad_debug_glNamedFramebufferParameteriEXT(),
      framebuffer, pname, param)

  public inline fun glNamedFramebufferReadBuffer(framebuffer: Int, src: Int): Unit =
      PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC.invoke(GLCore.glad_debug_glNamedFramebufferReadBuffer(),
      framebuffer, src)

  public inline fun glNamedFramebufferRenderbuffer(
    framebuffer: Int,
    attachment: Int,
    renderbuffertarget: Int,
    renderbuffer: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC.invoke(GLCore.glad_debug_glNamedFramebufferRenderbuffer(),
      framebuffer, attachment, renderbuffertarget, renderbuffer)

  public inline fun glNamedFramebufferRenderbufferEXT(
    framebuffer: Int,
    attachment: Int,
    renderbuffertarget: Int,
    renderbuffer: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC.invoke(GLCore.glad_debug_glNamedFramebufferRenderbufferEXT(),
      framebuffer, attachment, renderbuffertarget, renderbuffer)

  public inline fun glNamedFramebufferTexture(
    framebuffer: Int,
    attachment: Int,
    texture: Int,
    level: Int,
  ): Unit = PFNGLNAMEDFRAMEBUFFERTEXTUREPROC.invoke(GLCore.glad_debug_glNamedFramebufferTexture(),
      framebuffer, attachment, texture, level)

  public inline fun glNamedFramebufferTexture1DEXT(
    framebuffer: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC.invoke(GLCore.glad_debug_glNamedFramebufferTexture1DEXT(),
      framebuffer, attachment, textarget, texture, level)

  public inline fun glNamedFramebufferTexture2DEXT(
    framebuffer: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERTEXTURE2DEXTPROC.invoke(GLCore.glad_debug_glNamedFramebufferTexture2DEXT(),
      framebuffer, attachment, textarget, texture, level)

  public inline fun glNamedFramebufferTexture3DEXT(
    framebuffer: Int,
    attachment: Int,
    textarget: Int,
    texture: Int,
    level: Int,
    zoffset: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC.invoke(GLCore.glad_debug_glNamedFramebufferTexture3DEXT(),
      framebuffer, attachment, textarget, texture, level, zoffset)

  public inline fun glNamedFramebufferTextureEXT(
    framebuffer: Int,
    attachment: Int,
    texture: Int,
    level: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC.invoke(GLCore.glad_debug_glNamedFramebufferTextureEXT(),
      framebuffer, attachment, texture, level)

  public inline fun glNamedFramebufferTextureFaceEXT(
    framebuffer: Int,
    attachment: Int,
    texture: Int,
    level: Int,
    face: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC.invoke(GLCore.glad_debug_glNamedFramebufferTextureFaceEXT(),
      framebuffer, attachment, texture, level, face)

  public inline fun glNamedFramebufferTextureLayer(
    framebuffer: Int,
    attachment: Int,
    texture: Int,
    level: Int,
    layer: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC.invoke(GLCore.glad_debug_glNamedFramebufferTextureLayer(),
      framebuffer, attachment, texture, level, layer)

  public inline fun glNamedFramebufferTextureLayerEXT(
    framebuffer: Int,
    attachment: Int,
    texture: Int,
    level: Int,
    layer: Int,
  ): Unit =
      PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC.invoke(GLCore.glad_debug_glNamedFramebufferTextureLayerEXT(),
      framebuffer, attachment, texture, level, layer)

  public inline fun glNamedProgramLocalParameter4dEXT(
    program: Int,
    target: Int,
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameter4dEXT(),
      program, target, index, x, y, z, w)

  public inline fun glNamedProgramLocalParameter4dvEXT(
    program: Int,
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameter4dvEXT(),
      program, target, index, params)

  public inline fun glNamedProgramLocalParameter4fEXT(
    program: Int,
    target: Int,
    index: Int,
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETER4FEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameter4fEXT(),
      program, target, index, x, y, z, w)

  public inline fun glNamedProgramLocalParameter4fvEXT(
    program: Int,
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameter4fvEXT(),
      program, target, index, params)

  public inline fun glNamedProgramLocalParameterI4iEXT(
    program: Int,
    target: Int,
    index: Int,
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameterI4iEXT(),
      program, target, index, x, y, z, w)

  public inline fun glNamedProgramLocalParameterI4ivEXT(
    program: Int,
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameterI4ivEXT(),
      program, target, index, params)

  public inline fun glNamedProgramLocalParameterI4uiEXT(
    program: Int,
    target: Int,
    index: Int,
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameterI4uiEXT(),
      program, target, index, x, y, z, w)

  public inline fun glNamedProgramLocalParameterI4uivEXT(
    program: Int,
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameterI4uivEXT(),
      program, target, index, params)

  public inline fun glNamedProgramLocalParameters4fvEXT(
    program: Int,
    target: Int,
    index: Int,
    count: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParameters4fvEXT(),
      program, target, index, count, params)

  public inline fun glNamedProgramLocalParametersI4ivEXT(
    program: Int,
    target: Int,
    index: Int,
    count: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParametersI4ivEXT(),
      program, target, index, count, params)

  public inline fun glNamedProgramLocalParametersI4uivEXT(
    program: Int,
    target: Int,
    index: Int,
    count: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC.invoke(GLCore.glad_debug_glNamedProgramLocalParametersI4uivEXT(),
      program, target, index, count, params)

  public inline fun glNamedProgramStringEXT(
    program: Int,
    target: Int,
    format: Int,
    len: Int,
    string: MemorySegment,
  ): Unit = PFNGLNAMEDPROGRAMSTRINGEXTPROC.invoke(GLCore.glad_debug_glNamedProgramStringEXT(),
      program, target, format, len, string)

  public inline fun glNamedRenderbufferStorage(
    renderbuffer: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLNAMEDRENDERBUFFERSTORAGEPROC.invoke(GLCore.glad_debug_glNamedRenderbufferStorage(),
      renderbuffer, internalformat, width, height)

  public inline fun glNamedRenderbufferStorageEXT(
    renderbuffer: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLNAMEDRENDERBUFFERSTORAGEEXTPROC.invoke(GLCore.glad_debug_glNamedRenderbufferStorageEXT(),
      renderbuffer, internalformat, width, height)

  public inline fun glNamedRenderbufferStorageMultisample(
    renderbuffer: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC.invoke(GLCore.glad_debug_glNamedRenderbufferStorageMultisample(),
      renderbuffer, samples, internalformat, width, height)

  public inline fun glNamedRenderbufferStorageMultisampleCoverageEXT(
    renderbuffer: Int,
    coverageSamples: Int,
    colorSamples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROC.invoke(GLCore.glad_debug_glNamedRenderbufferStorageMultisampleCoverageEXT(),
      renderbuffer, coverageSamples, colorSamples, internalformat, width, height)

  public inline fun glNamedRenderbufferStorageMultisampleEXT(
    renderbuffer: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC.invoke(GLCore.glad_debug_glNamedRenderbufferStorageMultisampleEXT(),
      renderbuffer, samples, internalformat, width, height)

  public inline fun glNewList(list: Int, mode: Int): Unit =
      PFNGLNEWLISTPROC.invoke(GLCore.glad_debug_glNewList(), list, mode)

  public inline fun glNormal3b(
    nx: Byte,
    ny: Byte,
    nz: Byte,
  ): Unit = PFNGLNORMAL3BPROC.invoke(GLCore.glad_debug_glNormal3b(), nx, ny, nz)

  public inline fun glNormal3bv(v: MemorySegment): Unit =
      PFNGLNORMAL3BVPROC.invoke(GLCore.glad_debug_glNormal3bv(), v)

  public inline fun glNormal3d(
    nx: Double,
    ny: Double,
    nz: Double,
  ): Unit = PFNGLNORMAL3DPROC.invoke(GLCore.glad_debug_glNormal3d(), nx, ny, nz)

  public inline fun glNormal3dv(v: MemorySegment): Unit =
      PFNGLNORMAL3DVPROC.invoke(GLCore.glad_debug_glNormal3dv(), v)

  public inline fun glNormal3f(
    nx: Float,
    ny: Float,
    nz: Float,
  ): Unit = PFNGLNORMAL3FPROC.invoke(GLCore.glad_debug_glNormal3f(), nx, ny, nz)

  public inline fun glNormal3fv(v: MemorySegment): Unit =
      PFNGLNORMAL3FVPROC.invoke(GLCore.glad_debug_glNormal3fv(), v)

  public inline fun glNormal3i(
    nx: Int,
    ny: Int,
    nz: Int,
  ): Unit = PFNGLNORMAL3IPROC.invoke(GLCore.glad_debug_glNormal3i(), nx, ny, nz)

  public inline fun glNormal3iv(v: MemorySegment): Unit =
      PFNGLNORMAL3IVPROC.invoke(GLCore.glad_debug_glNormal3iv(), v)

  public inline fun glNormal3s(
    nx: Short,
    ny: Short,
    nz: Short,
  ): Unit = PFNGLNORMAL3SPROC.invoke(GLCore.glad_debug_glNormal3s(), nx, ny, nz)

  public inline fun glNormal3sv(v: MemorySegment): Unit =
      PFNGLNORMAL3SVPROC.invoke(GLCore.glad_debug_glNormal3sv(), v)

  public inline fun glNormalP3ui(type: Int, coords: Int): Unit =
      PFNGLNORMALP3UIPROC.invoke(GLCore.glad_debug_glNormalP3ui(), type, coords)

  public inline fun glNormalP3uiv(type: Int, coords: MemorySegment): Unit =
      PFNGLNORMALP3UIVPROC.invoke(GLCore.glad_debug_glNormalP3uiv(), type, coords)

  public inline fun glNormalPointer(
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLNORMALPOINTERPROC.invoke(GLCore.glad_debug_glNormalPointer(), type, stride,
      pointer)

  public inline fun glNormalPointerEXT(
    type: Int,
    stride: Int,
    count: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLNORMALPOINTEREXTPROC.invoke(GLCore.glad_debug_glNormalPointerEXT(), type, stride,
      count, pointer)

  public inline fun glObjectLabel(
    identifier: Int,
    name: Int,
    length: Int,
    label: MemorySegment,
  ): Unit = PFNGLOBJECTLABELPROC.invoke(GLCore.glad_debug_glObjectLabel(), identifier, name, length,
      label)

  public inline fun glObjectPtrLabel(
    ptr: MemorySegment,
    length: Int,
    label: MemorySegment,
  ): Unit = PFNGLOBJECTPTRLABELPROC.invoke(GLCore.glad_debug_glObjectPtrLabel(), ptr, length, label)

  public inline fun glOrtho(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    zNear: Double,
    zFar: Double,
  ): Unit = PFNGLORTHOPROC.invoke(GLCore.glad_debug_glOrtho(), left, right, bottom, top, zNear,
      zFar)

  public inline fun glOrthofOES(
    l: Float,
    r: Float,
    b: Float,
    t: Float,
    n: Float,
    f: Float,
  ): Unit = PFNGLORTHOFOESPROC.invoke(GLCore.glad_debug_glOrthofOES(), l, r, b, t, n, f)

  public inline fun glPassThrough(token: Float): Unit =
      PFNGLPASSTHROUGHPROC.invoke(GLCore.glad_debug_glPassThrough(), token)

  public inline fun glPatchParameterfv(pname: Int, values: MemorySegment): Unit =
      PFNGLPATCHPARAMETERFVPROC.invoke(GLCore.glad_debug_glPatchParameterfv(), pname, values)

  public inline fun glPatchParameteri(pname: Int, `value`: Int): Unit =
      PFNGLPATCHPARAMETERIPROC.invoke(GLCore.glad_debug_glPatchParameteri(), pname, value)

  public inline fun glPauseTransformFeedback(): Unit =
      PFNGLPAUSETRANSFORMFEEDBACKPROC.invoke(GLCore.glad_debug_glPauseTransformFeedback(), )

  public inline fun glPauseTransformFeedbackNV(): Unit =
      PFNGLPAUSETRANSFORMFEEDBACKNVPROC.invoke(GLCore.glad_debug_glPauseTransformFeedbackNV(), )

  public inline fun glPixelMapfv(
    map: Int,
    mapsize: Int,
    values: MemorySegment,
  ): Unit = PFNGLPIXELMAPFVPROC.invoke(GLCore.glad_debug_glPixelMapfv(), map, mapsize, values)

  public inline fun glPixelMapuiv(
    map: Int,
    mapsize: Int,
    values: MemorySegment,
  ): Unit = PFNGLPIXELMAPUIVPROC.invoke(GLCore.glad_debug_glPixelMapuiv(), map, mapsize, values)

  public inline fun glPixelMapusv(
    map: Int,
    mapsize: Int,
    values: MemorySegment,
  ): Unit = PFNGLPIXELMAPUSVPROC.invoke(GLCore.glad_debug_glPixelMapusv(), map, mapsize, values)

  public inline fun glPixelStoref(pname: Int, `param`: Float): Unit =
      PFNGLPIXELSTOREFPROC.invoke(GLCore.glad_debug_glPixelStoref(), pname, param)

  public inline fun glPixelStorei(pname: Int, `param`: Int): Unit =
      PFNGLPIXELSTOREIPROC.invoke(GLCore.glad_debug_glPixelStorei(), pname, param)

  public inline fun glPixelTransferf(pname: Int, `param`: Float): Unit =
      PFNGLPIXELTRANSFERFPROC.invoke(GLCore.glad_debug_glPixelTransferf(), pname, param)

  public inline fun glPixelTransferi(pname: Int, `param`: Int): Unit =
      PFNGLPIXELTRANSFERIPROC.invoke(GLCore.glad_debug_glPixelTransferi(), pname, param)

  public inline fun glPixelZoom(xfactor: Float, yfactor: Float): Unit =
      PFNGLPIXELZOOMPROC.invoke(GLCore.glad_debug_glPixelZoom(), xfactor, yfactor)

  public inline fun glPointParameterf(pname: Int, `param`: Float): Unit =
      PFNGLPOINTPARAMETERFPROC.invoke(GLCore.glad_debug_glPointParameterf(), pname, param)

  public inline fun glPointParameterfARB(pname: Int, `param`: Float): Unit =
      PFNGLPOINTPARAMETERFARBPROC.invoke(GLCore.glad_debug_glPointParameterfARB(), pname, param)

  public inline fun glPointParameterfEXT(pname: Int, `param`: Float): Unit =
      PFNGLPOINTPARAMETERFEXTPROC.invoke(GLCore.glad_debug_glPointParameterfEXT(), pname, param)

  public inline fun glPointParameterfSGIS(pname: Int, `param`: Float): Unit =
      PFNGLPOINTPARAMETERFSGISPROC.invoke(GLCore.glad_debug_glPointParameterfSGIS(), pname, param)

  public inline fun glPointParameterfv(pname: Int, params: MemorySegment): Unit =
      PFNGLPOINTPARAMETERFVPROC.invoke(GLCore.glad_debug_glPointParameterfv(), pname, params)

  public inline fun glPointParameterfvARB(pname: Int, params: MemorySegment): Unit =
      PFNGLPOINTPARAMETERFVARBPROC.invoke(GLCore.glad_debug_glPointParameterfvARB(), pname, params)

  public inline fun glPointParameterfvEXT(pname: Int, params: MemorySegment): Unit =
      PFNGLPOINTPARAMETERFVEXTPROC.invoke(GLCore.glad_debug_glPointParameterfvEXT(), pname, params)

  public inline fun glPointParameterfvSGIS(pname: Int, params: MemorySegment): Unit =
      PFNGLPOINTPARAMETERFVSGISPROC.invoke(GLCore.glad_debug_glPointParameterfvSGIS(), pname,
      params)

  public inline fun glPointParameteri(pname: Int, `param`: Int): Unit =
      PFNGLPOINTPARAMETERIPROC.invoke(GLCore.glad_debug_glPointParameteri(), pname, param)

  public inline fun glPointParameteriNV(pname: Int, `param`: Int): Unit =
      PFNGLPOINTPARAMETERINVPROC.invoke(GLCore.glad_debug_glPointParameteriNV(), pname, param)

  public inline fun glPointParameteriv(pname: Int, params: MemorySegment): Unit =
      PFNGLPOINTPARAMETERIVPROC.invoke(GLCore.glad_debug_glPointParameteriv(), pname, params)

  public inline fun glPointParameterivNV(pname: Int, params: MemorySegment): Unit =
      PFNGLPOINTPARAMETERIVNVPROC.invoke(GLCore.glad_debug_glPointParameterivNV(), pname, params)

  public inline fun glPointSize(size: Float): Unit =
      PFNGLPOINTSIZEPROC.invoke(GLCore.glad_debug_glPointSize(), size)

  public inline fun glPolygonMode(face: Int, mode: Int): Unit =
      PFNGLPOLYGONMODEPROC.invoke(GLCore.glad_debug_glPolygonMode(), face, mode)

  public inline fun glPolygonOffset(factor: Float, units: Float): Unit =
      PFNGLPOLYGONOFFSETPROC.invoke(GLCore.glad_debug_glPolygonOffset(), factor, units)

  public inline fun glPolygonOffsetClamp(
    factor: Float,
    units: Float,
    clamp: Float,
  ): Unit = PFNGLPOLYGONOFFSETCLAMPPROC.invoke(GLCore.glad_debug_glPolygonOffsetClamp(), factor,
      units, clamp)

  public inline fun glPolygonOffsetClampEXT(
    factor: Float,
    units: Float,
    clamp: Float,
  ): Unit = PFNGLPOLYGONOFFSETCLAMPEXTPROC.invoke(GLCore.glad_debug_glPolygonOffsetClampEXT(),
      factor, units, clamp)

  public inline fun glPolygonStipple(mask: MemorySegment): Unit =
      PFNGLPOLYGONSTIPPLEPROC.invoke(GLCore.glad_debug_glPolygonStipple(), mask)

  public inline fun glPopAttrib(): Unit = PFNGLPOPATTRIBPROC.invoke(GLCore.glad_debug_glPopAttrib(),
      )

  public inline fun glPopClientAttrib(): Unit =
      PFNGLPOPCLIENTATTRIBPROC.invoke(GLCore.glad_debug_glPopClientAttrib(), )

  public inline fun glPopDebugGroup(): Unit =
      PFNGLPOPDEBUGGROUPPROC.invoke(GLCore.glad_debug_glPopDebugGroup(), )

  public inline fun glPopMatrix(): Unit = PFNGLPOPMATRIXPROC.invoke(GLCore.glad_debug_glPopMatrix(),
      )

  public inline fun glPopName(): Unit = PFNGLPOPNAMEPROC.invoke(GLCore.glad_debug_glPopName(), )

  public inline fun glPrimitiveRestartIndex(index: Int): Unit =
      PFNGLPRIMITIVERESTARTINDEXPROC.invoke(GLCore.glad_debug_glPrimitiveRestartIndex(), index)

  public inline fun glPrioritizeTextures(
    n: Int,
    textures: MemorySegment,
    priorities: MemorySegment,
  ): Unit = PFNGLPRIORITIZETEXTURESPROC.invoke(GLCore.glad_debug_glPrioritizeTextures(), n,
      textures, priorities)

  public inline fun glPrioritizeTexturesEXT(
    n: Int,
    textures: MemorySegment,
    priorities: MemorySegment,
  ): Unit = PFNGLPRIORITIZETEXTURESEXTPROC.invoke(GLCore.glad_debug_glPrioritizeTexturesEXT(), n,
      textures, priorities)

  public inline fun glProgramBinary(
    program: Int,
    binaryFormat: Int,
    binary: MemorySegment,
    length: Int,
  ): Unit = PFNGLPROGRAMBINARYPROC.invoke(GLCore.glad_debug_glProgramBinary(), program,
      binaryFormat, binary, length)

  public inline fun glProgramEnvParameter4dARB(
    target: Int,
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLPROGRAMENVPARAMETER4DARBPROC.invoke(GLCore.glad_debug_glProgramEnvParameter4dARB(),
      target, index, x, y, z, w)

  public inline fun glProgramEnvParameter4dvARB(
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLPROGRAMENVPARAMETER4DVARBPROC.invoke(GLCore.glad_debug_glProgramEnvParameter4dvARB(),
      target, index, params)

  public inline fun glProgramEnvParameter4fARB(
    target: Int,
    index: Int,
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit = PFNGLPROGRAMENVPARAMETER4FARBPROC.invoke(GLCore.glad_debug_glProgramEnvParameter4fARB(),
      target, index, x, y, z, w)

  public inline fun glProgramEnvParameter4fvARB(
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLPROGRAMENVPARAMETER4FVARBPROC.invoke(GLCore.glad_debug_glProgramEnvParameter4fvARB(),
      target, index, params)

  public inline fun glProgramLocalParameter4dARB(
    target: Int,
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit =
      PFNGLPROGRAMLOCALPARAMETER4DARBPROC.invoke(GLCore.glad_debug_glProgramLocalParameter4dARB(),
      target, index, x, y, z, w)

  public inline fun glProgramLocalParameter4dvARB(
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLPROGRAMLOCALPARAMETER4DVARBPROC.invoke(GLCore.glad_debug_glProgramLocalParameter4dvARB(),
      target, index, params)

  public inline fun glProgramLocalParameter4fARB(
    target: Int,
    index: Int,
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit =
      PFNGLPROGRAMLOCALPARAMETER4FARBPROC.invoke(GLCore.glad_debug_glProgramLocalParameter4fARB(),
      target, index, x, y, z, w)

  public inline fun glProgramLocalParameter4fvARB(
    target: Int,
    index: Int,
    params: MemorySegment,
  ): Unit =
      PFNGLPROGRAMLOCALPARAMETER4FVARBPROC.invoke(GLCore.glad_debug_glProgramLocalParameter4fvARB(),
      target, index, params)

  public inline fun glProgramParameter4dNV(
    target: Int,
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLPROGRAMPARAMETER4DNVPROC.invoke(GLCore.glad_debug_glProgramParameter4dNV(), target,
      index, x, y, z, w)

  public inline fun glProgramParameter4dvNV(
    target: Int,
    index: Int,
    v: MemorySegment,
  ): Unit = PFNGLPROGRAMPARAMETER4DVNVPROC.invoke(GLCore.glad_debug_glProgramParameter4dvNV(),
      target, index, v)

  public inline fun glProgramParameter4fNV(
    target: Int,
    index: Int,
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit = PFNGLPROGRAMPARAMETER4FNVPROC.invoke(GLCore.glad_debug_glProgramParameter4fNV(), target,
      index, x, y, z, w)

  public inline fun glProgramParameter4fvNV(
    target: Int,
    index: Int,
    v: MemorySegment,
  ): Unit = PFNGLPROGRAMPARAMETER4FVNVPROC.invoke(GLCore.glad_debug_glProgramParameter4fvNV(),
      target, index, v)

  public inline fun glProgramParameteri(
    program: Int,
    pname: Int,
    `value`: Int,
  ): Unit = PFNGLPROGRAMPARAMETERIPROC.invoke(GLCore.glad_debug_glProgramParameteri(), program,
      pname, value)

  public inline fun glProgramParameteriARB(
    program: Int,
    pname: Int,
    `value`: Int,
  ): Unit = PFNGLPROGRAMPARAMETERIARBPROC.invoke(GLCore.glad_debug_glProgramParameteriARB(),
      program, pname, value)

  public inline fun glProgramParameteriEXT(
    program: Int,
    pname: Int,
    `value`: Int,
  ): Unit = PFNGLPROGRAMPARAMETERIEXTPROC.invoke(GLCore.glad_debug_glProgramParameteriEXT(),
      program, pname, value)

  public inline fun glProgramParameters4dvNV(
    target: Int,
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLPROGRAMPARAMETERS4DVNVPROC.invoke(GLCore.glad_debug_glProgramParameters4dvNV(),
      target, index, count, v)

  public inline fun glProgramParameters4fvNV(
    target: Int,
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLPROGRAMPARAMETERS4FVNVPROC.invoke(GLCore.glad_debug_glProgramParameters4fvNV(),
      target, index, count, v)

  public inline fun glProgramStringARB(
    target: Int,
    format: Int,
    len: Int,
    string: MemorySegment,
  ): Unit = PFNGLPROGRAMSTRINGARBPROC.invoke(GLCore.glad_debug_glProgramStringARB(), target, format,
      len, string)

  public inline fun glProgramUniform1d(
    program: Int,
    location: Int,
    v0: Double,
  ): Unit = PFNGLPROGRAMUNIFORM1DPROC.invoke(GLCore.glad_debug_glProgramUniform1d(), program,
      location, v0)

  public inline fun glProgramUniform1dEXT(
    program: Int,
    location: Int,
    x: Double,
  ): Unit = PFNGLPROGRAMUNIFORM1DEXTPROC.invoke(GLCore.glad_debug_glProgramUniform1dEXT(), program,
      location, x)

  public inline fun glProgramUniform1dv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM1DVPROC.invoke(GLCore.glad_debug_glProgramUniform1dv(), program,
      location, count, value)

  public inline fun glProgramUniform1dvEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM1DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform1dvEXT(),
      program, location, count, value)

  public inline fun glProgramUniform1f(
    program: Int,
    location: Int,
    v0: Float,
  ): Unit = PFNGLPROGRAMUNIFORM1FPROC.invoke(GLCore.glad_debug_glProgramUniform1f(), program,
      location, v0)

  public inline fun glProgramUniform1fEXT(
    program: Int,
    location: Int,
    v0: Float,
  ): Unit = PFNGLPROGRAMUNIFORM1FEXTPROC.invoke(GLCore.glad_debug_glProgramUniform1fEXT(), program,
      location, v0)

  public inline fun glProgramUniform1fv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM1FVPROC.invoke(GLCore.glad_debug_glProgramUniform1fv(), program,
      location, count, value)

  public inline fun glProgramUniform1fvEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM1FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform1fvEXT(),
      program, location, count, value)

  public inline fun glProgramUniform1i(
    program: Int,
    location: Int,
    v0: Int,
  ): Unit = PFNGLPROGRAMUNIFORM1IPROC.invoke(GLCore.glad_debug_glProgramUniform1i(), program,
      location, v0)

  public inline fun glProgramUniform1iEXT(
    program: Int,
    location: Int,
    v0: Int,
  ): Unit = PFNGLPROGRAMUNIFORM1IEXTPROC.invoke(GLCore.glad_debug_glProgramUniform1iEXT(), program,
      location, v0)

  public inline fun glProgramUniform1iv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM1IVPROC.invoke(GLCore.glad_debug_glProgramUniform1iv(), program,
      location, count, value)

  public inline fun glProgramUniform1ivEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM1IVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform1ivEXT(),
      program, location, count, value)

  public inline fun glProgramUniform1ui(
    program: Int,
    location: Int,
    v0: Int,
  ): Unit = PFNGLPROGRAMUNIFORM1UIPROC.invoke(GLCore.glad_debug_glProgramUniform1ui(), program,
      location, v0)

  public inline fun glProgramUniform1uiEXT(
    program: Int,
    location: Int,
    v0: Int,
  ): Unit = PFNGLPROGRAMUNIFORM1UIEXTPROC.invoke(GLCore.glad_debug_glProgramUniform1uiEXT(),
      program, location, v0)

  public inline fun glProgramUniform1uiv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM1UIVPROC.invoke(GLCore.glad_debug_glProgramUniform1uiv(), program,
      location, count, value)

  public inline fun glProgramUniform1uivEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM1UIVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform1uivEXT(),
      program, location, count, value)

  public inline fun glProgramUniform2d(
    program: Int,
    location: Int,
    v0: Double,
    v1: Double,
  ): Unit = PFNGLPROGRAMUNIFORM2DPROC.invoke(GLCore.glad_debug_glProgramUniform2d(), program,
      location, v0, v1)

  public inline fun glProgramUniform2dEXT(
    program: Int,
    location: Int,
    x: Double,
    y: Double,
  ): Unit = PFNGLPROGRAMUNIFORM2DEXTPROC.invoke(GLCore.glad_debug_glProgramUniform2dEXT(), program,
      location, x, y)

  public inline fun glProgramUniform2dv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM2DVPROC.invoke(GLCore.glad_debug_glProgramUniform2dv(), program,
      location, count, value)

  public inline fun glProgramUniform2dvEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM2DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform2dvEXT(),
      program, location, count, value)

  public inline fun glProgramUniform2f(
    program: Int,
    location: Int,
    v0: Float,
    v1: Float,
  ): Unit = PFNGLPROGRAMUNIFORM2FPROC.invoke(GLCore.glad_debug_glProgramUniform2f(), program,
      location, v0, v1)

  public inline fun glProgramUniform2fEXT(
    program: Int,
    location: Int,
    v0: Float,
    v1: Float,
  ): Unit = PFNGLPROGRAMUNIFORM2FEXTPROC.invoke(GLCore.glad_debug_glProgramUniform2fEXT(), program,
      location, v0, v1)

  public inline fun glProgramUniform2fv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM2FVPROC.invoke(GLCore.glad_debug_glProgramUniform2fv(), program,
      location, count, value)

  public inline fun glProgramUniform2fvEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM2FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform2fvEXT(),
      program, location, count, value)

  public inline fun glProgramUniform2i(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
  ): Unit = PFNGLPROGRAMUNIFORM2IPROC.invoke(GLCore.glad_debug_glProgramUniform2i(), program,
      location, v0, v1)

  public inline fun glProgramUniform2iEXT(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
  ): Unit = PFNGLPROGRAMUNIFORM2IEXTPROC.invoke(GLCore.glad_debug_glProgramUniform2iEXT(), program,
      location, v0, v1)

  public inline fun glProgramUniform2iv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM2IVPROC.invoke(GLCore.glad_debug_glProgramUniform2iv(), program,
      location, count, value)

  public inline fun glProgramUniform2ivEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM2IVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform2ivEXT(),
      program, location, count, value)

  public inline fun glProgramUniform2ui(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
  ): Unit = PFNGLPROGRAMUNIFORM2UIPROC.invoke(GLCore.glad_debug_glProgramUniform2ui(), program,
      location, v0, v1)

  public inline fun glProgramUniform2uiEXT(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
  ): Unit = PFNGLPROGRAMUNIFORM2UIEXTPROC.invoke(GLCore.glad_debug_glProgramUniform2uiEXT(),
      program, location, v0, v1)

  public inline fun glProgramUniform2uiv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM2UIVPROC.invoke(GLCore.glad_debug_glProgramUniform2uiv(), program,
      location, count, value)

  public inline fun glProgramUniform2uivEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM2UIVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform2uivEXT(),
      program, location, count, value)

  public inline fun glProgramUniform3d(
    program: Int,
    location: Int,
    v0: Double,
    v1: Double,
    v2: Double,
  ): Unit = PFNGLPROGRAMUNIFORM3DPROC.invoke(GLCore.glad_debug_glProgramUniform3d(), program,
      location, v0, v1, v2)

  public inline fun glProgramUniform3dEXT(
    program: Int,
    location: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLPROGRAMUNIFORM3DEXTPROC.invoke(GLCore.glad_debug_glProgramUniform3dEXT(), program,
      location, x, y, z)

  public inline fun glProgramUniform3dv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM3DVPROC.invoke(GLCore.glad_debug_glProgramUniform3dv(), program,
      location, count, value)

  public inline fun glProgramUniform3dvEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM3DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform3dvEXT(),
      program, location, count, value)

  public inline fun glProgramUniform3f(
    program: Int,
    location: Int,
    v0: Float,
    v1: Float,
    v2: Float,
  ): Unit = PFNGLPROGRAMUNIFORM3FPROC.invoke(GLCore.glad_debug_glProgramUniform3f(), program,
      location, v0, v1, v2)

  public inline fun glProgramUniform3fEXT(
    program: Int,
    location: Int,
    v0: Float,
    v1: Float,
    v2: Float,
  ): Unit = PFNGLPROGRAMUNIFORM3FEXTPROC.invoke(GLCore.glad_debug_glProgramUniform3fEXT(), program,
      location, v0, v1, v2)

  public inline fun glProgramUniform3fv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM3FVPROC.invoke(GLCore.glad_debug_glProgramUniform3fv(), program,
      location, count, value)

  public inline fun glProgramUniform3fvEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM3FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform3fvEXT(),
      program, location, count, value)

  public inline fun glProgramUniform3i(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
  ): Unit = PFNGLPROGRAMUNIFORM3IPROC.invoke(GLCore.glad_debug_glProgramUniform3i(), program,
      location, v0, v1, v2)

  public inline fun glProgramUniform3iEXT(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
  ): Unit = PFNGLPROGRAMUNIFORM3IEXTPROC.invoke(GLCore.glad_debug_glProgramUniform3iEXT(), program,
      location, v0, v1, v2)

  public inline fun glProgramUniform3iv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM3IVPROC.invoke(GLCore.glad_debug_glProgramUniform3iv(), program,
      location, count, value)

  public inline fun glProgramUniform3ivEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM3IVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform3ivEXT(),
      program, location, count, value)

  public inline fun glProgramUniform3ui(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
  ): Unit = PFNGLPROGRAMUNIFORM3UIPROC.invoke(GLCore.glad_debug_glProgramUniform3ui(), program,
      location, v0, v1, v2)

  public inline fun glProgramUniform3uiEXT(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
  ): Unit = PFNGLPROGRAMUNIFORM3UIEXTPROC.invoke(GLCore.glad_debug_glProgramUniform3uiEXT(),
      program, location, v0, v1, v2)

  public inline fun glProgramUniform3uiv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM3UIVPROC.invoke(GLCore.glad_debug_glProgramUniform3uiv(), program,
      location, count, value)

  public inline fun glProgramUniform3uivEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM3UIVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform3uivEXT(),
      program, location, count, value)

  public inline fun glProgramUniform4d(
    program: Int,
    location: Int,
    v0: Double,
    v1: Double,
    v2: Double,
    v3: Double,
  ): Unit = PFNGLPROGRAMUNIFORM4DPROC.invoke(GLCore.glad_debug_glProgramUniform4d(), program,
      location, v0, v1, v2, v3)

  public inline fun glProgramUniform4dEXT(
    program: Int,
    location: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLPROGRAMUNIFORM4DEXTPROC.invoke(GLCore.glad_debug_glProgramUniform4dEXT(), program,
      location, x, y, z, w)

  public inline fun glProgramUniform4dv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM4DVPROC.invoke(GLCore.glad_debug_glProgramUniform4dv(), program,
      location, count, value)

  public inline fun glProgramUniform4dvEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM4DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform4dvEXT(),
      program, location, count, value)

  public inline fun glProgramUniform4f(
    program: Int,
    location: Int,
    v0: Float,
    v1: Float,
    v2: Float,
    v3: Float,
  ): Unit = PFNGLPROGRAMUNIFORM4FPROC.invoke(GLCore.glad_debug_glProgramUniform4f(), program,
      location, v0, v1, v2, v3)

  public inline fun glProgramUniform4fEXT(
    program: Int,
    location: Int,
    v0: Float,
    v1: Float,
    v2: Float,
    v3: Float,
  ): Unit = PFNGLPROGRAMUNIFORM4FEXTPROC.invoke(GLCore.glad_debug_glProgramUniform4fEXT(), program,
      location, v0, v1, v2, v3)

  public inline fun glProgramUniform4fv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM4FVPROC.invoke(GLCore.glad_debug_glProgramUniform4fv(), program,
      location, count, value)

  public inline fun glProgramUniform4fvEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM4FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform4fvEXT(),
      program, location, count, value)

  public inline fun glProgramUniform4i(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
  ): Unit = PFNGLPROGRAMUNIFORM4IPROC.invoke(GLCore.glad_debug_glProgramUniform4i(), program,
      location, v0, v1, v2, v3)

  public inline fun glProgramUniform4iEXT(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
  ): Unit = PFNGLPROGRAMUNIFORM4IEXTPROC.invoke(GLCore.glad_debug_glProgramUniform4iEXT(), program,
      location, v0, v1, v2, v3)

  public inline fun glProgramUniform4iv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM4IVPROC.invoke(GLCore.glad_debug_glProgramUniform4iv(), program,
      location, count, value)

  public inline fun glProgramUniform4ivEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM4IVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform4ivEXT(),
      program, location, count, value)

  public inline fun glProgramUniform4ui(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
  ): Unit = PFNGLPROGRAMUNIFORM4UIPROC.invoke(GLCore.glad_debug_glProgramUniform4ui(), program,
      location, v0, v1, v2, v3)

  public inline fun glProgramUniform4uiEXT(
    program: Int,
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
  ): Unit = PFNGLPROGRAMUNIFORM4UIEXTPROC.invoke(GLCore.glad_debug_glProgramUniform4uiEXT(),
      program, location, v0, v1, v2, v3)

  public inline fun glProgramUniform4uiv(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM4UIVPROC.invoke(GLCore.glad_debug_glProgramUniform4uiv(), program,
      location, count, value)

  public inline fun glProgramUniform4uivEXT(
    program: Int,
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORM4UIVEXTPROC.invoke(GLCore.glad_debug_glProgramUniform4uivEXT(),
      program, location, count, value)

  public inline fun glProgramUniformMatrix2dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORMMATRIX2DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORMMATRIX2FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2x3dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2x3dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2x3dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2X3DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2x3dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2x3fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2x3fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2x3fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2X3FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2x3fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2x4dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2x4dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2x4dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2x4dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2x4fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2x4fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix2x4fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX2X4FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix2x4fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORMMATRIX3DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORMMATRIX3FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3x2dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3x2dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3x2dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3X2DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3x2dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3x2fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3x2fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3x2fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3X2FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3x2fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3x4dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3x4dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3x4dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3X4DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3x4dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3x4fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3x4fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix3x4fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix3x4fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORMMATRIX4DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLPROGRAMUNIFORMMATRIX4FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4x2dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4x2dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4x2dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4X2DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4x2dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4x2fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4x2fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4x2fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4X2FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4x2fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4x3dv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4x3dv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4x3dvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4X3DVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4x3dvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4x3fv(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4x3fv(),
      program, location, count, transpose, value)

  public inline fun glProgramUniformMatrix4x3fvEXT(
    program: Int,
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit =
      PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC.invoke(GLCore.glad_debug_glProgramUniformMatrix4x3fvEXT(),
      program, location, count, transpose, value)

  public inline fun glProgramVertexLimitNV(target: Int, limit: Int): Unit =
      PFNGLPROGRAMVERTEXLIMITNVPROC.invoke(GLCore.glad_debug_glProgramVertexLimitNV(), target,
      limit)

  public inline fun glProvokingVertex(mode: Int): Unit =
      PFNGLPROVOKINGVERTEXPROC.invoke(GLCore.glad_debug_glProvokingVertex(), mode)

  public inline fun glProvokingVertexEXT(mode: Int): Unit =
      PFNGLPROVOKINGVERTEXEXTPROC.invoke(GLCore.glad_debug_glProvokingVertexEXT(), mode)

  public inline fun glPushAttrib(mask: Int): Unit =
      PFNGLPUSHATTRIBPROC.invoke(GLCore.glad_debug_glPushAttrib(), mask)

  public inline fun glPushClientAttrib(mask: Int): Unit =
      PFNGLPUSHCLIENTATTRIBPROC.invoke(GLCore.glad_debug_glPushClientAttrib(), mask)

  public inline fun glPushClientAttribDefaultEXT(mask: Int): Unit =
      PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC.invoke(GLCore.glad_debug_glPushClientAttribDefaultEXT(),
      mask)

  public inline fun glPushDebugGroup(
    source: Int,
    id: Int,
    length: Int,
    message: MemorySegment,
  ): Unit = PFNGLPUSHDEBUGGROUPPROC.invoke(GLCore.glad_debug_glPushDebugGroup(), source, id, length,
      message)

  public inline fun glPushMatrix(): Unit =
      PFNGLPUSHMATRIXPROC.invoke(GLCore.glad_debug_glPushMatrix(), )

  public inline fun glPushName(name: Int): Unit =
      PFNGLPUSHNAMEPROC.invoke(GLCore.glad_debug_glPushName(), name)

  public inline fun glQueryCounter(id: Int, target: Int): Unit =
      PFNGLQUERYCOUNTERPROC.invoke(GLCore.glad_debug_glQueryCounter(), id, target)

  public inline fun glRasterPos2d(x: Double, y: Double): Unit =
      PFNGLRASTERPOS2DPROC.invoke(GLCore.glad_debug_glRasterPos2d(), x, y)

  public inline fun glRasterPos2dv(v: MemorySegment): Unit =
      PFNGLRASTERPOS2DVPROC.invoke(GLCore.glad_debug_glRasterPos2dv(), v)

  public inline fun glRasterPos2f(x: Float, y: Float): Unit =
      PFNGLRASTERPOS2FPROC.invoke(GLCore.glad_debug_glRasterPos2f(), x, y)

  public inline fun glRasterPos2fv(v: MemorySegment): Unit =
      PFNGLRASTERPOS2FVPROC.invoke(GLCore.glad_debug_glRasterPos2fv(), v)

  public inline fun glRasterPos2i(x: Int, y: Int): Unit =
      PFNGLRASTERPOS2IPROC.invoke(GLCore.glad_debug_glRasterPos2i(), x, y)

  public inline fun glRasterPos2iv(v: MemorySegment): Unit =
      PFNGLRASTERPOS2IVPROC.invoke(GLCore.glad_debug_glRasterPos2iv(), v)

  public inline fun glRasterPos2s(x: Short, y: Short): Unit =
      PFNGLRASTERPOS2SPROC.invoke(GLCore.glad_debug_glRasterPos2s(), x, y)

  public inline fun glRasterPos2sv(v: MemorySegment): Unit =
      PFNGLRASTERPOS2SVPROC.invoke(GLCore.glad_debug_glRasterPos2sv(), v)

  public inline fun glRasterPos3d(
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLRASTERPOS3DPROC.invoke(GLCore.glad_debug_glRasterPos3d(), x, y, z)

  public inline fun glRasterPos3dv(v: MemorySegment): Unit =
      PFNGLRASTERPOS3DVPROC.invoke(GLCore.glad_debug_glRasterPos3dv(), v)

  public inline fun glRasterPos3f(
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLRASTERPOS3FPROC.invoke(GLCore.glad_debug_glRasterPos3f(), x, y, z)

  public inline fun glRasterPos3fv(v: MemorySegment): Unit =
      PFNGLRASTERPOS3FVPROC.invoke(GLCore.glad_debug_glRasterPos3fv(), v)

  public inline fun glRasterPos3i(
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLRASTERPOS3IPROC.invoke(GLCore.glad_debug_glRasterPos3i(), x, y, z)

  public inline fun glRasterPos3iv(v: MemorySegment): Unit =
      PFNGLRASTERPOS3IVPROC.invoke(GLCore.glad_debug_glRasterPos3iv(), v)

  public inline fun glRasterPos3s(
    x: Short,
    y: Short,
    z: Short,
  ): Unit = PFNGLRASTERPOS3SPROC.invoke(GLCore.glad_debug_glRasterPos3s(), x, y, z)

  public inline fun glRasterPos3sv(v: MemorySegment): Unit =
      PFNGLRASTERPOS3SVPROC.invoke(GLCore.glad_debug_glRasterPos3sv(), v)

  public inline fun glRasterPos4d(
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLRASTERPOS4DPROC.invoke(GLCore.glad_debug_glRasterPos4d(), x, y, z, w)

  public inline fun glRasterPos4dv(v: MemorySegment): Unit =
      PFNGLRASTERPOS4DVPROC.invoke(GLCore.glad_debug_glRasterPos4dv(), v)

  public inline fun glRasterPos4f(
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit = PFNGLRASTERPOS4FPROC.invoke(GLCore.glad_debug_glRasterPos4f(), x, y, z, w)

  public inline fun glRasterPos4fv(v: MemorySegment): Unit =
      PFNGLRASTERPOS4FVPROC.invoke(GLCore.glad_debug_glRasterPos4fv(), v)

  public inline fun glRasterPos4i(
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit = PFNGLRASTERPOS4IPROC.invoke(GLCore.glad_debug_glRasterPos4i(), x, y, z, w)

  public inline fun glRasterPos4iv(v: MemorySegment): Unit =
      PFNGLRASTERPOS4IVPROC.invoke(GLCore.glad_debug_glRasterPos4iv(), v)

  public inline fun glRasterPos4s(
    x: Short,
    y: Short,
    z: Short,
    w: Short,
  ): Unit = PFNGLRASTERPOS4SPROC.invoke(GLCore.glad_debug_glRasterPos4s(), x, y, z, w)

  public inline fun glRasterPos4sv(v: MemorySegment): Unit =
      PFNGLRASTERPOS4SVPROC.invoke(GLCore.glad_debug_glRasterPos4sv(), v)

  public inline fun glReadBuffer(src: Int): Unit =
      PFNGLREADBUFFERPROC.invoke(GLCore.glad_debug_glReadBuffer(), src)

  public inline fun glReadPixels(
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLREADPIXELSPROC.invoke(GLCore.glad_debug_glReadPixels(), x, y, width, height,
      format, type, pixels)

  public inline fun glReadnPixels(
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLREADNPIXELSPROC.invoke(GLCore.glad_debug_glReadnPixels(), x, y, width, height,
      format, type, bufSize, data)

  public inline fun glReadnPixelsARB(
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    bufSize: Int,
    `data`: MemorySegment,
  ): Unit = PFNGLREADNPIXELSARBPROC.invoke(GLCore.glad_debug_glReadnPixelsARB(), x, y, width,
      height, format, type, bufSize, data)

  public inline fun glRectd(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
  ): Unit = PFNGLRECTDPROC.invoke(GLCore.glad_debug_glRectd(), x1, y1, x2, y2)

  public inline fun glRectdv(v1: MemorySegment, v2: MemorySegment): Unit =
      PFNGLRECTDVPROC.invoke(GLCore.glad_debug_glRectdv(), v1, v2)

  public inline fun glRectf(
    x1: Float,
    y1: Float,
    x2: Float,
    y2: Float,
  ): Unit = PFNGLRECTFPROC.invoke(GLCore.glad_debug_glRectf(), x1, y1, x2, y2)

  public inline fun glRectfv(v1: MemorySegment, v2: MemorySegment): Unit =
      PFNGLRECTFVPROC.invoke(GLCore.glad_debug_glRectfv(), v1, v2)

  public inline fun glRecti(
    x1: Int,
    y1: Int,
    x2: Int,
    y2: Int,
  ): Unit = PFNGLRECTIPROC.invoke(GLCore.glad_debug_glRecti(), x1, y1, x2, y2)

  public inline fun glRectiv(v1: MemorySegment, v2: MemorySegment): Unit =
      PFNGLRECTIVPROC.invoke(GLCore.glad_debug_glRectiv(), v1, v2)

  public inline fun glRects(
    x1: Short,
    y1: Short,
    x2: Short,
    y2: Short,
  ): Unit = PFNGLRECTSPROC.invoke(GLCore.glad_debug_glRects(), x1, y1, x2, y2)

  public inline fun glRectsv(v1: MemorySegment, v2: MemorySegment): Unit =
      PFNGLRECTSVPROC.invoke(GLCore.glad_debug_glRectsv(), v1, v2)

  public inline fun glReleaseShaderCompiler(): Unit =
      PFNGLRELEASESHADERCOMPILERPROC.invoke(GLCore.glad_debug_glReleaseShaderCompiler(), )

  public inline fun glRenderMode(mode: Int): Int =
      PFNGLRENDERMODEPROC.invoke(GLCore.glad_debug_glRenderMode(), mode)

  public inline fun glRenderbufferStorage(
    target: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLRENDERBUFFERSTORAGEPROC.invoke(GLCore.glad_debug_glRenderbufferStorage(), target,
      internalformat, width, height)

  public inline fun glRenderbufferStorageEXT(
    target: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLRENDERBUFFERSTORAGEEXTPROC.invoke(GLCore.glad_debug_glRenderbufferStorageEXT(),
      target, internalformat, width, height)

  public inline fun glRenderbufferStorageMultisample(
    target: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC.invoke(GLCore.glad_debug_glRenderbufferStorageMultisample(),
      target, samples, internalformat, width, height)

  public inline fun glRenderbufferStorageMultisampleEXT(
    target: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit =
      PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC.invoke(GLCore.glad_debug_glRenderbufferStorageMultisampleEXT(),
      target, samples, internalformat, width, height)

  public inline fun glRequestResidentProgramsNV(n: Int, programs: MemorySegment): Unit =
      PFNGLREQUESTRESIDENTPROGRAMSNVPROC.invoke(GLCore.glad_debug_glRequestResidentProgramsNV(), n,
      programs)

  public inline fun glResetHistogram(target: Int): Unit =
      PFNGLRESETHISTOGRAMPROC.invoke(GLCore.glad_debug_glResetHistogram(), target)

  public inline fun glResetMinmax(target: Int): Unit =
      PFNGLRESETMINMAXPROC.invoke(GLCore.glad_debug_glResetMinmax(), target)

  public inline fun glResumeTransformFeedback(): Unit =
      PFNGLRESUMETRANSFORMFEEDBACKPROC.invoke(GLCore.glad_debug_glResumeTransformFeedback(), )

  public inline fun glResumeTransformFeedbackNV(): Unit =
      PFNGLRESUMETRANSFORMFEEDBACKNVPROC.invoke(GLCore.glad_debug_glResumeTransformFeedbackNV(), )

  public inline fun glRotated(
    angle: Double,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLROTATEDPROC.invoke(GLCore.glad_debug_glRotated(), angle, x, y, z)

  public inline fun glRotatef(
    angle: Float,
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLROTATEFPROC.invoke(GLCore.glad_debug_glRotatef(), angle, x, y, z)

  public inline fun glSampleCoverage(`value`: Float, invert: Byte): Unit =
      PFNGLSAMPLECOVERAGEPROC.invoke(GLCore.glad_debug_glSampleCoverage(), value, invert)

  public inline fun glSampleCoverageARB(`value`: Float, invert: Byte): Unit =
      PFNGLSAMPLECOVERAGEARBPROC.invoke(GLCore.glad_debug_glSampleCoverageARB(), value, invert)

  public inline fun glSampleMaskIndexedNV(index: Int, mask: Int): Unit =
      PFNGLSAMPLEMASKINDEXEDNVPROC.invoke(GLCore.glad_debug_glSampleMaskIndexedNV(), index, mask)

  public inline fun glSampleMaski(maskNumber: Int, mask: Int): Unit =
      PFNGLSAMPLEMASKIPROC.invoke(GLCore.glad_debug_glSampleMaski(), maskNumber, mask)

  public inline fun glSamplerParameterIiv(
    sampler: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLSAMPLERPARAMETERIIVPROC.invoke(GLCore.glad_debug_glSamplerParameterIiv(), sampler,
      pname, param)

  public inline fun glSamplerParameterIuiv(
    sampler: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLSAMPLERPARAMETERIUIVPROC.invoke(GLCore.glad_debug_glSamplerParameterIuiv(),
      sampler, pname, param)

  public inline fun glSamplerParameterf(
    sampler: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLSAMPLERPARAMETERFPROC.invoke(GLCore.glad_debug_glSamplerParameterf(), sampler,
      pname, param)

  public inline fun glSamplerParameterfv(
    sampler: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLSAMPLERPARAMETERFVPROC.invoke(GLCore.glad_debug_glSamplerParameterfv(), sampler,
      pname, param)

  public inline fun glSamplerParameteri(
    sampler: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLSAMPLERPARAMETERIPROC.invoke(GLCore.glad_debug_glSamplerParameteri(), sampler,
      pname, param)

  public inline fun glSamplerParameteriv(
    sampler: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLSAMPLERPARAMETERIVPROC.invoke(GLCore.glad_debug_glSamplerParameteriv(), sampler,
      pname, param)

  public inline fun glScaled(
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLSCALEDPROC.invoke(GLCore.glad_debug_glScaled(), x, y, z)

  public inline fun glScalef(
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLSCALEFPROC.invoke(GLCore.glad_debug_glScalef(), x, y, z)

  public inline fun glScissor(
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLSCISSORPROC.invoke(GLCore.glad_debug_glScissor(), x, y, width, height)

  public inline fun glScissorArrayv(
    first: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLSCISSORARRAYVPROC.invoke(GLCore.glad_debug_glScissorArrayv(), first, count, v)

  public inline fun glScissorIndexed(
    index: Int,
    left: Int,
    bottom: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLSCISSORINDEXEDPROC.invoke(GLCore.glad_debug_glScissorIndexed(), index, left,
      bottom, width, height)

  public inline fun glScissorIndexedv(index: Int, v: MemorySegment): Unit =
      PFNGLSCISSORINDEXEDVPROC.invoke(GLCore.glad_debug_glScissorIndexedv(), index, v)

  public inline fun glSecondaryColor3b(
    red: Byte,
    green: Byte,
    blue: Byte,
  ): Unit = PFNGLSECONDARYCOLOR3BPROC.invoke(GLCore.glad_debug_glSecondaryColor3b(), red, green,
      blue)

  public inline fun glSecondaryColor3bEXT(
    red: Byte,
    green: Byte,
    blue: Byte,
  ): Unit = PFNGLSECONDARYCOLOR3BEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3bEXT(), red,
      green, blue)

  public inline fun glSecondaryColor3bv(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3BVPROC.invoke(GLCore.glad_debug_glSecondaryColor3bv(), v)

  public inline fun glSecondaryColor3bvEXT(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3BVEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3bvEXT(), v)

  public inline fun glSecondaryColor3d(
    red: Double,
    green: Double,
    blue: Double,
  ): Unit = PFNGLSECONDARYCOLOR3DPROC.invoke(GLCore.glad_debug_glSecondaryColor3d(), red, green,
      blue)

  public inline fun glSecondaryColor3dEXT(
    red: Double,
    green: Double,
    blue: Double,
  ): Unit = PFNGLSECONDARYCOLOR3DEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3dEXT(), red,
      green, blue)

  public inline fun glSecondaryColor3dv(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3DVPROC.invoke(GLCore.glad_debug_glSecondaryColor3dv(), v)

  public inline fun glSecondaryColor3dvEXT(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3DVEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3dvEXT(), v)

  public inline fun glSecondaryColor3f(
    red: Float,
    green: Float,
    blue: Float,
  ): Unit = PFNGLSECONDARYCOLOR3FPROC.invoke(GLCore.glad_debug_glSecondaryColor3f(), red, green,
      blue)

  public inline fun glSecondaryColor3fEXT(
    red: Float,
    green: Float,
    blue: Float,
  ): Unit = PFNGLSECONDARYCOLOR3FEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3fEXT(), red,
      green, blue)

  public inline fun glSecondaryColor3fv(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3FVPROC.invoke(GLCore.glad_debug_glSecondaryColor3fv(), v)

  public inline fun glSecondaryColor3fvEXT(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3FVEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3fvEXT(), v)

  public inline fun glSecondaryColor3i(
    red: Int,
    green: Int,
    blue: Int,
  ): Unit = PFNGLSECONDARYCOLOR3IPROC.invoke(GLCore.glad_debug_glSecondaryColor3i(), red, green,
      blue)

  public inline fun glSecondaryColor3iEXT(
    red: Int,
    green: Int,
    blue: Int,
  ): Unit = PFNGLSECONDARYCOLOR3IEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3iEXT(), red,
      green, blue)

  public inline fun glSecondaryColor3iv(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3IVPROC.invoke(GLCore.glad_debug_glSecondaryColor3iv(), v)

  public inline fun glSecondaryColor3ivEXT(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3IVEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3ivEXT(), v)

  public inline fun glSecondaryColor3s(
    red: Short,
    green: Short,
    blue: Short,
  ): Unit = PFNGLSECONDARYCOLOR3SPROC.invoke(GLCore.glad_debug_glSecondaryColor3s(), red, green,
      blue)

  public inline fun glSecondaryColor3sEXT(
    red: Short,
    green: Short,
    blue: Short,
  ): Unit = PFNGLSECONDARYCOLOR3SEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3sEXT(), red,
      green, blue)

  public inline fun glSecondaryColor3sv(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3SVPROC.invoke(GLCore.glad_debug_glSecondaryColor3sv(), v)

  public inline fun glSecondaryColor3svEXT(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3SVEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3svEXT(), v)

  public inline fun glSecondaryColor3ub(
    red: Byte,
    green: Byte,
    blue: Byte,
  ): Unit = PFNGLSECONDARYCOLOR3UBPROC.invoke(GLCore.glad_debug_glSecondaryColor3ub(), red, green,
      blue)

  public inline fun glSecondaryColor3ubEXT(
    red: Byte,
    green: Byte,
    blue: Byte,
  ): Unit = PFNGLSECONDARYCOLOR3UBEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3ubEXT(), red,
      green, blue)

  public inline fun glSecondaryColor3ubv(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3UBVPROC.invoke(GLCore.glad_debug_glSecondaryColor3ubv(), v)

  public inline fun glSecondaryColor3ubvEXT(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3UBVEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3ubvEXT(), v)

  public inline fun glSecondaryColor3ui(
    red: Int,
    green: Int,
    blue: Int,
  ): Unit = PFNGLSECONDARYCOLOR3UIPROC.invoke(GLCore.glad_debug_glSecondaryColor3ui(), red, green,
      blue)

  public inline fun glSecondaryColor3uiEXT(
    red: Int,
    green: Int,
    blue: Int,
  ): Unit = PFNGLSECONDARYCOLOR3UIEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3uiEXT(), red,
      green, blue)

  public inline fun glSecondaryColor3uiv(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3UIVPROC.invoke(GLCore.glad_debug_glSecondaryColor3uiv(), v)

  public inline fun glSecondaryColor3uivEXT(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3UIVEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3uivEXT(), v)

  public inline fun glSecondaryColor3us(
    red: Short,
    green: Short,
    blue: Short,
  ): Unit = PFNGLSECONDARYCOLOR3USPROC.invoke(GLCore.glad_debug_glSecondaryColor3us(), red, green,
      blue)

  public inline fun glSecondaryColor3usEXT(
    red: Short,
    green: Short,
    blue: Short,
  ): Unit = PFNGLSECONDARYCOLOR3USEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3usEXT(), red,
      green, blue)

  public inline fun glSecondaryColor3usv(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3USVPROC.invoke(GLCore.glad_debug_glSecondaryColor3usv(), v)

  public inline fun glSecondaryColor3usvEXT(v: MemorySegment): Unit =
      PFNGLSECONDARYCOLOR3USVEXTPROC.invoke(GLCore.glad_debug_glSecondaryColor3usvEXT(), v)

  public inline fun glSecondaryColorP3ui(type: Int, color: Int): Unit =
      PFNGLSECONDARYCOLORP3UIPROC.invoke(GLCore.glad_debug_glSecondaryColorP3ui(), type, color)

  public inline fun glSecondaryColorP3uiv(type: Int, color: MemorySegment): Unit =
      PFNGLSECONDARYCOLORP3UIVPROC.invoke(GLCore.glad_debug_glSecondaryColorP3uiv(), type, color)

  public inline fun glSecondaryColorPointer(
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLSECONDARYCOLORPOINTERPROC.invoke(GLCore.glad_debug_glSecondaryColorPointer(), size,
      type, stride, pointer)

  public inline fun glSecondaryColorPointerEXT(
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLSECONDARYCOLORPOINTEREXTPROC.invoke(GLCore.glad_debug_glSecondaryColorPointerEXT(),
      size, type, stride, pointer)

  public inline fun glSelectBuffer(size: Int, buffer: MemorySegment): Unit =
      PFNGLSELECTBUFFERPROC.invoke(GLCore.glad_debug_glSelectBuffer(), size, buffer)

  public inline fun glSeparableFilter2D(
    target: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    row: MemorySegment,
    column: MemorySegment,
  ): Unit = PFNGLSEPARABLEFILTER2DPROC.invoke(GLCore.glad_debug_glSeparableFilter2D(), target,
      internalformat, width, height, format, type, row, column)

  public inline fun glShadeModel(mode: Int): Unit =
      PFNGLSHADEMODELPROC.invoke(GLCore.glad_debug_glShadeModel(), mode)

  public inline fun glShaderBinary(
    count: Int,
    shaders: MemorySegment,
    binaryFormat: Int,
    binary: MemorySegment,
    length: Int,
  ): Unit = PFNGLSHADERBINARYPROC.invoke(GLCore.glad_debug_glShaderBinary(), count, shaders,
      binaryFormat, binary, length)

  public inline fun glShaderSource(
    shader: Int,
    count: Int,
    string: MemorySegment,
    length: MemorySegment,
  ): Unit = PFNGLSHADERSOURCEPROC.invoke(GLCore.glad_debug_glShaderSource(), shader, count, string,
      length)

  public inline fun glShaderSourceARB(
    shaderObj: Int,
    count: Int,
    string: MemorySegment,
    length: MemorySegment,
  ): Unit = PFNGLSHADERSOURCEARBPROC.invoke(GLCore.glad_debug_glShaderSourceARB(), shaderObj, count,
      string, length)

  public inline fun glShaderStorageBlockBinding(
    program: Int,
    storageBlockIndex: Int,
    storageBlockBinding: Int,
  ): Unit =
      PFNGLSHADERSTORAGEBLOCKBINDINGPROC.invoke(GLCore.glad_debug_glShaderStorageBlockBinding(),
      program, storageBlockIndex, storageBlockBinding)

  public inline fun glSpecializeShader(
    shader: Int,
    pEntryPoint: MemorySegment,
    numSpecializationConstants: Int,
    pConstantIndex: MemorySegment,
    pConstantValue: MemorySegment,
  ): Unit = PFNGLSPECIALIZESHADERPROC.invoke(GLCore.glad_debug_glSpecializeShader(), shader,
      pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue)

  public inline fun glSpecializeShaderARB(
    shader: Int,
    pEntryPoint: MemorySegment,
    numSpecializationConstants: Int,
    pConstantIndex: MemorySegment,
    pConstantValue: MemorySegment,
  ): Unit = PFNGLSPECIALIZESHADERARBPROC.invoke(GLCore.glad_debug_glSpecializeShaderARB(), shader,
      pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue)

  public inline fun glStencilFunc(
    func: Int,
    ref: Int,
    mask: Int,
  ): Unit = PFNGLSTENCILFUNCPROC.invoke(GLCore.glad_debug_glStencilFunc(), func, ref, mask)

  public inline fun glStencilFuncSeparate(
    face: Int,
    func: Int,
    ref: Int,
    mask: Int,
  ): Unit = PFNGLSTENCILFUNCSEPARATEPROC.invoke(GLCore.glad_debug_glStencilFuncSeparate(), face,
      func, ref, mask)

  public inline fun glStencilFuncSeparateATI(
    frontfunc: Int,
    backfunc: Int,
    ref: Int,
    mask: Int,
  ): Unit = PFNGLSTENCILFUNCSEPARATEATIPROC.invoke(GLCore.glad_debug_glStencilFuncSeparateATI(),
      frontfunc, backfunc, ref, mask)

  public inline fun glStencilMask(mask: Int): Unit =
      PFNGLSTENCILMASKPROC.invoke(GLCore.glad_debug_glStencilMask(), mask)

  public inline fun glStencilMaskSeparate(face: Int, mask: Int): Unit =
      PFNGLSTENCILMASKSEPARATEPROC.invoke(GLCore.glad_debug_glStencilMaskSeparate(), face, mask)

  public inline fun glStencilOp(
    fail: Int,
    zfail: Int,
    zpass: Int,
  ): Unit = PFNGLSTENCILOPPROC.invoke(GLCore.glad_debug_glStencilOp(), fail, zfail, zpass)

  public inline fun glStencilOpSeparate(
    face: Int,
    sfail: Int,
    dpfail: Int,
    dppass: Int,
  ): Unit = PFNGLSTENCILOPSEPARATEPROC.invoke(GLCore.glad_debug_glStencilOpSeparate(), face, sfail,
      dpfail, dppass)

  public inline fun glStencilOpSeparateATI(
    face: Int,
    sfail: Int,
    dpfail: Int,
    dppass: Int,
  ): Unit = PFNGLSTENCILOPSEPARATEATIPROC.invoke(GLCore.glad_debug_glStencilOpSeparateATI(), face,
      sfail, dpfail, dppass)

  public inline fun glTexBuffer(
    target: Int,
    internalformat: Int,
    buffer: Int,
  ): Unit = PFNGLTEXBUFFERPROC.invoke(GLCore.glad_debug_glTexBuffer(), target, internalformat,
      buffer)

  public inline fun glTexBufferARB(
    target: Int,
    internalformat: Int,
    buffer: Int,
  ): Unit = PFNGLTEXBUFFERARBPROC.invoke(GLCore.glad_debug_glTexBufferARB(), target, internalformat,
      buffer)

  public inline fun glTexBufferEXT(
    target: Int,
    internalformat: Int,
    buffer: Int,
  ): Unit = PFNGLTEXBUFFEREXTPROC.invoke(GLCore.glad_debug_glTexBufferEXT(), target, internalformat,
      buffer)

  public inline fun glTexBufferRange(
    target: Int,
    internalformat: Int,
    buffer: Int,
    offset: Long,
    size: Long,
  ): Unit = PFNGLTEXBUFFERRANGEPROC.invoke(GLCore.glad_debug_glTexBufferRange(), target,
      internalformat, buffer, offset, size)

  public inline fun glTexCoord1d(s: Double): Unit =
      PFNGLTEXCOORD1DPROC.invoke(GLCore.glad_debug_glTexCoord1d(), s)

  public inline fun glTexCoord1dv(v: MemorySegment): Unit =
      PFNGLTEXCOORD1DVPROC.invoke(GLCore.glad_debug_glTexCoord1dv(), v)

  public inline fun glTexCoord1f(s: Float): Unit =
      PFNGLTEXCOORD1FPROC.invoke(GLCore.glad_debug_glTexCoord1f(), s)

  public inline fun glTexCoord1fv(v: MemorySegment): Unit =
      PFNGLTEXCOORD1FVPROC.invoke(GLCore.glad_debug_glTexCoord1fv(), v)

  public inline fun glTexCoord1i(s: Int): Unit =
      PFNGLTEXCOORD1IPROC.invoke(GLCore.glad_debug_glTexCoord1i(), s)

  public inline fun glTexCoord1iv(v: MemorySegment): Unit =
      PFNGLTEXCOORD1IVPROC.invoke(GLCore.glad_debug_glTexCoord1iv(), v)

  public inline fun glTexCoord1s(s: Short): Unit =
      PFNGLTEXCOORD1SPROC.invoke(GLCore.glad_debug_glTexCoord1s(), s)

  public inline fun glTexCoord1sv(v: MemorySegment): Unit =
      PFNGLTEXCOORD1SVPROC.invoke(GLCore.glad_debug_glTexCoord1sv(), v)

  public inline fun glTexCoord2d(s: Double, t: Double): Unit =
      PFNGLTEXCOORD2DPROC.invoke(GLCore.glad_debug_glTexCoord2d(), s, t)

  public inline fun glTexCoord2dv(v: MemorySegment): Unit =
      PFNGLTEXCOORD2DVPROC.invoke(GLCore.glad_debug_glTexCoord2dv(), v)

  public inline fun glTexCoord2f(s: Float, t: Float): Unit =
      PFNGLTEXCOORD2FPROC.invoke(GLCore.glad_debug_glTexCoord2f(), s, t)

  public inline fun glTexCoord2fv(v: MemorySegment): Unit =
      PFNGLTEXCOORD2FVPROC.invoke(GLCore.glad_debug_glTexCoord2fv(), v)

  public inline fun glTexCoord2i(s: Int, t: Int): Unit =
      PFNGLTEXCOORD2IPROC.invoke(GLCore.glad_debug_glTexCoord2i(), s, t)

  public inline fun glTexCoord2iv(v: MemorySegment): Unit =
      PFNGLTEXCOORD2IVPROC.invoke(GLCore.glad_debug_glTexCoord2iv(), v)

  public inline fun glTexCoord2s(s: Short, t: Short): Unit =
      PFNGLTEXCOORD2SPROC.invoke(GLCore.glad_debug_glTexCoord2s(), s, t)

  public inline fun glTexCoord2sv(v: MemorySegment): Unit =
      PFNGLTEXCOORD2SVPROC.invoke(GLCore.glad_debug_glTexCoord2sv(), v)

  public inline fun glTexCoord3d(
    s: Double,
    t: Double,
    r: Double,
  ): Unit = PFNGLTEXCOORD3DPROC.invoke(GLCore.glad_debug_glTexCoord3d(), s, t, r)

  public inline fun glTexCoord3dv(v: MemorySegment): Unit =
      PFNGLTEXCOORD3DVPROC.invoke(GLCore.glad_debug_glTexCoord3dv(), v)

  public inline fun glTexCoord3f(
    s: Float,
    t: Float,
    r: Float,
  ): Unit = PFNGLTEXCOORD3FPROC.invoke(GLCore.glad_debug_glTexCoord3f(), s, t, r)

  public inline fun glTexCoord3fv(v: MemorySegment): Unit =
      PFNGLTEXCOORD3FVPROC.invoke(GLCore.glad_debug_glTexCoord3fv(), v)

  public inline fun glTexCoord3i(
    s: Int,
    t: Int,
    r: Int,
  ): Unit = PFNGLTEXCOORD3IPROC.invoke(GLCore.glad_debug_glTexCoord3i(), s, t, r)

  public inline fun glTexCoord3iv(v: MemorySegment): Unit =
      PFNGLTEXCOORD3IVPROC.invoke(GLCore.glad_debug_glTexCoord3iv(), v)

  public inline fun glTexCoord3s(
    s: Short,
    t: Short,
    r: Short,
  ): Unit = PFNGLTEXCOORD3SPROC.invoke(GLCore.glad_debug_glTexCoord3s(), s, t, r)

  public inline fun glTexCoord3sv(v: MemorySegment): Unit =
      PFNGLTEXCOORD3SVPROC.invoke(GLCore.glad_debug_glTexCoord3sv(), v)

  public inline fun glTexCoord4d(
    s: Double,
    t: Double,
    r: Double,
    q: Double,
  ): Unit = PFNGLTEXCOORD4DPROC.invoke(GLCore.glad_debug_glTexCoord4d(), s, t, r, q)

  public inline fun glTexCoord4dv(v: MemorySegment): Unit =
      PFNGLTEXCOORD4DVPROC.invoke(GLCore.glad_debug_glTexCoord4dv(), v)

  public inline fun glTexCoord4f(
    s: Float,
    t: Float,
    r: Float,
    q: Float,
  ): Unit = PFNGLTEXCOORD4FPROC.invoke(GLCore.glad_debug_glTexCoord4f(), s, t, r, q)

  public inline fun glTexCoord4fv(v: MemorySegment): Unit =
      PFNGLTEXCOORD4FVPROC.invoke(GLCore.glad_debug_glTexCoord4fv(), v)

  public inline fun glTexCoord4i(
    s: Int,
    t: Int,
    r: Int,
    q: Int,
  ): Unit = PFNGLTEXCOORD4IPROC.invoke(GLCore.glad_debug_glTexCoord4i(), s, t, r, q)

  public inline fun glTexCoord4iv(v: MemorySegment): Unit =
      PFNGLTEXCOORD4IVPROC.invoke(GLCore.glad_debug_glTexCoord4iv(), v)

  public inline fun glTexCoord4s(
    s: Short,
    t: Short,
    r: Short,
    q: Short,
  ): Unit = PFNGLTEXCOORD4SPROC.invoke(GLCore.glad_debug_glTexCoord4s(), s, t, r, q)

  public inline fun glTexCoord4sv(v: MemorySegment): Unit =
      PFNGLTEXCOORD4SVPROC.invoke(GLCore.glad_debug_glTexCoord4sv(), v)

  public inline fun glTexCoordP1ui(type: Int, coords: Int): Unit =
      PFNGLTEXCOORDP1UIPROC.invoke(GLCore.glad_debug_glTexCoordP1ui(), type, coords)

  public inline fun glTexCoordP1uiv(type: Int, coords: MemorySegment): Unit =
      PFNGLTEXCOORDP1UIVPROC.invoke(GLCore.glad_debug_glTexCoordP1uiv(), type, coords)

  public inline fun glTexCoordP2ui(type: Int, coords: Int): Unit =
      PFNGLTEXCOORDP2UIPROC.invoke(GLCore.glad_debug_glTexCoordP2ui(), type, coords)

  public inline fun glTexCoordP2uiv(type: Int, coords: MemorySegment): Unit =
      PFNGLTEXCOORDP2UIVPROC.invoke(GLCore.glad_debug_glTexCoordP2uiv(), type, coords)

  public inline fun glTexCoordP3ui(type: Int, coords: Int): Unit =
      PFNGLTEXCOORDP3UIPROC.invoke(GLCore.glad_debug_glTexCoordP3ui(), type, coords)

  public inline fun glTexCoordP3uiv(type: Int, coords: MemorySegment): Unit =
      PFNGLTEXCOORDP3UIVPROC.invoke(GLCore.glad_debug_glTexCoordP3uiv(), type, coords)

  public inline fun glTexCoordP4ui(type: Int, coords: Int): Unit =
      PFNGLTEXCOORDP4UIPROC.invoke(GLCore.glad_debug_glTexCoordP4ui(), type, coords)

  public inline fun glTexCoordP4uiv(type: Int, coords: MemorySegment): Unit =
      PFNGLTEXCOORDP4UIVPROC.invoke(GLCore.glad_debug_glTexCoordP4uiv(), type, coords)

  public inline fun glTexCoordPointer(
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLTEXCOORDPOINTERPROC.invoke(GLCore.glad_debug_glTexCoordPointer(), size, type,
      stride, pointer)

  public inline fun glTexCoordPointerEXT(
    size: Int,
    type: Int,
    stride: Int,
    count: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLTEXCOORDPOINTEREXTPROC.invoke(GLCore.glad_debug_glTexCoordPointerEXT(), size, type,
      stride, count, pointer)

  public inline fun glTexEnvf(
    target: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLTEXENVFPROC.invoke(GLCore.glad_debug_glTexEnvf(), target, pname, param)

  public inline fun glTexEnvfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXENVFVPROC.invoke(GLCore.glad_debug_glTexEnvfv(), target, pname, params)

  public inline fun glTexEnvi(
    target: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLTEXENVIPROC.invoke(GLCore.glad_debug_glTexEnvi(), target, pname, param)

  public inline fun glTexEnviv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXENVIVPROC.invoke(GLCore.glad_debug_glTexEnviv(), target, pname, params)

  public inline fun glTexGend(
    coord: Int,
    pname: Int,
    `param`: Double,
  ): Unit = PFNGLTEXGENDPROC.invoke(GLCore.glad_debug_glTexGend(), coord, pname, param)

  public inline fun glTexGendv(
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXGENDVPROC.invoke(GLCore.glad_debug_glTexGendv(), coord, pname, params)

  public inline fun glTexGenf(
    coord: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLTEXGENFPROC.invoke(GLCore.glad_debug_glTexGenf(), coord, pname, param)

  public inline fun glTexGenfv(
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXGENFVPROC.invoke(GLCore.glad_debug_glTexGenfv(), coord, pname, params)

  public inline fun glTexGeni(
    coord: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLTEXGENIPROC.invoke(GLCore.glad_debug_glTexGeni(), coord, pname, param)

  public inline fun glTexGeniv(
    coord: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXGENIVPROC.invoke(GLCore.glad_debug_glTexGeniv(), coord, pname, params)

  public inline fun glTexImage1D(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXIMAGE1DPROC.invoke(GLCore.glad_debug_glTexImage1D(), target, level,
      internalformat, width, border, format, type, pixels)

  public inline fun glTexImage2D(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXIMAGE2DPROC.invoke(GLCore.glad_debug_glTexImage2D(), target, level,
      internalformat, width, height, border, format, type, pixels)

  public inline fun glTexImage2DMultisample(
    target: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    fixedsamplelocations: Byte,
  ): Unit = PFNGLTEXIMAGE2DMULTISAMPLEPROC.invoke(GLCore.glad_debug_glTexImage2DMultisample(),
      target, samples, internalformat, width, height, fixedsamplelocations)

  public inline fun glTexImage3D(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXIMAGE3DPROC.invoke(GLCore.glad_debug_glTexImage3D(), target, level,
      internalformat, width, height, depth, border, format, type, pixels)

  public inline fun glTexImage3DEXT(
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glTexImage3DEXT(), target, level,
      internalformat, width, height, depth, border, format, type, pixels)

  public inline fun glTexImage3DMultisample(
    target: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    fixedsamplelocations: Byte,
  ): Unit = PFNGLTEXIMAGE3DMULTISAMPLEPROC.invoke(GLCore.glad_debug_glTexImage3DMultisample(),
      target, samples, internalformat, width, height, depth, fixedsamplelocations)

  public inline fun glTexParameterIiv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXPARAMETERIIVPROC.invoke(GLCore.glad_debug_glTexParameterIiv(), target, pname,
      params)

  public inline fun glTexParameterIivEXT(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXPARAMETERIIVEXTPROC.invoke(GLCore.glad_debug_glTexParameterIivEXT(), target,
      pname, params)

  public inline fun glTexParameterIuiv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXPARAMETERIUIVPROC.invoke(GLCore.glad_debug_glTexParameterIuiv(), target, pname,
      params)

  public inline fun glTexParameterIuivEXT(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXPARAMETERIUIVEXTPROC.invoke(GLCore.glad_debug_glTexParameterIuivEXT(), target,
      pname, params)

  public inline fun glTexParameterf(
    target: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLTEXPARAMETERFPROC.invoke(GLCore.glad_debug_glTexParameterf(), target, pname, param)

  public inline fun glTexParameterfv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXPARAMETERFVPROC.invoke(GLCore.glad_debug_glTexParameterfv(), target, pname,
      params)

  public inline fun glTexParameteri(
    target: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLTEXPARAMETERIPROC.invoke(GLCore.glad_debug_glTexParameteri(), target, pname, param)

  public inline fun glTexParameteriv(
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXPARAMETERIVPROC.invoke(GLCore.glad_debug_glTexParameteriv(), target, pname,
      params)

  public inline fun glTexRenderbufferNV(target: Int, renderbuffer: Int): Unit =
      PFNGLTEXRENDERBUFFERNVPROC.invoke(GLCore.glad_debug_glTexRenderbufferNV(), target,
      renderbuffer)

  public inline fun glTexStorage1D(
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
  ): Unit = PFNGLTEXSTORAGE1DPROC.invoke(GLCore.glad_debug_glTexStorage1D(), target, levels,
      internalformat, width)

  public inline fun glTexStorage1DEXT(
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
  ): Unit = PFNGLTEXSTORAGE1DEXTPROC.invoke(GLCore.glad_debug_glTexStorage1DEXT(), target, levels,
      internalformat, width)

  public inline fun glTexStorage2D(
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLTEXSTORAGE2DPROC.invoke(GLCore.glad_debug_glTexStorage2D(), target, levels,
      internalformat, width, height)

  public inline fun glTexStorage2DEXT(
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLTEXSTORAGE2DEXTPROC.invoke(GLCore.glad_debug_glTexStorage2DEXT(), target, levels,
      internalformat, width, height)

  public inline fun glTexStorage2DMultisample(
    target: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    fixedsamplelocations: Byte,
  ): Unit = PFNGLTEXSTORAGE2DMULTISAMPLEPROC.invoke(GLCore.glad_debug_glTexStorage2DMultisample(),
      target, samples, internalformat, width, height, fixedsamplelocations)

  public inline fun glTexStorage3D(
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
  ): Unit = PFNGLTEXSTORAGE3DPROC.invoke(GLCore.glad_debug_glTexStorage3D(), target, levels,
      internalformat, width, height, depth)

  public inline fun glTexStorage3DEXT(
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
  ): Unit = PFNGLTEXSTORAGE3DEXTPROC.invoke(GLCore.glad_debug_glTexStorage3DEXT(), target, levels,
      internalformat, width, height, depth)

  public inline fun glTexStorage3DMultisample(
    target: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    fixedsamplelocations: Byte,
  ): Unit = PFNGLTEXSTORAGE3DMULTISAMPLEPROC.invoke(GLCore.glad_debug_glTexStorage3DMultisample(),
      target, samples, internalformat, width, height, depth, fixedsamplelocations)

  public inline fun glTexSubImage1D(
    target: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXSUBIMAGE1DPROC.invoke(GLCore.glad_debug_glTexSubImage1D(), target, level,
      xoffset, width, format, type, pixels)

  public inline fun glTexSubImage1DEXT(
    target: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXSUBIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glTexSubImage1DEXT(), target, level,
      xoffset, width, format, type, pixels)

  public inline fun glTexSubImage2D(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXSUBIMAGE2DPROC.invoke(GLCore.glad_debug_glTexSubImage2D(), target, level,
      xoffset, yoffset, width, height, format, type, pixels)

  public inline fun glTexSubImage2DEXT(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXSUBIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glTexSubImage2DEXT(), target, level,
      xoffset, yoffset, width, height, format, type, pixels)

  public inline fun glTexSubImage3D(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXSUBIMAGE3DPROC.invoke(GLCore.glad_debug_glTexSubImage3D(), target, level,
      xoffset, yoffset, zoffset, width, height, depth, format, type, pixels)

  public inline fun glTexSubImage3DEXT(
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXSUBIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glTexSubImage3DEXT(), target, level,
      xoffset, yoffset, zoffset, width, height, depth, format, type, pixels)

  public inline fun glTextureBarrier(): Unit =
      PFNGLTEXTUREBARRIERPROC.invoke(GLCore.glad_debug_glTextureBarrier(), )

  public inline fun glTextureBuffer(
    texture: Int,
    internalformat: Int,
    buffer: Int,
  ): Unit = PFNGLTEXTUREBUFFERPROC.invoke(GLCore.glad_debug_glTextureBuffer(), texture,
      internalformat, buffer)

  public inline fun glTextureBufferEXT(
    texture: Int,
    target: Int,
    internalformat: Int,
    buffer: Int,
  ): Unit = PFNGLTEXTUREBUFFEREXTPROC.invoke(GLCore.glad_debug_glTextureBufferEXT(), texture,
      target, internalformat, buffer)

  public inline fun glTextureBufferRange(
    texture: Int,
    internalformat: Int,
    buffer: Int,
    offset: Long,
    size: Long,
  ): Unit = PFNGLTEXTUREBUFFERRANGEPROC.invoke(GLCore.glad_debug_glTextureBufferRange(), texture,
      internalformat, buffer, offset, size)

  public inline fun glTextureBufferRangeEXT(
    texture: Int,
    target: Int,
    internalformat: Int,
    buffer: Int,
    offset: Long,
    size: Long,
  ): Unit = PFNGLTEXTUREBUFFERRANGEEXTPROC.invoke(GLCore.glad_debug_glTextureBufferRangeEXT(),
      texture, target, internalformat, buffer, offset, size)

  public inline fun glTextureImage1DEXT(
    texture: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTUREIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glTextureImage1DEXT(), texture,
      target, level, internalformat, width, border, format, type, pixels)

  public inline fun glTextureImage2DEXT(
    texture: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTUREIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glTextureImage2DEXT(), texture,
      target, level, internalformat, width, height, border, format, type, pixels)

  public inline fun glTextureImage3DEXT(
    texture: Int,
    target: Int,
    level: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    border: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTUREIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glTextureImage3DEXT(), texture,
      target, level, internalformat, width, height, depth, border, format, type, pixels)

  public inline fun glTexturePageCommitmentEXT(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    commit: Byte,
  ): Unit = PFNGLTEXTUREPAGECOMMITMENTEXTPROC.invoke(GLCore.glad_debug_glTexturePageCommitmentEXT(),
      texture, level, xoffset, yoffset, zoffset, width, height, depth, commit)

  public inline fun glTextureParameterIiv(
    texture: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXTUREPARAMETERIIVPROC.invoke(GLCore.glad_debug_glTextureParameterIiv(), texture,
      pname, params)

  public inline fun glTextureParameterIivEXT(
    texture: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXTUREPARAMETERIIVEXTPROC.invoke(GLCore.glad_debug_glTextureParameterIivEXT(),
      texture, target, pname, params)

  public inline fun glTextureParameterIuiv(
    texture: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXTUREPARAMETERIUIVPROC.invoke(GLCore.glad_debug_glTextureParameterIuiv(),
      texture, pname, params)

  public inline fun glTextureParameterIuivEXT(
    texture: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXTUREPARAMETERIUIVEXTPROC.invoke(GLCore.glad_debug_glTextureParameterIuivEXT(),
      texture, target, pname, params)

  public inline fun glTextureParameterf(
    texture: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLTEXTUREPARAMETERFPROC.invoke(GLCore.glad_debug_glTextureParameterf(), texture,
      pname, param)

  public inline fun glTextureParameterfEXT(
    texture: Int,
    target: Int,
    pname: Int,
    `param`: Float,
  ): Unit = PFNGLTEXTUREPARAMETERFEXTPROC.invoke(GLCore.glad_debug_glTextureParameterfEXT(),
      texture, target, pname, param)

  public inline fun glTextureParameterfv(
    texture: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLTEXTUREPARAMETERFVPROC.invoke(GLCore.glad_debug_glTextureParameterfv(), texture,
      pname, param)

  public inline fun glTextureParameterfvEXT(
    texture: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXTUREPARAMETERFVEXTPROC.invoke(GLCore.glad_debug_glTextureParameterfvEXT(),
      texture, target, pname, params)

  public inline fun glTextureParameteri(
    texture: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLTEXTUREPARAMETERIPROC.invoke(GLCore.glad_debug_glTextureParameteri(), texture,
      pname, param)

  public inline fun glTextureParameteriEXT(
    texture: Int,
    target: Int,
    pname: Int,
    `param`: Int,
  ): Unit = PFNGLTEXTUREPARAMETERIEXTPROC.invoke(GLCore.glad_debug_glTextureParameteriEXT(),
      texture, target, pname, param)

  public inline fun glTextureParameteriv(
    texture: Int,
    pname: Int,
    `param`: MemorySegment,
  ): Unit = PFNGLTEXTUREPARAMETERIVPROC.invoke(GLCore.glad_debug_glTextureParameteriv(), texture,
      pname, param)

  public inline fun glTextureParameterivEXT(
    texture: Int,
    target: Int,
    pname: Int,
    params: MemorySegment,
  ): Unit = PFNGLTEXTUREPARAMETERIVEXTPROC.invoke(GLCore.glad_debug_glTextureParameterivEXT(),
      texture, target, pname, params)

  public inline fun glTextureRenderbufferEXT(
    texture: Int,
    target: Int,
    renderbuffer: Int,
  ): Unit = PFNGLTEXTURERENDERBUFFEREXTPROC.invoke(GLCore.glad_debug_glTextureRenderbufferEXT(),
      texture, target, renderbuffer)

  public inline fun glTextureStorage1D(
    texture: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
  ): Unit = PFNGLTEXTURESTORAGE1DPROC.invoke(GLCore.glad_debug_glTextureStorage1D(), texture,
      levels, internalformat, width)

  public inline fun glTextureStorage1DEXT(
    texture: Int,
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
  ): Unit = PFNGLTEXTURESTORAGE1DEXTPROC.invoke(GLCore.glad_debug_glTextureStorage1DEXT(), texture,
      target, levels, internalformat, width)

  public inline fun glTextureStorage2D(
    texture: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLTEXTURESTORAGE2DPROC.invoke(GLCore.glad_debug_glTextureStorage2D(), texture,
      levels, internalformat, width, height)

  public inline fun glTextureStorage2DEXT(
    texture: Int,
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLTEXTURESTORAGE2DEXTPROC.invoke(GLCore.glad_debug_glTextureStorage2DEXT(), texture,
      target, levels, internalformat, width, height)

  public inline fun glTextureStorage2DMultisample(
    texture: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    fixedsamplelocations: Byte,
  ): Unit =
      PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC.invoke(GLCore.glad_debug_glTextureStorage2DMultisample(),
      texture, samples, internalformat, width, height, fixedsamplelocations)

  public inline fun glTextureStorage2DMultisampleEXT(
    texture: Int,
    target: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    fixedsamplelocations: Byte,
  ): Unit =
      PFNGLTEXTURESTORAGE2DMULTISAMPLEEXTPROC.invoke(GLCore.glad_debug_glTextureStorage2DMultisampleEXT(),
      texture, target, samples, internalformat, width, height, fixedsamplelocations)

  public inline fun glTextureStorage3D(
    texture: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
  ): Unit = PFNGLTEXTURESTORAGE3DPROC.invoke(GLCore.glad_debug_glTextureStorage3D(), texture,
      levels, internalformat, width, height, depth)

  public inline fun glTextureStorage3DEXT(
    texture: Int,
    target: Int,
    levels: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
  ): Unit = PFNGLTEXTURESTORAGE3DEXTPROC.invoke(GLCore.glad_debug_glTextureStorage3DEXT(), texture,
      target, levels, internalformat, width, height, depth)

  public inline fun glTextureStorage3DMultisample(
    texture: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    fixedsamplelocations: Byte,
  ): Unit =
      PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC.invoke(GLCore.glad_debug_glTextureStorage3DMultisample(),
      texture, samples, internalformat, width, height, depth, fixedsamplelocations)

  public inline fun glTextureStorage3DMultisampleEXT(
    texture: Int,
    target: Int,
    samples: Int,
    internalformat: Int,
    width: Int,
    height: Int,
    depth: Int,
    fixedsamplelocations: Byte,
  ): Unit =
      PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC.invoke(GLCore.glad_debug_glTextureStorage3DMultisampleEXT(),
      texture, target, samples, internalformat, width, height, depth, fixedsamplelocations)

  public inline fun glTextureSubImage1D(
    texture: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTURESUBIMAGE1DPROC.invoke(GLCore.glad_debug_glTextureSubImage1D(), texture,
      level, xoffset, width, format, type, pixels)

  public inline fun glTextureSubImage1DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    width: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTURESUBIMAGE1DEXTPROC.invoke(GLCore.glad_debug_glTextureSubImage1DEXT(),
      texture, target, level, xoffset, width, format, type, pixels)

  public inline fun glTextureSubImage2D(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTURESUBIMAGE2DPROC.invoke(GLCore.glad_debug_glTextureSubImage2D(), texture,
      level, xoffset, yoffset, width, height, format, type, pixels)

  public inline fun glTextureSubImage2DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    width: Int,
    height: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTURESUBIMAGE2DEXTPROC.invoke(GLCore.glad_debug_glTextureSubImage2DEXT(),
      texture, target, level, xoffset, yoffset, width, height, format, type, pixels)

  public inline fun glTextureSubImage3D(
    texture: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTURESUBIMAGE3DPROC.invoke(GLCore.glad_debug_glTextureSubImage3D(), texture,
      level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels)

  public inline fun glTextureSubImage3DEXT(
    texture: Int,
    target: Int,
    level: Int,
    xoffset: Int,
    yoffset: Int,
    zoffset: Int,
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    type: Int,
    pixels: MemorySegment,
  ): Unit = PFNGLTEXTURESUBIMAGE3DEXTPROC.invoke(GLCore.glad_debug_glTextureSubImage3DEXT(),
      texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels)

  public inline fun glTextureView(
    texture: Int,
    target: Int,
    origtexture: Int,
    internalformat: Int,
    minlevel: Int,
    numlevels: Int,
    minlayer: Int,
    numlayers: Int,
  ): Unit = PFNGLTEXTUREVIEWPROC.invoke(GLCore.glad_debug_glTextureView(), texture, target,
      origtexture, internalformat, minlevel, numlevels, minlayer, numlayers)

  public inline fun glTrackMatrixNV(
    target: Int,
    address: Int,
    matrix: Int,
    transform: Int,
  ): Unit = PFNGLTRACKMATRIXNVPROC.invoke(GLCore.glad_debug_glTrackMatrixNV(), target, address,
      matrix, transform)

  public inline fun glTransformFeedbackAttribsNV(
    count: Int,
    attribs: MemorySegment,
    bufferMode: Int,
  ): Unit =
      PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC.invoke(GLCore.glad_debug_glTransformFeedbackAttribsNV(),
      count, attribs, bufferMode)

  public inline fun glTransformFeedbackBufferBase(
    xfb: Int,
    index: Int,
    buffer: Int,
  ): Unit =
      PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC.invoke(GLCore.glad_debug_glTransformFeedbackBufferBase(),
      xfb, index, buffer)

  public inline fun glTransformFeedbackBufferRange(
    xfb: Int,
    index: Int,
    buffer: Int,
    offset: Long,
    size: Long,
  ): Unit =
      PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC.invoke(GLCore.glad_debug_glTransformFeedbackBufferRange(),
      xfb, index, buffer, offset, size)

  public inline fun glTransformFeedbackStreamAttribsNV(
    count: Int,
    attribs: MemorySegment,
    nbuffers: Int,
    bufstreams: MemorySegment,
    bufferMode: Int,
  ): Unit =
      PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC.invoke(GLCore.glad_debug_glTransformFeedbackStreamAttribsNV(),
      count, attribs, nbuffers, bufstreams, bufferMode)

  public inline fun glTransformFeedbackVaryings(
    program: Int,
    count: Int,
    varyings: MemorySegment,
    bufferMode: Int,
  ): Unit =
      PFNGLTRANSFORMFEEDBACKVARYINGSPROC.invoke(GLCore.glad_debug_glTransformFeedbackVaryings(),
      program, count, varyings, bufferMode)

  public inline fun glTransformFeedbackVaryingsEXT(
    program: Int,
    count: Int,
    varyings: MemorySegment,
    bufferMode: Int,
  ): Unit =
      PFNGLTRANSFORMFEEDBACKVARYINGSEXTPROC.invoke(GLCore.glad_debug_glTransformFeedbackVaryingsEXT(),
      program, count, varyings, bufferMode)

  public inline fun glTransformFeedbackVaryingsNV(
    program: Int,
    count: Int,
    locations: MemorySegment,
    bufferMode: Int,
  ): Unit =
      PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC.invoke(GLCore.glad_debug_glTransformFeedbackVaryingsNV(),
      program, count, locations, bufferMode)

  public inline fun glTranslated(
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLTRANSLATEDPROC.invoke(GLCore.glad_debug_glTranslated(), x, y, z)

  public inline fun glTranslatef(
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLTRANSLATEFPROC.invoke(GLCore.glad_debug_glTranslatef(), x, y, z)

  public inline fun glUniform1d(location: Int, x: Double): Unit =
      PFNGLUNIFORM1DPROC.invoke(GLCore.glad_debug_glUniform1d(), location, x)

  public inline fun glUniform1dv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM1DVPROC.invoke(GLCore.glad_debug_glUniform1dv(), location, count, value)

  public inline fun glUniform1f(location: Int, v0: Float): Unit =
      PFNGLUNIFORM1FPROC.invoke(GLCore.glad_debug_glUniform1f(), location, v0)

  public inline fun glUniform1fARB(location: Int, v0: Float): Unit =
      PFNGLUNIFORM1FARBPROC.invoke(GLCore.glad_debug_glUniform1fARB(), location, v0)

  public inline fun glUniform1fv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM1FVPROC.invoke(GLCore.glad_debug_glUniform1fv(), location, count, value)

  public inline fun glUniform1fvARB(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM1FVARBPROC.invoke(GLCore.glad_debug_glUniform1fvARB(), location, count,
      value)

  public inline fun glUniform1i(location: Int, v0: Int): Unit =
      PFNGLUNIFORM1IPROC.invoke(GLCore.glad_debug_glUniform1i(), location, v0)

  public inline fun glUniform1iARB(location: Int, v0: Int): Unit =
      PFNGLUNIFORM1IARBPROC.invoke(GLCore.glad_debug_glUniform1iARB(), location, v0)

  public inline fun glUniform1iv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM1IVPROC.invoke(GLCore.glad_debug_glUniform1iv(), location, count, value)

  public inline fun glUniform1ivARB(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM1IVARBPROC.invoke(GLCore.glad_debug_glUniform1ivARB(), location, count,
      value)

  public inline fun glUniform1ui(location: Int, v0: Int): Unit =
      PFNGLUNIFORM1UIPROC.invoke(GLCore.glad_debug_glUniform1ui(), location, v0)

  public inline fun glUniform1uiEXT(location: Int, v0: Int): Unit =
      PFNGLUNIFORM1UIEXTPROC.invoke(GLCore.glad_debug_glUniform1uiEXT(), location, v0)

  public inline fun glUniform1uiv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM1UIVPROC.invoke(GLCore.glad_debug_glUniform1uiv(), location, count, value)

  public inline fun glUniform1uivEXT(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM1UIVEXTPROC.invoke(GLCore.glad_debug_glUniform1uivEXT(), location, count,
      value)

  public inline fun glUniform2d(
    location: Int,
    x: Double,
    y: Double,
  ): Unit = PFNGLUNIFORM2DPROC.invoke(GLCore.glad_debug_glUniform2d(), location, x, y)

  public inline fun glUniform2dv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM2DVPROC.invoke(GLCore.glad_debug_glUniform2dv(), location, count, value)

  public inline fun glUniform2f(
    location: Int,
    v0: Float,
    v1: Float,
  ): Unit = PFNGLUNIFORM2FPROC.invoke(GLCore.glad_debug_glUniform2f(), location, v0, v1)

  public inline fun glUniform2fARB(
    location: Int,
    v0: Float,
    v1: Float,
  ): Unit = PFNGLUNIFORM2FARBPROC.invoke(GLCore.glad_debug_glUniform2fARB(), location, v0, v1)

  public inline fun glUniform2fv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM2FVPROC.invoke(GLCore.glad_debug_glUniform2fv(), location, count, value)

  public inline fun glUniform2fvARB(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM2FVARBPROC.invoke(GLCore.glad_debug_glUniform2fvARB(), location, count,
      value)

  public inline fun glUniform2i(
    location: Int,
    v0: Int,
    v1: Int,
  ): Unit = PFNGLUNIFORM2IPROC.invoke(GLCore.glad_debug_glUniform2i(), location, v0, v1)

  public inline fun glUniform2iARB(
    location: Int,
    v0: Int,
    v1: Int,
  ): Unit = PFNGLUNIFORM2IARBPROC.invoke(GLCore.glad_debug_glUniform2iARB(), location, v0, v1)

  public inline fun glUniform2iv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM2IVPROC.invoke(GLCore.glad_debug_glUniform2iv(), location, count, value)

  public inline fun glUniform2ivARB(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM2IVARBPROC.invoke(GLCore.glad_debug_glUniform2ivARB(), location, count,
      value)

  public inline fun glUniform2ui(
    location: Int,
    v0: Int,
    v1: Int,
  ): Unit = PFNGLUNIFORM2UIPROC.invoke(GLCore.glad_debug_glUniform2ui(), location, v0, v1)

  public inline fun glUniform2uiEXT(
    location: Int,
    v0: Int,
    v1: Int,
  ): Unit = PFNGLUNIFORM2UIEXTPROC.invoke(GLCore.glad_debug_glUniform2uiEXT(), location, v0, v1)

  public inline fun glUniform2uiv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM2UIVPROC.invoke(GLCore.glad_debug_glUniform2uiv(), location, count, value)

  public inline fun glUniform2uivEXT(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM2UIVEXTPROC.invoke(GLCore.glad_debug_glUniform2uivEXT(), location, count,
      value)

  public inline fun glUniform3d(
    location: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLUNIFORM3DPROC.invoke(GLCore.glad_debug_glUniform3d(), location, x, y, z)

  public inline fun glUniform3dv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM3DVPROC.invoke(GLCore.glad_debug_glUniform3dv(), location, count, value)

  public inline fun glUniform3f(
    location: Int,
    v0: Float,
    v1: Float,
    v2: Float,
  ): Unit = PFNGLUNIFORM3FPROC.invoke(GLCore.glad_debug_glUniform3f(), location, v0, v1, v2)

  public inline fun glUniform3fARB(
    location: Int,
    v0: Float,
    v1: Float,
    v2: Float,
  ): Unit = PFNGLUNIFORM3FARBPROC.invoke(GLCore.glad_debug_glUniform3fARB(), location, v0, v1, v2)

  public inline fun glUniform3fv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM3FVPROC.invoke(GLCore.glad_debug_glUniform3fv(), location, count, value)

  public inline fun glUniform3fvARB(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM3FVARBPROC.invoke(GLCore.glad_debug_glUniform3fvARB(), location, count,
      value)

  public inline fun glUniform3i(
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
  ): Unit = PFNGLUNIFORM3IPROC.invoke(GLCore.glad_debug_glUniform3i(), location, v0, v1, v2)

  public inline fun glUniform3iARB(
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
  ): Unit = PFNGLUNIFORM3IARBPROC.invoke(GLCore.glad_debug_glUniform3iARB(), location, v0, v1, v2)

  public inline fun glUniform3iv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM3IVPROC.invoke(GLCore.glad_debug_glUniform3iv(), location, count, value)

  public inline fun glUniform3ivARB(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM3IVARBPROC.invoke(GLCore.glad_debug_glUniform3ivARB(), location, count,
      value)

  public inline fun glUniform3ui(
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
  ): Unit = PFNGLUNIFORM3UIPROC.invoke(GLCore.glad_debug_glUniform3ui(), location, v0, v1, v2)

  public inline fun glUniform3uiEXT(
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
  ): Unit = PFNGLUNIFORM3UIEXTPROC.invoke(GLCore.glad_debug_glUniform3uiEXT(), location, v0, v1, v2)

  public inline fun glUniform3uiv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM3UIVPROC.invoke(GLCore.glad_debug_glUniform3uiv(), location, count, value)

  public inline fun glUniform3uivEXT(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM3UIVEXTPROC.invoke(GLCore.glad_debug_glUniform3uivEXT(), location, count,
      value)

  public inline fun glUniform4d(
    location: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLUNIFORM4DPROC.invoke(GLCore.glad_debug_glUniform4d(), location, x, y, z, w)

  public inline fun glUniform4dv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM4DVPROC.invoke(GLCore.glad_debug_glUniform4dv(), location, count, value)

  public inline fun glUniform4f(
    location: Int,
    v0: Float,
    v1: Float,
    v2: Float,
    v3: Float,
  ): Unit = PFNGLUNIFORM4FPROC.invoke(GLCore.glad_debug_glUniform4f(), location, v0, v1, v2, v3)

  public inline fun glUniform4fARB(
    location: Int,
    v0: Float,
    v1: Float,
    v2: Float,
    v3: Float,
  ): Unit = PFNGLUNIFORM4FARBPROC.invoke(GLCore.glad_debug_glUniform4fARB(), location, v0, v1, v2,
      v3)

  public inline fun glUniform4fv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM4FVPROC.invoke(GLCore.glad_debug_glUniform4fv(), location, count, value)

  public inline fun glUniform4fvARB(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM4FVARBPROC.invoke(GLCore.glad_debug_glUniform4fvARB(), location, count,
      value)

  public inline fun glUniform4i(
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
  ): Unit = PFNGLUNIFORM4IPROC.invoke(GLCore.glad_debug_glUniform4i(), location, v0, v1, v2, v3)

  public inline fun glUniform4iARB(
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
  ): Unit = PFNGLUNIFORM4IARBPROC.invoke(GLCore.glad_debug_glUniform4iARB(), location, v0, v1, v2,
      v3)

  public inline fun glUniform4iv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM4IVPROC.invoke(GLCore.glad_debug_glUniform4iv(), location, count, value)

  public inline fun glUniform4ivARB(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM4IVARBPROC.invoke(GLCore.glad_debug_glUniform4ivARB(), location, count,
      value)

  public inline fun glUniform4ui(
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
  ): Unit = PFNGLUNIFORM4UIPROC.invoke(GLCore.glad_debug_glUniform4ui(), location, v0, v1, v2, v3)

  public inline fun glUniform4uiEXT(
    location: Int,
    v0: Int,
    v1: Int,
    v2: Int,
    v3: Int,
  ): Unit = PFNGLUNIFORM4UIEXTPROC.invoke(GLCore.glad_debug_glUniform4uiEXT(), location, v0, v1, v2,
      v3)

  public inline fun glUniform4uiv(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM4UIVPROC.invoke(GLCore.glad_debug_glUniform4uiv(), location, count, value)

  public inline fun glUniform4uivEXT(
    location: Int,
    count: Int,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORM4UIVEXTPROC.invoke(GLCore.glad_debug_glUniform4uivEXT(), location, count,
      value)

  public inline fun glUniformBlockBinding(
    program: Int,
    uniformBlockIndex: Int,
    uniformBlockBinding: Int,
  ): Unit = PFNGLUNIFORMBLOCKBINDINGPROC.invoke(GLCore.glad_debug_glUniformBlockBinding(), program,
      uniformBlockIndex, uniformBlockBinding)

  public inline fun glUniformMatrix2dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX2DVPROC.invoke(GLCore.glad_debug_glUniformMatrix2dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix2fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX2FVPROC.invoke(GLCore.glad_debug_glUniformMatrix2fv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix2fvARB(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX2FVARBPROC.invoke(GLCore.glad_debug_glUniformMatrix2fvARB(), location,
      count, transpose, value)

  public inline fun glUniformMatrix2x3dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX2X3DVPROC.invoke(GLCore.glad_debug_glUniformMatrix2x3dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix2x3fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX2X3FVPROC.invoke(GLCore.glad_debug_glUniformMatrix2x3fv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix2x4dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX2X4DVPROC.invoke(GLCore.glad_debug_glUniformMatrix2x4dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix2x4fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX2X4FVPROC.invoke(GLCore.glad_debug_glUniformMatrix2x4fv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix3dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX3DVPROC.invoke(GLCore.glad_debug_glUniformMatrix3dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix3fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX3FVPROC.invoke(GLCore.glad_debug_glUniformMatrix3fv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix3fvARB(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX3FVARBPROC.invoke(GLCore.glad_debug_glUniformMatrix3fvARB(), location,
      count, transpose, value)

  public inline fun glUniformMatrix3x2dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX3X2DVPROC.invoke(GLCore.glad_debug_glUniformMatrix3x2dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix3x2fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX3X2FVPROC.invoke(GLCore.glad_debug_glUniformMatrix3x2fv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix3x4dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX3X4DVPROC.invoke(GLCore.glad_debug_glUniformMatrix3x4dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix3x4fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX3X4FVPROC.invoke(GLCore.glad_debug_glUniformMatrix3x4fv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix4dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX4DVPROC.invoke(GLCore.glad_debug_glUniformMatrix4dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix4fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX4FVPROC.invoke(GLCore.glad_debug_glUniformMatrix4fv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix4fvARB(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX4FVARBPROC.invoke(GLCore.glad_debug_glUniformMatrix4fvARB(), location,
      count, transpose, value)

  public inline fun glUniformMatrix4x2dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX4X2DVPROC.invoke(GLCore.glad_debug_glUniformMatrix4x2dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix4x2fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX4X2FVPROC.invoke(GLCore.glad_debug_glUniformMatrix4x2fv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix4x3dv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX4X3DVPROC.invoke(GLCore.glad_debug_glUniformMatrix4x3dv(), location,
      count, transpose, value)

  public inline fun glUniformMatrix4x3fv(
    location: Int,
    count: Int,
    transpose: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLUNIFORMMATRIX4X3FVPROC.invoke(GLCore.glad_debug_glUniformMatrix4x3fv(), location,
      count, transpose, value)

  public inline fun glUniformSubroutinesuiv(
    shadertype: Int,
    count: Int,
    indices: MemorySegment,
  ): Unit = PFNGLUNIFORMSUBROUTINESUIVPROC.invoke(GLCore.glad_debug_glUniformSubroutinesuiv(),
      shadertype, count, indices)

  public inline fun glUnmapBuffer(target: Int): Byte =
      PFNGLUNMAPBUFFERPROC.invoke(GLCore.glad_debug_glUnmapBuffer(), target)

  public inline fun glUnmapBufferARB(target: Int): Byte =
      PFNGLUNMAPBUFFERARBPROC.invoke(GLCore.glad_debug_glUnmapBufferARB(), target)

  public inline fun glUnmapNamedBuffer(buffer: Int): Byte =
      PFNGLUNMAPNAMEDBUFFERPROC.invoke(GLCore.glad_debug_glUnmapNamedBuffer(), buffer)

  public inline fun glUnmapNamedBufferEXT(buffer: Int): Byte =
      PFNGLUNMAPNAMEDBUFFEREXTPROC.invoke(GLCore.glad_debug_glUnmapNamedBufferEXT(), buffer)

  public inline fun glUseProgram(program: Int): Unit =
      PFNGLUSEPROGRAMPROC.invoke(GLCore.glad_debug_glUseProgram(), program)

  public inline fun glUseProgramObjectARB(programObj: Int): Unit =
      PFNGLUSEPROGRAMOBJECTARBPROC.invoke(GLCore.glad_debug_glUseProgramObjectARB(), programObj)

  public inline fun glUseProgramStages(
    pipeline: Int,
    stages: Int,
    program: Int,
  ): Unit = PFNGLUSEPROGRAMSTAGESPROC.invoke(GLCore.glad_debug_glUseProgramStages(), pipeline,
      stages, program)

  public inline fun glValidateProgram(program: Int): Unit =
      PFNGLVALIDATEPROGRAMPROC.invoke(GLCore.glad_debug_glValidateProgram(), program)

  public inline fun glValidateProgramARB(programObj: Int): Unit =
      PFNGLVALIDATEPROGRAMARBPROC.invoke(GLCore.glad_debug_glValidateProgramARB(), programObj)

  public inline fun glValidateProgramPipeline(pipeline: Int): Unit =
      PFNGLVALIDATEPROGRAMPIPELINEPROC.invoke(GLCore.glad_debug_glValidateProgramPipeline(),
      pipeline)

  public inline fun glVertex2d(x: Double, y: Double): Unit =
      PFNGLVERTEX2DPROC.invoke(GLCore.glad_debug_glVertex2d(), x, y)

  public inline fun glVertex2dv(v: MemorySegment): Unit =
      PFNGLVERTEX2DVPROC.invoke(GLCore.glad_debug_glVertex2dv(), v)

  public inline fun glVertex2f(x: Float, y: Float): Unit =
      PFNGLVERTEX2FPROC.invoke(GLCore.glad_debug_glVertex2f(), x, y)

  public inline fun glVertex2fv(v: MemorySegment): Unit =
      PFNGLVERTEX2FVPROC.invoke(GLCore.glad_debug_glVertex2fv(), v)

  public inline fun glVertex2i(x: Int, y: Int): Unit =
      PFNGLVERTEX2IPROC.invoke(GLCore.glad_debug_glVertex2i(), x, y)

  public inline fun glVertex2iv(v: MemorySegment): Unit =
      PFNGLVERTEX2IVPROC.invoke(GLCore.glad_debug_glVertex2iv(), v)

  public inline fun glVertex2s(x: Short, y: Short): Unit =
      PFNGLVERTEX2SPROC.invoke(GLCore.glad_debug_glVertex2s(), x, y)

  public inline fun glVertex2sv(v: MemorySegment): Unit =
      PFNGLVERTEX2SVPROC.invoke(GLCore.glad_debug_glVertex2sv(), v)

  public inline fun glVertex3d(
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLVERTEX3DPROC.invoke(GLCore.glad_debug_glVertex3d(), x, y, z)

  public inline fun glVertex3dv(v: MemorySegment): Unit =
      PFNGLVERTEX3DVPROC.invoke(GLCore.glad_debug_glVertex3dv(), v)

  public inline fun glVertex3f(
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLVERTEX3FPROC.invoke(GLCore.glad_debug_glVertex3f(), x, y, z)

  public inline fun glVertex3fv(v: MemorySegment): Unit =
      PFNGLVERTEX3FVPROC.invoke(GLCore.glad_debug_glVertex3fv(), v)

  public inline fun glVertex3i(
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLVERTEX3IPROC.invoke(GLCore.glad_debug_glVertex3i(), x, y, z)

  public inline fun glVertex3iv(v: MemorySegment): Unit =
      PFNGLVERTEX3IVPROC.invoke(GLCore.glad_debug_glVertex3iv(), v)

  public inline fun glVertex3s(
    x: Short,
    y: Short,
    z: Short,
  ): Unit = PFNGLVERTEX3SPROC.invoke(GLCore.glad_debug_glVertex3s(), x, y, z)

  public inline fun glVertex3sv(v: MemorySegment): Unit =
      PFNGLVERTEX3SVPROC.invoke(GLCore.glad_debug_glVertex3sv(), v)

  public inline fun glVertex4d(
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLVERTEX4DPROC.invoke(GLCore.glad_debug_glVertex4d(), x, y, z, w)

  public inline fun glVertex4dv(v: MemorySegment): Unit =
      PFNGLVERTEX4DVPROC.invoke(GLCore.glad_debug_glVertex4dv(), v)

  public inline fun glVertex4f(
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit = PFNGLVERTEX4FPROC.invoke(GLCore.glad_debug_glVertex4f(), x, y, z, w)

  public inline fun glVertex4fv(v: MemorySegment): Unit =
      PFNGLVERTEX4FVPROC.invoke(GLCore.glad_debug_glVertex4fv(), v)

  public inline fun glVertex4i(
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit = PFNGLVERTEX4IPROC.invoke(GLCore.glad_debug_glVertex4i(), x, y, z, w)

  public inline fun glVertex4iv(v: MemorySegment): Unit =
      PFNGLVERTEX4IVPROC.invoke(GLCore.glad_debug_glVertex4iv(), v)

  public inline fun glVertex4s(
    x: Short,
    y: Short,
    z: Short,
    w: Short,
  ): Unit = PFNGLVERTEX4SPROC.invoke(GLCore.glad_debug_glVertex4s(), x, y, z, w)

  public inline fun glVertex4sv(v: MemorySegment): Unit =
      PFNGLVERTEX4SVPROC.invoke(GLCore.glad_debug_glVertex4sv(), v)

  public inline fun glVertexArrayAttribBinding(
    vaobj: Int,
    attribindex: Int,
    bindingindex: Int,
  ): Unit = PFNGLVERTEXARRAYATTRIBBINDINGPROC.invoke(GLCore.glad_debug_glVertexArrayAttribBinding(),
      vaobj, attribindex, bindingindex)

  public inline fun glVertexArrayAttribFormat(
    vaobj: Int,
    attribindex: Int,
    size: Int,
    type: Int,
    normalized: Byte,
    relativeoffset: Int,
  ): Unit = PFNGLVERTEXARRAYATTRIBFORMATPROC.invoke(GLCore.glad_debug_glVertexArrayAttribFormat(),
      vaobj, attribindex, size, type, normalized, relativeoffset)

  public inline fun glVertexArrayAttribIFormat(
    vaobj: Int,
    attribindex: Int,
    size: Int,
    type: Int,
    relativeoffset: Int,
  ): Unit = PFNGLVERTEXARRAYATTRIBIFORMATPROC.invoke(GLCore.glad_debug_glVertexArrayAttribIFormat(),
      vaobj, attribindex, size, type, relativeoffset)

  public inline fun glVertexArrayAttribLFormat(
    vaobj: Int,
    attribindex: Int,
    size: Int,
    type: Int,
    relativeoffset: Int,
  ): Unit = PFNGLVERTEXARRAYATTRIBLFORMATPROC.invoke(GLCore.glad_debug_glVertexArrayAttribLFormat(),
      vaobj, attribindex, size, type, relativeoffset)

  public inline fun glVertexArrayBindVertexBufferEXT(
    vaobj: Int,
    bindingindex: Int,
    buffer: Int,
    offset: Long,
    stride: Int,
  ): Unit =
      PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC.invoke(GLCore.glad_debug_glVertexArrayBindVertexBufferEXT(),
      vaobj, bindingindex, buffer, offset, stride)

  public inline fun glVertexArrayBindingDivisor(
    vaobj: Int,
    bindingindex: Int,
    divisor: Int,
  ): Unit =
      PFNGLVERTEXARRAYBINDINGDIVISORPROC.invoke(GLCore.glad_debug_glVertexArrayBindingDivisor(),
      vaobj, bindingindex, divisor)

  public inline fun glVertexArrayColorOffsetEXT(
    vaobj: Int,
    buffer: Int,
    size: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYCOLOROFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayColorOffsetEXT(),
      vaobj, buffer, size, type, stride, offset)

  public inline fun glVertexArrayEdgeFlagOffsetEXT(
    vaobj: Int,
    buffer: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayEdgeFlagOffsetEXT(),
      vaobj, buffer, stride, offset)

  public inline fun glVertexArrayElementBuffer(vaobj: Int, buffer: Int): Unit =
      PFNGLVERTEXARRAYELEMENTBUFFERPROC.invoke(GLCore.glad_debug_glVertexArrayElementBuffer(),
      vaobj, buffer)

  public inline fun glVertexArrayFogCoordOffsetEXT(
    vaobj: Int,
    buffer: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayFogCoordOffsetEXT(),
      vaobj, buffer, type, stride, offset)

  public inline fun glVertexArrayIndexOffsetEXT(
    vaobj: Int,
    buffer: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYINDEXOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayIndexOffsetEXT(),
      vaobj, buffer, type, stride, offset)

  public inline fun glVertexArrayMultiTexCoordOffsetEXT(
    vaobj: Int,
    buffer: Int,
    texunit: Int,
    size: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYMULTITEXCOORDOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayMultiTexCoordOffsetEXT(),
      vaobj, buffer, texunit, size, type, stride, offset)

  public inline fun glVertexArrayNormalOffsetEXT(
    vaobj: Int,
    buffer: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYNORMALOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayNormalOffsetEXT(),
      vaobj, buffer, type, stride, offset)

  public inline fun glVertexArraySecondaryColorOffsetEXT(
    vaobj: Int,
    buffer: Int,
    size: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArraySecondaryColorOffsetEXT(),
      vaobj, buffer, size, type, stride, offset)

  public inline fun glVertexArrayTexCoordOffsetEXT(
    vaobj: Int,
    buffer: Int,
    size: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYTEXCOORDOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayTexCoordOffsetEXT(),
      vaobj, buffer, size, type, stride, offset)

  public inline fun glVertexArrayVertexAttribBindingEXT(
    vaobj: Int,
    attribindex: Int,
    bindingindex: Int,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexAttribBindingEXT(),
      vaobj, attribindex, bindingindex)

  public inline fun glVertexArrayVertexAttribDivisorEXT(
    vaobj: Int,
    index: Int,
    divisor: Int,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexAttribDivisorEXT(),
      vaobj, index, divisor)

  public inline fun glVertexArrayVertexAttribFormatEXT(
    vaobj: Int,
    attribindex: Int,
    size: Int,
    type: Int,
    normalized: Byte,
    relativeoffset: Int,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexAttribFormatEXT(),
      vaobj, attribindex, size, type, normalized, relativeoffset)

  public inline fun glVertexArrayVertexAttribIFormatEXT(
    vaobj: Int,
    attribindex: Int,
    size: Int,
    type: Int,
    relativeoffset: Int,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexAttribIFormatEXT(),
      vaobj, attribindex, size, type, relativeoffset)

  public inline fun glVertexArrayVertexAttribIOffsetEXT(
    vaobj: Int,
    buffer: Int,
    index: Int,
    size: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXATTRIBIOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexAttribIOffsetEXT(),
      vaobj, buffer, index, size, type, stride, offset)

  public inline fun glVertexArrayVertexAttribLFormatEXT(
    vaobj: Int,
    attribindex: Int,
    size: Int,
    type: Int,
    relativeoffset: Int,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexAttribLFormatEXT(),
      vaobj, attribindex, size, type, relativeoffset)

  public inline fun glVertexArrayVertexAttribLOffsetEXT(
    vaobj: Int,
    buffer: Int,
    index: Int,
    size: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexAttribLOffsetEXT(),
      vaobj, buffer, index, size, type, stride, offset)

  public inline fun glVertexArrayVertexAttribOffsetEXT(
    vaobj: Int,
    buffer: Int,
    index: Int,
    size: Int,
    type: Int,
    normalized: Byte,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexAttribOffsetEXT(),
      vaobj, buffer, index, size, type, normalized, stride, offset)

  public inline fun glVertexArrayVertexBindingDivisorEXT(
    vaobj: Int,
    bindingindex: Int,
    divisor: Int,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXBINDINGDIVISOREXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexBindingDivisorEXT(),
      vaobj, bindingindex, divisor)

  public inline fun glVertexArrayVertexBuffer(
    vaobj: Int,
    bindingindex: Int,
    buffer: Int,
    offset: Long,
    stride: Int,
  ): Unit = PFNGLVERTEXARRAYVERTEXBUFFERPROC.invoke(GLCore.glad_debug_glVertexArrayVertexBuffer(),
      vaobj, bindingindex, buffer, offset, stride)

  public inline fun glVertexArrayVertexBuffers(
    vaobj: Int,
    first: Int,
    count: Int,
    buffers: MemorySegment,
    offsets: MemorySegment,
    strides: MemorySegment,
  ): Unit = PFNGLVERTEXARRAYVERTEXBUFFERSPROC.invoke(GLCore.glad_debug_glVertexArrayVertexBuffers(),
      vaobj, first, count, buffers, offsets, strides)

  public inline fun glVertexArrayVertexOffsetEXT(
    vaobj: Int,
    buffer: Int,
    size: Int,
    type: Int,
    stride: Int,
    offset: Long,
  ): Unit =
      PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC.invoke(GLCore.glad_debug_glVertexArrayVertexOffsetEXT(),
      vaobj, buffer, size, type, stride, offset)

  public inline fun glVertexAttrib1d(index: Int, x: Double): Unit =
      PFNGLVERTEXATTRIB1DPROC.invoke(GLCore.glad_debug_glVertexAttrib1d(), index, x)

  public inline fun glVertexAttrib1dARB(index: Int, x: Double): Unit =
      PFNGLVERTEXATTRIB1DARBPROC.invoke(GLCore.glad_debug_glVertexAttrib1dARB(), index, x)

  public inline fun glVertexAttrib1dNV(index: Int, x: Double): Unit =
      PFNGLVERTEXATTRIB1DNVPROC.invoke(GLCore.glad_debug_glVertexAttrib1dNV(), index, x)

  public inline fun glVertexAttrib1dv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1DVPROC.invoke(GLCore.glad_debug_glVertexAttrib1dv(), index, v)

  public inline fun glVertexAttrib1dvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1DVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib1dvARB(), index, v)

  public inline fun glVertexAttrib1dvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1DVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib1dvNV(), index, v)

  public inline fun glVertexAttrib1f(index: Int, x: Float): Unit =
      PFNGLVERTEXATTRIB1FPROC.invoke(GLCore.glad_debug_glVertexAttrib1f(), index, x)

  public inline fun glVertexAttrib1fARB(index: Int, x: Float): Unit =
      PFNGLVERTEXATTRIB1FARBPROC.invoke(GLCore.glad_debug_glVertexAttrib1fARB(), index, x)

  public inline fun glVertexAttrib1fNV(index: Int, x: Float): Unit =
      PFNGLVERTEXATTRIB1FNVPROC.invoke(GLCore.glad_debug_glVertexAttrib1fNV(), index, x)

  public inline fun glVertexAttrib1fv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1FVPROC.invoke(GLCore.glad_debug_glVertexAttrib1fv(), index, v)

  public inline fun glVertexAttrib1fvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1FVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib1fvARB(), index, v)

  public inline fun glVertexAttrib1fvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1FVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib1fvNV(), index, v)

  public inline fun glVertexAttrib1s(index: Int, x: Short): Unit =
      PFNGLVERTEXATTRIB1SPROC.invoke(GLCore.glad_debug_glVertexAttrib1s(), index, x)

  public inline fun glVertexAttrib1sARB(index: Int, x: Short): Unit =
      PFNGLVERTEXATTRIB1SARBPROC.invoke(GLCore.glad_debug_glVertexAttrib1sARB(), index, x)

  public inline fun glVertexAttrib1sNV(index: Int, x: Short): Unit =
      PFNGLVERTEXATTRIB1SNVPROC.invoke(GLCore.glad_debug_glVertexAttrib1sNV(), index, x)

  public inline fun glVertexAttrib1sv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1SVPROC.invoke(GLCore.glad_debug_glVertexAttrib1sv(), index, v)

  public inline fun glVertexAttrib1svARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1SVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib1svARB(), index, v)

  public inline fun glVertexAttrib1svNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB1SVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib1svNV(), index, v)

  public inline fun glVertexAttrib2d(
    index: Int,
    x: Double,
    y: Double,
  ): Unit = PFNGLVERTEXATTRIB2DPROC.invoke(GLCore.glad_debug_glVertexAttrib2d(), index, x, y)

  public inline fun glVertexAttrib2dARB(
    index: Int,
    x: Double,
    y: Double,
  ): Unit = PFNGLVERTEXATTRIB2DARBPROC.invoke(GLCore.glad_debug_glVertexAttrib2dARB(), index, x, y)

  public inline fun glVertexAttrib2dNV(
    index: Int,
    x: Double,
    y: Double,
  ): Unit = PFNGLVERTEXATTRIB2DNVPROC.invoke(GLCore.glad_debug_glVertexAttrib2dNV(), index, x, y)

  public inline fun glVertexAttrib2dv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2DVPROC.invoke(GLCore.glad_debug_glVertexAttrib2dv(), index, v)

  public inline fun glVertexAttrib2dvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2DVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib2dvARB(), index, v)

  public inline fun glVertexAttrib2dvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2DVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib2dvNV(), index, v)

  public inline fun glVertexAttrib2f(
    index: Int,
    x: Float,
    y: Float,
  ): Unit = PFNGLVERTEXATTRIB2FPROC.invoke(GLCore.glad_debug_glVertexAttrib2f(), index, x, y)

  public inline fun glVertexAttrib2fARB(
    index: Int,
    x: Float,
    y: Float,
  ): Unit = PFNGLVERTEXATTRIB2FARBPROC.invoke(GLCore.glad_debug_glVertexAttrib2fARB(), index, x, y)

  public inline fun glVertexAttrib2fNV(
    index: Int,
    x: Float,
    y: Float,
  ): Unit = PFNGLVERTEXATTRIB2FNVPROC.invoke(GLCore.glad_debug_glVertexAttrib2fNV(), index, x, y)

  public inline fun glVertexAttrib2fv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2FVPROC.invoke(GLCore.glad_debug_glVertexAttrib2fv(), index, v)

  public inline fun glVertexAttrib2fvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2FVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib2fvARB(), index, v)

  public inline fun glVertexAttrib2fvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2FVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib2fvNV(), index, v)

  public inline fun glVertexAttrib2s(
    index: Int,
    x: Short,
    y: Short,
  ): Unit = PFNGLVERTEXATTRIB2SPROC.invoke(GLCore.glad_debug_glVertexAttrib2s(), index, x, y)

  public inline fun glVertexAttrib2sARB(
    index: Int,
    x: Short,
    y: Short,
  ): Unit = PFNGLVERTEXATTRIB2SARBPROC.invoke(GLCore.glad_debug_glVertexAttrib2sARB(), index, x, y)

  public inline fun glVertexAttrib2sNV(
    index: Int,
    x: Short,
    y: Short,
  ): Unit = PFNGLVERTEXATTRIB2SNVPROC.invoke(GLCore.glad_debug_glVertexAttrib2sNV(), index, x, y)

  public inline fun glVertexAttrib2sv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2SVPROC.invoke(GLCore.glad_debug_glVertexAttrib2sv(), index, v)

  public inline fun glVertexAttrib2svARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2SVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib2svARB(), index, v)

  public inline fun glVertexAttrib2svNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB2SVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib2svNV(), index, v)

  public inline fun glVertexAttrib3d(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLVERTEXATTRIB3DPROC.invoke(GLCore.glad_debug_glVertexAttrib3d(), index, x, y, z)

  public inline fun glVertexAttrib3dARB(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLVERTEXATTRIB3DARBPROC.invoke(GLCore.glad_debug_glVertexAttrib3dARB(), index, x, y,
      z)

  public inline fun glVertexAttrib3dNV(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLVERTEXATTRIB3DNVPROC.invoke(GLCore.glad_debug_glVertexAttrib3dNV(), index, x, y, z)

  public inline fun glVertexAttrib3dv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3DVPROC.invoke(GLCore.glad_debug_glVertexAttrib3dv(), index, v)

  public inline fun glVertexAttrib3dvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3DVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib3dvARB(), index, v)

  public inline fun glVertexAttrib3dvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3DVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib3dvNV(), index, v)

  public inline fun glVertexAttrib3f(
    index: Int,
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLVERTEXATTRIB3FPROC.invoke(GLCore.glad_debug_glVertexAttrib3f(), index, x, y, z)

  public inline fun glVertexAttrib3fARB(
    index: Int,
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLVERTEXATTRIB3FARBPROC.invoke(GLCore.glad_debug_glVertexAttrib3fARB(), index, x, y,
      z)

  public inline fun glVertexAttrib3fNV(
    index: Int,
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLVERTEXATTRIB3FNVPROC.invoke(GLCore.glad_debug_glVertexAttrib3fNV(), index, x, y, z)

  public inline fun glVertexAttrib3fv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3FVPROC.invoke(GLCore.glad_debug_glVertexAttrib3fv(), index, v)

  public inline fun glVertexAttrib3fvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3FVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib3fvARB(), index, v)

  public inline fun glVertexAttrib3fvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3FVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib3fvNV(), index, v)

  public inline fun glVertexAttrib3s(
    index: Int,
    x: Short,
    y: Short,
    z: Short,
  ): Unit = PFNGLVERTEXATTRIB3SPROC.invoke(GLCore.glad_debug_glVertexAttrib3s(), index, x, y, z)

  public inline fun glVertexAttrib3sARB(
    index: Int,
    x: Short,
    y: Short,
    z: Short,
  ): Unit = PFNGLVERTEXATTRIB3SARBPROC.invoke(GLCore.glad_debug_glVertexAttrib3sARB(), index, x, y,
      z)

  public inline fun glVertexAttrib3sNV(
    index: Int,
    x: Short,
    y: Short,
    z: Short,
  ): Unit = PFNGLVERTEXATTRIB3SNVPROC.invoke(GLCore.glad_debug_glVertexAttrib3sNV(), index, x, y, z)

  public inline fun glVertexAttrib3sv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3SVPROC.invoke(GLCore.glad_debug_glVertexAttrib3sv(), index, v)

  public inline fun glVertexAttrib3svARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3SVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib3svARB(), index, v)

  public inline fun glVertexAttrib3svNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB3SVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib3svNV(), index, v)

  public inline fun glVertexAttrib4Nbv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NBVPROC.invoke(GLCore.glad_debug_glVertexAttrib4Nbv(), index, v)

  public inline fun glVertexAttrib4NbvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NBVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4NbvARB(), index, v)

  public inline fun glVertexAttrib4Niv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NIVPROC.invoke(GLCore.glad_debug_glVertexAttrib4Niv(), index, v)

  public inline fun glVertexAttrib4NivARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NIVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4NivARB(), index, v)

  public inline fun glVertexAttrib4Nsv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NSVPROC.invoke(GLCore.glad_debug_glVertexAttrib4Nsv(), index, v)

  public inline fun glVertexAttrib4NsvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NSVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4NsvARB(), index, v)

  public inline fun glVertexAttrib4Nub(
    index: Int,
    x: Byte,
    y: Byte,
    z: Byte,
    w: Byte,
  ): Unit = PFNGLVERTEXATTRIB4NUBPROC.invoke(GLCore.glad_debug_glVertexAttrib4Nub(), index, x, y, z,
      w)

  public inline fun glVertexAttrib4NubARB(
    index: Int,
    x: Byte,
    y: Byte,
    z: Byte,
    w: Byte,
  ): Unit = PFNGLVERTEXATTRIB4NUBARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4NubARB(), index, x,
      y, z, w)

  public inline fun glVertexAttrib4Nubv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NUBVPROC.invoke(GLCore.glad_debug_glVertexAttrib4Nubv(), index, v)

  public inline fun glVertexAttrib4NubvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NUBVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4NubvARB(), index, v)

  public inline fun glVertexAttrib4Nuiv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NUIVPROC.invoke(GLCore.glad_debug_glVertexAttrib4Nuiv(), index, v)

  public inline fun glVertexAttrib4NuivARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NUIVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4NuivARB(), index, v)

  public inline fun glVertexAttrib4Nusv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NUSVPROC.invoke(GLCore.glad_debug_glVertexAttrib4Nusv(), index, v)

  public inline fun glVertexAttrib4NusvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4NUSVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4NusvARB(), index, v)

  public inline fun glVertexAttrib4bv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4BVPROC.invoke(GLCore.glad_debug_glVertexAttrib4bv(), index, v)

  public inline fun glVertexAttrib4bvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4BVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4bvARB(), index, v)

  public inline fun glVertexAttrib4d(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLVERTEXATTRIB4DPROC.invoke(GLCore.glad_debug_glVertexAttrib4d(), index, x, y, z, w)

  public inline fun glVertexAttrib4dARB(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLVERTEXATTRIB4DARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4dARB(), index, x, y,
      z, w)

  public inline fun glVertexAttrib4dNV(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLVERTEXATTRIB4DNVPROC.invoke(GLCore.glad_debug_glVertexAttrib4dNV(), index, x, y, z,
      w)

  public inline fun glVertexAttrib4dv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4DVPROC.invoke(GLCore.glad_debug_glVertexAttrib4dv(), index, v)

  public inline fun glVertexAttrib4dvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4DVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4dvARB(), index, v)

  public inline fun glVertexAttrib4dvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4DVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib4dvNV(), index, v)

  public inline fun glVertexAttrib4f(
    index: Int,
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit = PFNGLVERTEXATTRIB4FPROC.invoke(GLCore.glad_debug_glVertexAttrib4f(), index, x, y, z, w)

  public inline fun glVertexAttrib4fARB(
    index: Int,
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit = PFNGLVERTEXATTRIB4FARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4fARB(), index, x, y,
      z, w)

  public inline fun glVertexAttrib4fNV(
    index: Int,
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit = PFNGLVERTEXATTRIB4FNVPROC.invoke(GLCore.glad_debug_glVertexAttrib4fNV(), index, x, y, z,
      w)

  public inline fun glVertexAttrib4fv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4FVPROC.invoke(GLCore.glad_debug_glVertexAttrib4fv(), index, v)

  public inline fun glVertexAttrib4fvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4FVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4fvARB(), index, v)

  public inline fun glVertexAttrib4fvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4FVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib4fvNV(), index, v)

  public inline fun glVertexAttrib4iv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4IVPROC.invoke(GLCore.glad_debug_glVertexAttrib4iv(), index, v)

  public inline fun glVertexAttrib4ivARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4IVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4ivARB(), index, v)

  public inline fun glVertexAttrib4s(
    index: Int,
    x: Short,
    y: Short,
    z: Short,
    w: Short,
  ): Unit = PFNGLVERTEXATTRIB4SPROC.invoke(GLCore.glad_debug_glVertexAttrib4s(), index, x, y, z, w)

  public inline fun glVertexAttrib4sARB(
    index: Int,
    x: Short,
    y: Short,
    z: Short,
    w: Short,
  ): Unit = PFNGLVERTEXATTRIB4SARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4sARB(), index, x, y,
      z, w)

  public inline fun glVertexAttrib4sNV(
    index: Int,
    x: Short,
    y: Short,
    z: Short,
    w: Short,
  ): Unit = PFNGLVERTEXATTRIB4SNVPROC.invoke(GLCore.glad_debug_glVertexAttrib4sNV(), index, x, y, z,
      w)

  public inline fun glVertexAttrib4sv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4SVPROC.invoke(GLCore.glad_debug_glVertexAttrib4sv(), index, v)

  public inline fun glVertexAttrib4svARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4SVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4svARB(), index, v)

  public inline fun glVertexAttrib4svNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4SVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib4svNV(), index, v)

  public inline fun glVertexAttrib4ubNV(
    index: Int,
    x: Byte,
    y: Byte,
    z: Byte,
    w: Byte,
  ): Unit = PFNGLVERTEXATTRIB4UBNVPROC.invoke(GLCore.glad_debug_glVertexAttrib4ubNV(), index, x, y,
      z, w)

  public inline fun glVertexAttrib4ubv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4UBVPROC.invoke(GLCore.glad_debug_glVertexAttrib4ubv(), index, v)

  public inline fun glVertexAttrib4ubvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4UBVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4ubvARB(), index, v)

  public inline fun glVertexAttrib4ubvNV(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4UBVNVPROC.invoke(GLCore.glad_debug_glVertexAttrib4ubvNV(), index, v)

  public inline fun glVertexAttrib4uiv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4UIVPROC.invoke(GLCore.glad_debug_glVertexAttrib4uiv(), index, v)

  public inline fun glVertexAttrib4uivARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4UIVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4uivARB(), index, v)

  public inline fun glVertexAttrib4usv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4USVPROC.invoke(GLCore.glad_debug_glVertexAttrib4usv(), index, v)

  public inline fun glVertexAttrib4usvARB(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIB4USVARBPROC.invoke(GLCore.glad_debug_glVertexAttrib4usvARB(), index, v)

  public inline fun glVertexAttribBinding(attribindex: Int, bindingindex: Int): Unit =
      PFNGLVERTEXATTRIBBINDINGPROC.invoke(GLCore.glad_debug_glVertexAttribBinding(), attribindex,
      bindingindex)

  public inline fun glVertexAttribDivisor(index: Int, divisor: Int): Unit =
      PFNGLVERTEXATTRIBDIVISORPROC.invoke(GLCore.glad_debug_glVertexAttribDivisor(), index, divisor)

  public inline fun glVertexAttribDivisorARB(index: Int, divisor: Int): Unit =
      PFNGLVERTEXATTRIBDIVISORARBPROC.invoke(GLCore.glad_debug_glVertexAttribDivisorARB(), index,
      divisor)

  public inline fun glVertexAttribFormat(
    attribindex: Int,
    size: Int,
    type: Int,
    normalized: Byte,
    relativeoffset: Int,
  ): Unit = PFNGLVERTEXATTRIBFORMATPROC.invoke(GLCore.glad_debug_glVertexAttribFormat(),
      attribindex, size, type, normalized, relativeoffset)

  public inline fun glVertexAttribI1i(index: Int, x: Int): Unit =
      PFNGLVERTEXATTRIBI1IPROC.invoke(GLCore.glad_debug_glVertexAttribI1i(), index, x)

  public inline fun glVertexAttribI1iEXT(index: Int, x: Int): Unit =
      PFNGLVERTEXATTRIBI1IEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI1iEXT(), index, x)

  public inline fun glVertexAttribI1iv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI1IVPROC.invoke(GLCore.glad_debug_glVertexAttribI1iv(), index, v)

  public inline fun glVertexAttribI1ivEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI1IVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI1ivEXT(), index, v)

  public inline fun glVertexAttribI1ui(index: Int, x: Int): Unit =
      PFNGLVERTEXATTRIBI1UIPROC.invoke(GLCore.glad_debug_glVertexAttribI1ui(), index, x)

  public inline fun glVertexAttribI1uiEXT(index: Int, x: Int): Unit =
      PFNGLVERTEXATTRIBI1UIEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI1uiEXT(), index, x)

  public inline fun glVertexAttribI1uiv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI1UIVPROC.invoke(GLCore.glad_debug_glVertexAttribI1uiv(), index, v)

  public inline fun glVertexAttribI1uivEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI1UIVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI1uivEXT(), index, v)

  public inline fun glVertexAttribI2i(
    index: Int,
    x: Int,
    y: Int,
  ): Unit = PFNGLVERTEXATTRIBI2IPROC.invoke(GLCore.glad_debug_glVertexAttribI2i(), index, x, y)

  public inline fun glVertexAttribI2iEXT(
    index: Int,
    x: Int,
    y: Int,
  ): Unit = PFNGLVERTEXATTRIBI2IEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI2iEXT(), index, x,
      y)

  public inline fun glVertexAttribI2iv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI2IVPROC.invoke(GLCore.glad_debug_glVertexAttribI2iv(), index, v)

  public inline fun glVertexAttribI2ivEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI2IVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI2ivEXT(), index, v)

  public inline fun glVertexAttribI2ui(
    index: Int,
    x: Int,
    y: Int,
  ): Unit = PFNGLVERTEXATTRIBI2UIPROC.invoke(GLCore.glad_debug_glVertexAttribI2ui(), index, x, y)

  public inline fun glVertexAttribI2uiEXT(
    index: Int,
    x: Int,
    y: Int,
  ): Unit = PFNGLVERTEXATTRIBI2UIEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI2uiEXT(), index, x,
      y)

  public inline fun glVertexAttribI2uiv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI2UIVPROC.invoke(GLCore.glad_debug_glVertexAttribI2uiv(), index, v)

  public inline fun glVertexAttribI2uivEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI2UIVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI2uivEXT(), index, v)

  public inline fun glVertexAttribI3i(
    index: Int,
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLVERTEXATTRIBI3IPROC.invoke(GLCore.glad_debug_glVertexAttribI3i(), index, x, y, z)

  public inline fun glVertexAttribI3iEXT(
    index: Int,
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLVERTEXATTRIBI3IEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI3iEXT(), index, x,
      y, z)

  public inline fun glVertexAttribI3iv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI3IVPROC.invoke(GLCore.glad_debug_glVertexAttribI3iv(), index, v)

  public inline fun glVertexAttribI3ivEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI3IVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI3ivEXT(), index, v)

  public inline fun glVertexAttribI3ui(
    index: Int,
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLVERTEXATTRIBI3UIPROC.invoke(GLCore.glad_debug_glVertexAttribI3ui(), index, x, y, z)

  public inline fun glVertexAttribI3uiEXT(
    index: Int,
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLVERTEXATTRIBI3UIEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI3uiEXT(), index, x,
      y, z)

  public inline fun glVertexAttribI3uiv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI3UIVPROC.invoke(GLCore.glad_debug_glVertexAttribI3uiv(), index, v)

  public inline fun glVertexAttribI3uivEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI3UIVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI3uivEXT(), index, v)

  public inline fun glVertexAttribI4bv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4BVPROC.invoke(GLCore.glad_debug_glVertexAttribI4bv(), index, v)

  public inline fun glVertexAttribI4bvEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4BVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI4bvEXT(), index, v)

  public inline fun glVertexAttribI4i(
    index: Int,
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit = PFNGLVERTEXATTRIBI4IPROC.invoke(GLCore.glad_debug_glVertexAttribI4i(), index, x, y, z,
      w)

  public inline fun glVertexAttribI4iEXT(
    index: Int,
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit = PFNGLVERTEXATTRIBI4IEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI4iEXT(), index, x,
      y, z, w)

  public inline fun glVertexAttribI4iv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4IVPROC.invoke(GLCore.glad_debug_glVertexAttribI4iv(), index, v)

  public inline fun glVertexAttribI4ivEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4IVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI4ivEXT(), index, v)

  public inline fun glVertexAttribI4sv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4SVPROC.invoke(GLCore.glad_debug_glVertexAttribI4sv(), index, v)

  public inline fun glVertexAttribI4svEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4SVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI4svEXT(), index, v)

  public inline fun glVertexAttribI4ubv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4UBVPROC.invoke(GLCore.glad_debug_glVertexAttribI4ubv(), index, v)

  public inline fun glVertexAttribI4ubvEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4UBVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI4ubvEXT(), index, v)

  public inline fun glVertexAttribI4ui(
    index: Int,
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit = PFNGLVERTEXATTRIBI4UIPROC.invoke(GLCore.glad_debug_glVertexAttribI4ui(), index, x, y, z,
      w)

  public inline fun glVertexAttribI4uiEXT(
    index: Int,
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit = PFNGLVERTEXATTRIBI4UIEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI4uiEXT(), index, x,
      y, z, w)

  public inline fun glVertexAttribI4uiv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4UIVPROC.invoke(GLCore.glad_debug_glVertexAttribI4uiv(), index, v)

  public inline fun glVertexAttribI4uivEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4UIVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI4uivEXT(), index, v)

  public inline fun glVertexAttribI4usv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4USVPROC.invoke(GLCore.glad_debug_glVertexAttribI4usv(), index, v)

  public inline fun glVertexAttribI4usvEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBI4USVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribI4usvEXT(), index, v)

  public inline fun glVertexAttribIFormat(
    attribindex: Int,
    size: Int,
    type: Int,
    relativeoffset: Int,
  ): Unit = PFNGLVERTEXATTRIBIFORMATPROC.invoke(GLCore.glad_debug_glVertexAttribIFormat(),
      attribindex, size, type, relativeoffset)

  public inline fun glVertexAttribIPointer(
    index: Int,
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBIPOINTERPROC.invoke(GLCore.glad_debug_glVertexAttribIPointer(), index,
      size, type, stride, pointer)

  public inline fun glVertexAttribIPointerEXT(
    index: Int,
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBIPOINTEREXTPROC.invoke(GLCore.glad_debug_glVertexAttribIPointerEXT(),
      index, size, type, stride, pointer)

  public inline fun glVertexAttribL1d(index: Int, x: Double): Unit =
      PFNGLVERTEXATTRIBL1DPROC.invoke(GLCore.glad_debug_glVertexAttribL1d(), index, x)

  public inline fun glVertexAttribL1dEXT(index: Int, x: Double): Unit =
      PFNGLVERTEXATTRIBL1DEXTPROC.invoke(GLCore.glad_debug_glVertexAttribL1dEXT(), index, x)

  public inline fun glVertexAttribL1dv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBL1DVPROC.invoke(GLCore.glad_debug_glVertexAttribL1dv(), index, v)

  public inline fun glVertexAttribL1dvEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBL1DVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribL1dvEXT(), index, v)

  public inline fun glVertexAttribL2d(
    index: Int,
    x: Double,
    y: Double,
  ): Unit = PFNGLVERTEXATTRIBL2DPROC.invoke(GLCore.glad_debug_glVertexAttribL2d(), index, x, y)

  public inline fun glVertexAttribL2dEXT(
    index: Int,
    x: Double,
    y: Double,
  ): Unit = PFNGLVERTEXATTRIBL2DEXTPROC.invoke(GLCore.glad_debug_glVertexAttribL2dEXT(), index, x,
      y)

  public inline fun glVertexAttribL2dv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBL2DVPROC.invoke(GLCore.glad_debug_glVertexAttribL2dv(), index, v)

  public inline fun glVertexAttribL2dvEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBL2DVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribL2dvEXT(), index, v)

  public inline fun glVertexAttribL3d(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLVERTEXATTRIBL3DPROC.invoke(GLCore.glad_debug_glVertexAttribL3d(), index, x, y, z)

  public inline fun glVertexAttribL3dEXT(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLVERTEXATTRIBL3DEXTPROC.invoke(GLCore.glad_debug_glVertexAttribL3dEXT(), index, x,
      y, z)

  public inline fun glVertexAttribL3dv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBL3DVPROC.invoke(GLCore.glad_debug_glVertexAttribL3dv(), index, v)

  public inline fun glVertexAttribL3dvEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBL3DVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribL3dvEXT(), index, v)

  public inline fun glVertexAttribL4d(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLVERTEXATTRIBL4DPROC.invoke(GLCore.glad_debug_glVertexAttribL4d(), index, x, y, z,
      w)

  public inline fun glVertexAttribL4dEXT(
    index: Int,
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLVERTEXATTRIBL4DEXTPROC.invoke(GLCore.glad_debug_glVertexAttribL4dEXT(), index, x,
      y, z, w)

  public inline fun glVertexAttribL4dv(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBL4DVPROC.invoke(GLCore.glad_debug_glVertexAttribL4dv(), index, v)

  public inline fun glVertexAttribL4dvEXT(index: Int, v: MemorySegment): Unit =
      PFNGLVERTEXATTRIBL4DVEXTPROC.invoke(GLCore.glad_debug_glVertexAttribL4dvEXT(), index, v)

  public inline fun glVertexAttribLFormat(
    attribindex: Int,
    size: Int,
    type: Int,
    relativeoffset: Int,
  ): Unit = PFNGLVERTEXATTRIBLFORMATPROC.invoke(GLCore.glad_debug_glVertexAttribLFormat(),
      attribindex, size, type, relativeoffset)

  public inline fun glVertexAttribLPointer(
    index: Int,
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBLPOINTERPROC.invoke(GLCore.glad_debug_glVertexAttribLPointer(), index,
      size, type, stride, pointer)

  public inline fun glVertexAttribLPointerEXT(
    index: Int,
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBLPOINTEREXTPROC.invoke(GLCore.glad_debug_glVertexAttribLPointerEXT(),
      index, size, type, stride, pointer)

  public inline fun glVertexAttribP1ui(
    index: Int,
    type: Int,
    normalized: Byte,
    `value`: Int,
  ): Unit = PFNGLVERTEXATTRIBP1UIPROC.invoke(GLCore.glad_debug_glVertexAttribP1ui(), index, type,
      normalized, value)

  public inline fun glVertexAttribP1uiv(
    index: Int,
    type: Int,
    normalized: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBP1UIVPROC.invoke(GLCore.glad_debug_glVertexAttribP1uiv(), index, type,
      normalized, value)

  public inline fun glVertexAttribP2ui(
    index: Int,
    type: Int,
    normalized: Byte,
    `value`: Int,
  ): Unit = PFNGLVERTEXATTRIBP2UIPROC.invoke(GLCore.glad_debug_glVertexAttribP2ui(), index, type,
      normalized, value)

  public inline fun glVertexAttribP2uiv(
    index: Int,
    type: Int,
    normalized: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBP2UIVPROC.invoke(GLCore.glad_debug_glVertexAttribP2uiv(), index, type,
      normalized, value)

  public inline fun glVertexAttribP3ui(
    index: Int,
    type: Int,
    normalized: Byte,
    `value`: Int,
  ): Unit = PFNGLVERTEXATTRIBP3UIPROC.invoke(GLCore.glad_debug_glVertexAttribP3ui(), index, type,
      normalized, value)

  public inline fun glVertexAttribP3uiv(
    index: Int,
    type: Int,
    normalized: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBP3UIVPROC.invoke(GLCore.glad_debug_glVertexAttribP3uiv(), index, type,
      normalized, value)

  public inline fun glVertexAttribP4ui(
    index: Int,
    type: Int,
    normalized: Byte,
    `value`: Int,
  ): Unit = PFNGLVERTEXATTRIBP4UIPROC.invoke(GLCore.glad_debug_glVertexAttribP4ui(), index, type,
      normalized, value)

  public inline fun glVertexAttribP4uiv(
    index: Int,
    type: Int,
    normalized: Byte,
    `value`: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBP4UIVPROC.invoke(GLCore.glad_debug_glVertexAttribP4uiv(), index, type,
      normalized, value)

  public inline fun glVertexAttribPointer(
    index: Int,
    size: Int,
    type: Int,
    normalized: Byte,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBPOINTERPROC.invoke(GLCore.glad_debug_glVertexAttribPointer(), index,
      size, type, normalized, stride, pointer)

  public inline fun glVertexAttribPointerARB(
    index: Int,
    size: Int,
    type: Int,
    normalized: Byte,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBPOINTERARBPROC.invoke(GLCore.glad_debug_glVertexAttribPointerARB(),
      index, size, type, normalized, stride, pointer)

  public inline fun glVertexAttribPointerNV(
    index: Int,
    fsize: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBPOINTERNVPROC.invoke(GLCore.glad_debug_glVertexAttribPointerNV(),
      index, fsize, type, stride, pointer)

  public inline fun glVertexAttribs1dvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS1DVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs1dvNV(), index,
      count, v)

  public inline fun glVertexAttribs1fvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS1FVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs1fvNV(), index,
      count, v)

  public inline fun glVertexAttribs1svNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS1SVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs1svNV(), index,
      count, v)

  public inline fun glVertexAttribs2dvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS2DVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs2dvNV(), index,
      count, v)

  public inline fun glVertexAttribs2fvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS2FVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs2fvNV(), index,
      count, v)

  public inline fun glVertexAttribs2svNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS2SVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs2svNV(), index,
      count, v)

  public inline fun glVertexAttribs3dvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS3DVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs3dvNV(), index,
      count, v)

  public inline fun glVertexAttribs3fvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS3FVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs3fvNV(), index,
      count, v)

  public inline fun glVertexAttribs3svNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS3SVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs3svNV(), index,
      count, v)

  public inline fun glVertexAttribs4dvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS4DVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs4dvNV(), index,
      count, v)

  public inline fun glVertexAttribs4fvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS4FVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs4fvNV(), index,
      count, v)

  public inline fun glVertexAttribs4svNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS4SVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs4svNV(), index,
      count, v)

  public inline fun glVertexAttribs4ubvNV(
    index: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVERTEXATTRIBS4UBVNVPROC.invoke(GLCore.glad_debug_glVertexAttribs4ubvNV(), index,
      count, v)

  public inline fun glVertexBindingDivisor(bindingindex: Int, divisor: Int): Unit =
      PFNGLVERTEXBINDINGDIVISORPROC.invoke(GLCore.glad_debug_glVertexBindingDivisor(), bindingindex,
      divisor)

  public inline fun glVertexP2ui(type: Int, `value`: Int): Unit =
      PFNGLVERTEXP2UIPROC.invoke(GLCore.glad_debug_glVertexP2ui(), type, value)

  public inline fun glVertexP2uiv(type: Int, `value`: MemorySegment): Unit =
      PFNGLVERTEXP2UIVPROC.invoke(GLCore.glad_debug_glVertexP2uiv(), type, value)

  public inline fun glVertexP3ui(type: Int, `value`: Int): Unit =
      PFNGLVERTEXP3UIPROC.invoke(GLCore.glad_debug_glVertexP3ui(), type, value)

  public inline fun glVertexP3uiv(type: Int, `value`: MemorySegment): Unit =
      PFNGLVERTEXP3UIVPROC.invoke(GLCore.glad_debug_glVertexP3uiv(), type, value)

  public inline fun glVertexP4ui(type: Int, `value`: Int): Unit =
      PFNGLVERTEXP4UIPROC.invoke(GLCore.glad_debug_glVertexP4ui(), type, value)

  public inline fun glVertexP4uiv(type: Int, `value`: MemorySegment): Unit =
      PFNGLVERTEXP4UIVPROC.invoke(GLCore.glad_debug_glVertexP4uiv(), type, value)

  public inline fun glVertexPointer(
    size: Int,
    type: Int,
    stride: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXPOINTERPROC.invoke(GLCore.glad_debug_glVertexPointer(), size, type, stride,
      pointer)

  public inline fun glVertexPointerEXT(
    size: Int,
    type: Int,
    stride: Int,
    count: Int,
    pointer: MemorySegment,
  ): Unit = PFNGLVERTEXPOINTEREXTPROC.invoke(GLCore.glad_debug_glVertexPointerEXT(), size, type,
      stride, count, pointer)

  public inline fun glViewport(
    x: Int,
    y: Int,
    width: Int,
    height: Int,
  ): Unit = PFNGLVIEWPORTPROC.invoke(GLCore.glad_debug_glViewport(), x, y, width, height)

  public inline fun glViewportArrayv(
    first: Int,
    count: Int,
    v: MemorySegment,
  ): Unit = PFNGLVIEWPORTARRAYVPROC.invoke(GLCore.glad_debug_glViewportArrayv(), first, count, v)

  public inline fun glViewportIndexedf(
    index: Int,
    x: Float,
    y: Float,
    w: Float,
    h: Float,
  ): Unit = PFNGLVIEWPORTINDEXEDFPROC.invoke(GLCore.glad_debug_glViewportIndexedf(), index, x, y, w,
      h)

  public inline fun glViewportIndexedfv(index: Int, v: MemorySegment): Unit =
      PFNGLVIEWPORTINDEXEDFVPROC.invoke(GLCore.glad_debug_glViewportIndexedfv(), index, v)

  public inline fun glWaitSync(
    sync: MemorySegment,
    flags: Int,
    timeout: Long,
  ): Unit = PFNGLWAITSYNCPROC.invoke(GLCore.glad_debug_glWaitSync(), sync, flags, timeout)

  public inline fun glWindowPos2d(x: Double, y: Double): Unit =
      PFNGLWINDOWPOS2DPROC.invoke(GLCore.glad_debug_glWindowPos2d(), x, y)

  public inline fun glWindowPos2dARB(x: Double, y: Double): Unit =
      PFNGLWINDOWPOS2DARBPROC.invoke(GLCore.glad_debug_glWindowPos2dARB(), x, y)

  public inline fun glWindowPos2dMESA(x: Double, y: Double): Unit =
      PFNGLWINDOWPOS2DMESAPROC.invoke(GLCore.glad_debug_glWindowPos2dMESA(), x, y)

  public inline fun glWindowPos2dv(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2DVPROC.invoke(GLCore.glad_debug_glWindowPos2dv(), v)

  public inline fun glWindowPos2dvARB(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2DVARBPROC.invoke(GLCore.glad_debug_glWindowPos2dvARB(), v)

  public inline fun glWindowPos2dvMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2DVMESAPROC.invoke(GLCore.glad_debug_glWindowPos2dvMESA(), v)

  public inline fun glWindowPos2f(x: Float, y: Float): Unit =
      PFNGLWINDOWPOS2FPROC.invoke(GLCore.glad_debug_glWindowPos2f(), x, y)

  public inline fun glWindowPos2fARB(x: Float, y: Float): Unit =
      PFNGLWINDOWPOS2FARBPROC.invoke(GLCore.glad_debug_glWindowPos2fARB(), x, y)

  public inline fun glWindowPos2fMESA(x: Float, y: Float): Unit =
      PFNGLWINDOWPOS2FMESAPROC.invoke(GLCore.glad_debug_glWindowPos2fMESA(), x, y)

  public inline fun glWindowPos2fv(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2FVPROC.invoke(GLCore.glad_debug_glWindowPos2fv(), v)

  public inline fun glWindowPos2fvARB(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2FVARBPROC.invoke(GLCore.glad_debug_glWindowPos2fvARB(), v)

  public inline fun glWindowPos2fvMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2FVMESAPROC.invoke(GLCore.glad_debug_glWindowPos2fvMESA(), v)

  public inline fun glWindowPos2i(x: Int, y: Int): Unit =
      PFNGLWINDOWPOS2IPROC.invoke(GLCore.glad_debug_glWindowPos2i(), x, y)

  public inline fun glWindowPos2iARB(x: Int, y: Int): Unit =
      PFNGLWINDOWPOS2IARBPROC.invoke(GLCore.glad_debug_glWindowPos2iARB(), x, y)

  public inline fun glWindowPos2iMESA(x: Int, y: Int): Unit =
      PFNGLWINDOWPOS2IMESAPROC.invoke(GLCore.glad_debug_glWindowPos2iMESA(), x, y)

  public inline fun glWindowPos2iv(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2IVPROC.invoke(GLCore.glad_debug_glWindowPos2iv(), v)

  public inline fun glWindowPos2ivARB(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2IVARBPROC.invoke(GLCore.glad_debug_glWindowPos2ivARB(), v)

  public inline fun glWindowPos2ivMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2IVMESAPROC.invoke(GLCore.glad_debug_glWindowPos2ivMESA(), v)

  public inline fun glWindowPos2s(x: Short, y: Short): Unit =
      PFNGLWINDOWPOS2SPROC.invoke(GLCore.glad_debug_glWindowPos2s(), x, y)

  public inline fun glWindowPos2sARB(x: Short, y: Short): Unit =
      PFNGLWINDOWPOS2SARBPROC.invoke(GLCore.glad_debug_glWindowPos2sARB(), x, y)

  public inline fun glWindowPos2sMESA(x: Short, y: Short): Unit =
      PFNGLWINDOWPOS2SMESAPROC.invoke(GLCore.glad_debug_glWindowPos2sMESA(), x, y)

  public inline fun glWindowPos2sv(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2SVPROC.invoke(GLCore.glad_debug_glWindowPos2sv(), v)

  public inline fun glWindowPos2svARB(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2SVARBPROC.invoke(GLCore.glad_debug_glWindowPos2svARB(), v)

  public inline fun glWindowPos2svMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS2SVMESAPROC.invoke(GLCore.glad_debug_glWindowPos2svMESA(), v)

  public inline fun glWindowPos3d(
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLWINDOWPOS3DPROC.invoke(GLCore.glad_debug_glWindowPos3d(), x, y, z)

  public inline fun glWindowPos3dARB(
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLWINDOWPOS3DARBPROC.invoke(GLCore.glad_debug_glWindowPos3dARB(), x, y, z)

  public inline fun glWindowPos3dMESA(
    x: Double,
    y: Double,
    z: Double,
  ): Unit = PFNGLWINDOWPOS3DMESAPROC.invoke(GLCore.glad_debug_glWindowPos3dMESA(), x, y, z)

  public inline fun glWindowPos3dv(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3DVPROC.invoke(GLCore.glad_debug_glWindowPos3dv(), v)

  public inline fun glWindowPos3dvARB(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3DVARBPROC.invoke(GLCore.glad_debug_glWindowPos3dvARB(), v)

  public inline fun glWindowPos3dvMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3DVMESAPROC.invoke(GLCore.glad_debug_glWindowPos3dvMESA(), v)

  public inline fun glWindowPos3f(
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLWINDOWPOS3FPROC.invoke(GLCore.glad_debug_glWindowPos3f(), x, y, z)

  public inline fun glWindowPos3fARB(
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLWINDOWPOS3FARBPROC.invoke(GLCore.glad_debug_glWindowPos3fARB(), x, y, z)

  public inline fun glWindowPos3fMESA(
    x: Float,
    y: Float,
    z: Float,
  ): Unit = PFNGLWINDOWPOS3FMESAPROC.invoke(GLCore.glad_debug_glWindowPos3fMESA(), x, y, z)

  public inline fun glWindowPos3fv(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3FVPROC.invoke(GLCore.glad_debug_glWindowPos3fv(), v)

  public inline fun glWindowPos3fvARB(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3FVARBPROC.invoke(GLCore.glad_debug_glWindowPos3fvARB(), v)

  public inline fun glWindowPos3fvMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3FVMESAPROC.invoke(GLCore.glad_debug_glWindowPos3fvMESA(), v)

  public inline fun glWindowPos3i(
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLWINDOWPOS3IPROC.invoke(GLCore.glad_debug_glWindowPos3i(), x, y, z)

  public inline fun glWindowPos3iARB(
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLWINDOWPOS3IARBPROC.invoke(GLCore.glad_debug_glWindowPos3iARB(), x, y, z)

  public inline fun glWindowPos3iMESA(
    x: Int,
    y: Int,
    z: Int,
  ): Unit = PFNGLWINDOWPOS3IMESAPROC.invoke(GLCore.glad_debug_glWindowPos3iMESA(), x, y, z)

  public inline fun glWindowPos3iv(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3IVPROC.invoke(GLCore.glad_debug_glWindowPos3iv(), v)

  public inline fun glWindowPos3ivARB(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3IVARBPROC.invoke(GLCore.glad_debug_glWindowPos3ivARB(), v)

  public inline fun glWindowPos3ivMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3IVMESAPROC.invoke(GLCore.glad_debug_glWindowPos3ivMESA(), v)

  public inline fun glWindowPos3s(
    x: Short,
    y: Short,
    z: Short,
  ): Unit = PFNGLWINDOWPOS3SPROC.invoke(GLCore.glad_debug_glWindowPos3s(), x, y, z)

  public inline fun glWindowPos3sARB(
    x: Short,
    y: Short,
    z: Short,
  ): Unit = PFNGLWINDOWPOS3SARBPROC.invoke(GLCore.glad_debug_glWindowPos3sARB(), x, y, z)

  public inline fun glWindowPos3sMESA(
    x: Short,
    y: Short,
    z: Short,
  ): Unit = PFNGLWINDOWPOS3SMESAPROC.invoke(GLCore.glad_debug_glWindowPos3sMESA(), x, y, z)

  public inline fun glWindowPos3sv(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3SVPROC.invoke(GLCore.glad_debug_glWindowPos3sv(), v)

  public inline fun glWindowPos3svARB(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3SVARBPROC.invoke(GLCore.glad_debug_glWindowPos3svARB(), v)

  public inline fun glWindowPos3svMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS3SVMESAPROC.invoke(GLCore.glad_debug_glWindowPos3svMESA(), v)

  public inline fun glWindowPos4dMESA(
    x: Double,
    y: Double,
    z: Double,
    w: Double,
  ): Unit = PFNGLWINDOWPOS4DMESAPROC.invoke(GLCore.glad_debug_glWindowPos4dMESA(), x, y, z, w)

  public inline fun glWindowPos4dvMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS4DVMESAPROC.invoke(GLCore.glad_debug_glWindowPos4dvMESA(), v)

  public inline fun glWindowPos4fMESA(
    x: Float,
    y: Float,
    z: Float,
    w: Float,
  ): Unit = PFNGLWINDOWPOS4FMESAPROC.invoke(GLCore.glad_debug_glWindowPos4fMESA(), x, y, z, w)

  public inline fun glWindowPos4fvMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS4FVMESAPROC.invoke(GLCore.glad_debug_glWindowPos4fvMESA(), v)

  public inline fun glWindowPos4iMESA(
    x: Int,
    y: Int,
    z: Int,
    w: Int,
  ): Unit = PFNGLWINDOWPOS4IMESAPROC.invoke(GLCore.glad_debug_glWindowPos4iMESA(), x, y, z, w)

  public inline fun glWindowPos4ivMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS4IVMESAPROC.invoke(GLCore.glad_debug_glWindowPos4ivMESA(), v)

  public inline fun glWindowPos4sMESA(
    x: Short,
    y: Short,
    z: Short,
    w: Short,
  ): Unit = PFNGLWINDOWPOS4SMESAPROC.invoke(GLCore.glad_debug_glWindowPos4sMESA(), x, y, z, w)

  public inline fun glWindowPos4svMESA(v: MemorySegment): Unit =
      PFNGLWINDOWPOS4SVMESAPROC.invoke(GLCore.glad_debug_glWindowPos4svMESA(), v)
}
