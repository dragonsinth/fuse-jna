package net.fusejna.util;

import java.io.File;
import java.nio.ByteBuffer;

import net.fusejna.DirectoryFiller;
import net.fusejna.ErrorCodes;
import net.fusejna.FuseFilesystem;
import net.fusejna.StructFuseFileInfo.FileInfoWrapper;
import net.fusejna.StructStat.StatWrapper;
import net.fusejna.types.TypeMode.ModeWrapper;

public abstract class FuseFilesystemAdapterFull extends FuseFilesystem
{
	@Override
	public void afterUnmount(final File mountPoint)
	{
	}

	@Override
	public void beforeUnmount(final File mountPoint)
	{
	}

	@Override
	public void destroy()
	{
	}

	@Override
	public int fgetattr(final String path, final StatWrapper stat, final FileInfoWrapper info)
	{
		return getattr(path, stat);
	}

	@Override
	public int getattr(final String path, final StatWrapper stat)
	{
		return ErrorCodes.ENOSYS;
	}

	@Override
	protected String getName()
	{
		return null;
	}

	@Override
	protected String[] getOptions()
	{
		return null;
	}

	@Override
	public void init()
	{
	}

	@Override
	public int mkdir(final String path, final ModeWrapper modeWrapper)
	{
		return 0;
	}

	@Override
	public int mknod(final String path, final ModeWrapper modeWrapper, final long dev)
	{
		return 0;
	}

	@Override
	public void onMount(final File mountPoint)
	{
	}

	@Override
	public int open(final String path, final FileInfoWrapper info)
	{
		return 0;
	}

	@Override
	public int read(final String path, final ByteBuffer buffer, final long size, final long offset, final FileInfoWrapper info)
	{
		return 0;
	}

	@Override
	public int readdir(final String path, final DirectoryFiller filler)
	{
		return 0;
	}

	@Override
	public int readlink(final String path, final ByteBuffer buffer, final long size)
	{
		return 0;
	}

	@Override
	public int rmdir(final String path)
	{
		return 0;
	}

	@Override
	public int symlink(final String path, final String target)
	{
		return 0;
	}

	@Override
	public int unlink(final String path)
	{
		return 0;
	}
}
