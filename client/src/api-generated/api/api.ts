import { BasicErrorControllerApi } from './BasicErrorControllerApi';
import { PlateEntityApi } from './PlateEntityApi';
import { ProfileControllerApi } from './ProfileControllerApi';

export * from './BasicErrorControllerApi';
export * from './PlateEntityApi';
export * from './ProfileControllerApi';

export const APIS = [BasicErrorControllerApi, PlateEntityApi, ProfileControllerApi];
