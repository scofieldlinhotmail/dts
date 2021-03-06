package tianci.pinao.dts.service;

import java.util.List;

import tianci.pinao.dts.models.Area;
import tianci.pinao.dts.models.AreaChannel;
import tianci.pinao.dts.models.AreaHardwareConfig;
import tianci.pinao.dts.models.AreaTempConfig;
import tianci.pinao.dts.models.Channel;
import tianci.pinao.dts.models.Machine;

public interface AreaService {

	public List<Area> getAllAreas();

	public boolean addArea(Area area, int userid);

	public boolean updateArea(Area area, int userid);

	public boolean deleteArea(Area area, int userid);

	public List<AreaHardwareConfig> getAllHardwareConfigs();

	public boolean addHardwareConfig(AreaHardwareConfig config, int userid);

	public boolean updateHardwareConfig(AreaHardwareConfig config, int userid);

	public boolean deleteHardwareConfig(AreaHardwareConfig config, int userid);

	public List<AreaTempConfig> getAllTempConfigs();

	public boolean addAreaTempConfig(AreaTempConfig config, int userid);

	public boolean updateAreaTempConfig(AreaTempConfig config, int userid);

	public boolean deleteAreaTempConfig(AreaTempConfig config, int userid);

	public List<AreaChannel> getAllAreaChannels();

	public boolean addAreaChannel(List<AreaChannel> channels, int userid);

	public boolean updateAreaChannel(AreaChannel channel, int userid);

	public boolean deleteAreaChannel(AreaChannel channel, int userid);

	public List<Channel> getAllChannels();

	public boolean addChannel(Channel channel, int userid);

	public boolean updateChannel(Channel channel, int userid);

	public boolean deleteChannel(Channel channel, int userid);

	public List<Machine> getAllMachines();

	public boolean addMachine(Machine machine, int userid);

	public boolean updateMachine(Machine machine, int userid);

	public boolean deleteMachine(Machine machine, int userid);
}
